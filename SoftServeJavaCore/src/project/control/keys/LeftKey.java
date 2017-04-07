package project.control.keys;

import javafx.scene.input.KeyCode;
import project.control.CanvasController;
import project.control.algorithm.Coordinate;

public enum LeftKey implements Moveable {
    INSTANCE;

    public static final KeyCode CODE = KeyCode.LEFT;

    @Override
    public boolean canMove(Coordinate nullPointXY) {
        return (nullPointXY.getY() < (CanvasController.getColumns() - 1));
    }

    @Override
    public Coordinate calcMovingBrickCoordinate(Coordinate nullPointXY) {
        return new Coordinate(nullPointXY.getX(), nullPointXY.getY() + 1);
    }
}
