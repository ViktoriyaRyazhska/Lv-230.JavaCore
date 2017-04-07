package project.control.keys;

import javafx.scene.input.KeyCode;
import project.control.algorithm.Coordinate;

public enum RightKey implements Moveable {
    INSTANCE;

    public static final KeyCode CODE = KeyCode.RIGHT;

    @Override
    public boolean canMove(Coordinate nullPointXY) {
        return (nullPointXY.getY() > 0);
    }

    @Override
    public Coordinate calcMovingBrickCoordinate(Coordinate nullPointXY) {
        return new Coordinate(nullPointXY.getX(), nullPointXY.getY() - 1);
    }
}
