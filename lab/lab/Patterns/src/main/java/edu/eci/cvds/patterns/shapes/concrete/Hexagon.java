package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Class Hexagon
 * 
 * Represents a hexagon shape with six edges.
 */
public class Hexagon implements Shape {
    /**
     * Returns the number of edges of the hexagon.
     * 
     * @return The number of edges, which is 6.
     */
    public int getNumberOfEdges() {
        return 6;
    }
}
