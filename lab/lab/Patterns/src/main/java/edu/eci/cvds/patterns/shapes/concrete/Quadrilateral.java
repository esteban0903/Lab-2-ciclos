package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Class Quadrilateral
 * 
 * Represents a quadrilateral shape with four edges.
 */
public class Quadrilateral implements Shape {
    /**
     * Returns the number of edges of the quadrilateral.
     * 
     * @return The number of edges, which is 4.
     */
    public int getNumberOfEdges() {
        return 4;
    }
}