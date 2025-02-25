package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Class Triangle
 * 
 * Represents a triangle shape with three edges.
 */
public class Triangle implements Shape {
    /**
     * Returns the number of edges of the triangle.
     * 
     * @return The number of edges, which is 3.
     */
    public int getNumberOfEdges() {
        return 3;
    }
}