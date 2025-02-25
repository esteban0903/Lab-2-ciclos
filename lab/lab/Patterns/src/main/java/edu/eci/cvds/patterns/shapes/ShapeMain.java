package edu.eci.cvds.patterns.shapes;
/**
 * Class ShapeMain
 * 
 * The main entry point for testing the ShapeFactory.
 */
public class ShapeMain {
  /**
    * Main method to create and display a shape based on user input.
    * 
    * @param args Command-line arguments; expects one argument of type RegularShapeType.
    */
  public static void main(String[] args) {
    if (args == null || args.length != 1) {
      System.err.println("Parameter of type RegularShapeType is required.");
      return;
    }
    try {
      RegularShapeType type = RegularShapeType.valueOf(args[0]);
      Shape shape = ShapeFactory.create(type);
      System.out.println(
        String.format(
          "Successfully created a %s with %s sides.",
          type,
          shape.getNumberOfEdges()
        )
      );
    } catch (IllegalArgumentException ex) {
      System.err.println(
        "Parameter '" + args[0] + "' is not a valid RegularShapeType"
      );
      return;
    }
  }
}