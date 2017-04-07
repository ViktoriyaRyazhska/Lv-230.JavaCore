package project.control;

import project.control.algorithm.Matrix;
import javafx.scene.control.Label;
import project.control.algorithm.Coordinate;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CanvasController {
    private static int rows;
    private static int columns;
    private static int stepsCounter = 0;
    private Coordinate nullLabel;
    private Label[][] labelMatrix;
    private int[][] integerMatrix;

    CanvasController(Label... labels) {
        columns = rows = (int) Math.sqrt(labels.length);
        labelMatrix = new Label[rows][columns];
        initLabelMatrix(labels);
        initLabelsName();
        initNullLabelCoordinate();
        integerMatrix = new int[rows][columns];
        updateIntegerMatrix();
    }

    private void initLabelMatrix(Label... labels) {
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                labelMatrix[i][j] = labels[counter];
                counter++;
            }
        }
    }

    private void initLabelsName() {
        List<String> matrices = loadMatrices();

        Collections.shuffle(matrices);

        String[] elements = matrices.get(0).split(" ");

        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                labelMatrix[i][j].setText(elements[counter]);
                counter++;
            }
        }
    }

    private List<String> loadMatrices() {
        List<String> matrices = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/project/view/resources/matrices.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                matrices.add(s);
            }
        } catch (IOException ioe) {
            System.err.println("Can`t read matrices.txt file");
        }

        return matrices;
    }

    private void initNullLabelCoordinate() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ("0".equals(labelMatrix[i][j].getText())) {
                    labelMatrix[i][j].setVisible(false);
                    nullLabel = new Coordinate(i, j);
                    return;
                }
            }
        }
    }

    public Coordinate calcMovingBrickCoordinate(List<Matrix> list) {
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < columns; k++) {
                if ("0".equals(String.valueOf(list.get(1).getMatrixArray()[j][k]))) {
                    return new Coordinate(j, k);
                }
            }
        }
        return null;
    }

    public void changeMatrices(Coordinate movingBrickCoordinate) {
        changeLabelsNames(movingBrickCoordinate);
        changeVisibility(movingBrickCoordinate);
        changeNullLabelCoordinates(movingBrickCoordinate);
        updateIntegerMatrix();
    }

    private void changeLabelsNames(Coordinate movingBrickCoordinate) {
        String movingLabelText = labelMatrix[movingBrickCoordinate.getX()][movingBrickCoordinate.getY()].getText();
        labelMatrix[nullLabel.getX()][nullLabel.getY()].setText(movingLabelText);
        labelMatrix[movingBrickCoordinate.getX()][movingBrickCoordinate.getY()].setText("0");
    }

    private void changeVisibility(Coordinate movingBrickCoordinate) {
        labelMatrix[nullLabel.getX()][nullLabel.getY()].setVisible(true);
        labelMatrix[movingBrickCoordinate.getX()][movingBrickCoordinate.getY()].setVisible(false);
    }

    private void changeNullLabelCoordinates(Coordinate movingBrickCoordinate) {
        nullLabel.setX(movingBrickCoordinate.getX());
        nullLabel.setY(movingBrickCoordinate.getY());
    }

    private void updateIntegerMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                integerMatrix[i][j] = Integer.parseInt(labelMatrix[i][j].getText());
            }
        }
    }

    public void updateSteps(Label userStepsLabel) {
        stepsCounter++;
        userStepsLabel.setText("Step: " + stepsCounter);
    }

    public Coordinate getNullLabel() {
        return nullLabel;
    }

    public static int getRows() {
        return rows;
    }

    public static int getColumns() {
        return columns;
    }

    public int[][] getIntegerMatrix() {
        return integerMatrix;
    }
}
