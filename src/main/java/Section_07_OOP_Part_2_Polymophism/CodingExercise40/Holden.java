package src.main.java.Section_07_OOP_Part_2_Polymophism.CodingExercise40;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
