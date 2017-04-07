package project.control;

import project.control.algorithm.A;
import project.control.algorithm.Matrix;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import project.control.keys.*;

import java.util.*;

public class Controller {
    private CanvasController canvasController;
    private Map<KeyCode, Moveable> keys;
    private A algorithm;

    @FXML
    private Label leftTopLabel;
    @FXML
    private Label centerTopLabel;
    @FXML
    private Label rightTopLabel;
    @FXML
    private Label leftCenterLabel;
    @FXML
    private Label centerCenterLabel;
    @FXML
    private Label rightCenterLabel;
    @FXML
    private Label leftBottomLabel;
    @FXML
    private Label centerBottomLabel;
    @FXML
    private Label rightBottomLabel;
    @FXML
    private Label userStepsLabel;

    @FXML
    private void initialize() {
        initCanvasController();
        initKeys();
    }

    private void initCanvasController() {
        canvasController = new CanvasController(
                leftTopLabel, centerTopLabel, rightTopLabel,
                leftCenterLabel, centerCenterLabel, rightCenterLabel,
                leftBottomLabel, centerBottomLabel, rightBottomLabel
        );
    }

    private void initKeys() {
        keys = new HashMap<>();
        keys.put(UpKey.CODE, UpKey.INSTANCE);
        keys.put(DownKey.CODE, DownKey.INSTANCE);
        keys.put(RightKey.CODE, RightKey.INSTANCE);
        keys.put(LeftKey.CODE, LeftKey.INSTANCE);
    }

    @FXML
    private void handleKeyPressed(KeyEvent ke) {
        /**
         * if (ke.getCode() == KeyEvent.UP) {
         *  TODO
         * } else if
         */
        try {
            Moveable keyPressed = keys.get(ke.getCode());

            if (keyPressed.canMove(canvasController.getNullLabel())) {
                canvasController.changeMatrices(keyPressed.calcMovingBrickCoordinate(canvasController.getNullLabel()));
                canvasController.updateSteps(userStepsLabel);
            }
        } catch (NullPointerException npe) {
            System.out.println("This key doesn`t support.");
        }
    }

    @FXML
    public void buttonPressed() {
        algorithm = new A(canvasController.getIntegerMatrix());
        List<Matrix> list = algorithm.callAlgorithmA();

        try {
            canvasController.changeMatrices(canvasController.calcMovingBrickCoordinate(list));
            canvasController.updateSteps(userStepsLabel);
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("End");
        }
    }
}
