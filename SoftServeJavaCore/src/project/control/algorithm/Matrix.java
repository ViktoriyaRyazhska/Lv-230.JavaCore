package project.control.algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class Matrix implements Comparable<Matrix> {
    private int[][] matrixArray;
    private int g;
    private int h;
    private int f;
    private ArrayList<Matrix> nextMatricesList;
    private Coordinate coordinatesNullPointer;
    private int valueOfLastPoint;
    private Matrix lastMatrix;
    private HashMap<Integer, Coordinate> finalValuesCoordinate;

    public Matrix(int[][] matrixArray) {
        this.matrixArray = matrixArray;
        this.finalValuesCoordinate = new HashMap<>();
        this.nextMatricesList = new ArrayList<>();
        insertFinalMap(finalValuesCoordinate);
        this.coordinatesNullPointer = calcNullPointerCoordinates();
        this.lastMatrix = null;
        insertH();
        this.f = this.h + this.g;
    }

    public Matrix(int[][] matrixArray, Matrix lastMatrix, int valueOfLastPoint, int g) {
        this.matrixArray = matrixArray;
        this.finalValuesCoordinate = new HashMap<>();
        this.nextMatricesList = new ArrayList<>();
        insertFinalMap(finalValuesCoordinate);
        this.coordinatesNullPointer = calcNullPointerCoordinates();
        this.valueOfLastPoint = valueOfLastPoint;
        this.lastMatrix = lastMatrix;
        insertH();
        this.g = g;
        insertF();
    }

    private void insertF() {
        this.f = this.h + this.g;
    }

    public void insertH() {
        this.h = 0;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                if (matrixArray[i][j] != 0) {
                    Coordinate coordinates = finalValuesCoordinate.get(matrixArray[i][j]);
                    this.h += Math.abs(coordinates.getX() - i) + Math.abs(coordinates.getY() - j);
                }
            }
        }
    }

    private void insertFinalMap(HashMap<Integer, Coordinate> map) {
        int counter = 1;

        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                map.put(counter, new Coordinate(i, j));
                counter++;
            }
        }
    }

    private Coordinate calcNullPointerCoordinates() {
        Coordinate c = null;
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                if (matrixArray[i][j] == 0) {
                    c = new Coordinate(i, j);
                }
            }
        }
        return c;
    }

    private Matrix createNewMatrix(int[][] matrix, Coordinate coordinatesNullPointer, Coordinate changePoint) {
        int[][] copyMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, copyMatrix[i], 0, matrix[i].length);
        }

        int nullPointerX = coordinatesNullPointer.getX();
        int nullPointerY = coordinatesNullPointer.getY();
        int changePointX = changePoint.getX();
        int changePointY = changePoint.getY();

        int valueOfLastPoint = copyMatrix[changePointX][changePointY];
        int nextG = getG();
        nextG++;

        int tmp = copyMatrix[nullPointerX][nullPointerY];
        copyMatrix[nullPointerX][nullPointerY] = copyMatrix[changePointX][changePointY];
        copyMatrix[changePointX][changePointY] = tmp;

        return new Matrix(copyMatrix, this, valueOfLastPoint, nextG);
    }

    public ArrayList<Matrix> calcNextMatrices() {

        int x = coordinatesNullPointer.getX();
        int y = coordinatesNullPointer.getY();

        if (((x + 1) <= 2) && matrixArray[x + 1][y] != valueOfLastPoint) {
            nextMatricesList.add(createNewMatrix(matrixArray, coordinatesNullPointer, new Coordinate(x + 1, y)));
        }
        if (((x - 1) >= 0) && matrixArray[x - 1][y] != valueOfLastPoint) {
            nextMatricesList.add(createNewMatrix(matrixArray, coordinatesNullPointer, new Coordinate(x - 1, y)));
        }
        if (((y + 1) <= 2) && matrixArray[x][y + 1] != valueOfLastPoint) {
            nextMatricesList.add(createNewMatrix(matrixArray, coordinatesNullPointer, new Coordinate(x, y + 1)));
        }
        if (((y - 1) >= 0) && matrixArray[x][y - 1] != valueOfLastPoint) {
            nextMatricesList.add(createNewMatrix(matrixArray, coordinatesNullPointer, new Coordinate(x, y - 1)));
        }
        return nextMatricesList;
    }

    public int getG() {
        return this.g;
    }

    public int getH() {
        return h;
    }

    public int getF() {
        return this.f;
    }

    public Matrix getLastMatrix() {
        return this.lastMatrix;
    }

    public int[][] getMatrixArray() {
        return matrixArray;
    }

    @Override
    public int compareTo(Matrix o) {
        if (this.getF() < o.getF()) {
            return -1;
        } else if (this.getF() > o.getF()) {
            return 1;
        } else if (this.getH() < o.getH()) {
            return -1;
        } else if (this.getH() > o.getH()) {
            return 1;
        } else
            return 0;
    }
}
