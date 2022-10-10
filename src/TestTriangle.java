
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean filled;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle: ");
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        System.out.println("Enter the color of the triangle: ");
        input.nextLine();
        color = input.nextLine();
        System.out.println("Enter true or false if the triangle is filled or not: ");
        filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(filled);
        triangle.setColor(color);
        System.out.println("Fill: " + triangle.isFilled()
                + "; Color: " + triangle.getColor()
                + "; Area: " + triangle.getArea()
                + "; Perimeter: " + triangle.getPerimeter());
        input.close();
    }
}

