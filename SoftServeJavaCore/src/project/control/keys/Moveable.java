package project.control.keys;

import project.control.algorithm.Coordinate;

/**
 * Set the behavior to keys.
 */
public interface Moveable {

    /**
     * Check if we can move the label on the nullLabel side.
     */
    boolean canMove(Coordinate nullPointXY);

    /**
     * Get Label coordinate which user move.
     */
    Coordinate calcMovingBrickCoordinate(Coordinate nullPointXY);
}
