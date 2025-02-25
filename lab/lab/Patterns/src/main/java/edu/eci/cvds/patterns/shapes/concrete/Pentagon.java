package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Class Pentagon
 * 
 * Represents a pentagon shape with five edges.
 */
public class Pentagon implements Shape {
    /**
     * Returns the number of edges of the pentagon.
     * 
     * @return The number of edges, which is 5.
     */
    public int getNumberOfEdges() {
        return 5;
    }
}