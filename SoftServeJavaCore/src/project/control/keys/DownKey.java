package project.control.keys;

import javafx.scene.input.KeyCode;
import project.control.algorithm.Coordinate;

public enum DownKey implements Moveable {
    INSTANCE;

    public static final KeyCode CODE = KeyCode.DOWN;

    @Override
    public boolean canMove(Coordinate nullPointXY) {
        return (nullPointXY.getX() > 0);
    }

    @Override
    public Coordinate calcMovingBrickCoordinate(Coordinate nullPointXY) {
        return new Coordinate(nullPointXY.getX() - 1, nullPointXY.getY());
    }
}
