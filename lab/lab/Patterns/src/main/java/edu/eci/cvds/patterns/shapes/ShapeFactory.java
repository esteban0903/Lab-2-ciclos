package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;
/**
 * Class ShapeFactory
 * 
 * Implements a factory pattern to create instances of regular geometric shapes.
 */
public class ShapeFactory{
    /**
     * Creates and returns an instance of a regular geometric shape based on the provided type.
     * 
     * @param shape The type of geometric shape to create.
     * @return An instance of the corresponding geometric shape.
     * @throws IllegalArgumentException If the shape type is invalid.
     */
    public static Shape create(RegularShapeType shape ) throws IllegalArgumentException {
        switch (shape){
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                throw new IllegalArgumentException("Invalid RegularShapeType: " + shape);
        }
    }
}