package project.control.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    private ArrayList<Matrix> openList;
    private ArrayList<Matrix> closeList;
    private Matrix matrix;

    public A(int[][] matrixArray) {
        this.openList = new ArrayList<>();
        this.closeList = new ArrayList<>();
        this.matrix = new Matrix(matrixArray);
    }

    public List<Matrix> callAlgorithmA() {
        openList.add(matrix);
        Collections.sort(openList);

        while(matrix.getH() != 0) {
            matrix = openList.get(0);
            openList.remove(0);
            closeList.add(matrix);

            openList.addAll(matrix.calcNextMatrices());
            Collections.sort(openList);
        }

        return calcShortestWay(matrix, matrix.getG(), new ArrayList<>());
    }

    private List<Matrix> calcShortestWay(Matrix m, int nodes, List<Matrix> matrices) {
        if (nodes == 0) {
            matrices.add(m);
        } else {
            calcShortestWay(m.getLastMatrix(), nodes - 1, matrices);
            matrices.add(m);
        }

        return matrices;
    }
}
