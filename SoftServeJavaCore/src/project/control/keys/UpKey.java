package project.control.keys;

import javafx.scene.input.KeyCode;
import project.control.CanvasController;
import project.control.algorithm.Coordinate;

public enum UpKey implements Moveable {
    INSTANCE;

    public static final KeyCode CODE = KeyCode.UP;

    @Override
    public boolean canMove(Coordinate nullPointXY) {
        return (nullPointXY.getX() < (CanvasController.getRows() - 1));
    }

    @Override
    public Coordinate calcMovingBrickCoordinate(Coordinate nullPointXY) {
        return new Coordinate(nullPointXY.getX() + 1, nullPointXY.getY());
    }
}
