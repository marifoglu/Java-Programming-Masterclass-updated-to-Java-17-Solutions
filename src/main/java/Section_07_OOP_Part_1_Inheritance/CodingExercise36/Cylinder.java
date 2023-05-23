package src.main.java.Section_07_OOP_Part_1_Inheritance.CodingExercise36;

public class Cylinder extends Section_07_OOP_Part_1_Inheritance.CodingExercise36.Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}