package labtask07.task3;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 3 =====");

        // Original inheritance problem

        System.out.println("\nOriginal Design:");

        Rectangle rectangle = new Square();

        try {

            rectangle.setDimensions(5, 10);

            System.out.println(
                    "Area: " + rectangle.getArea());

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }


        // Fixed design using Shape interface

        System.out.println("\nFixed Design:");

        Shape rectangleShape =
                new RectangleShape(5, 10);

        Shape squareShape =
                new SquareShape(5);

        System.out.println(
                "Rectangle Area: "
                + rectangleShape.getArea());

        System.out.println(
                "Square Area: "
                + squareShape.getArea());

    }
}