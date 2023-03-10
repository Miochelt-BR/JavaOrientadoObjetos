package util;

public class Calculator {
    //NAME FORMAT FOR ALWAYS UPPER CASE CONSTANT//
    // I can't have one static method inside the other//
    public  final double PI = 3.14159;

    // Method followed by function//

    public  double circumference (double radius) {
        return 2 * PI * radius;
    }

    public  double volume (double radius) {
        return 4.0 * PI* radius * radius*radius /3.0;
    }
}
