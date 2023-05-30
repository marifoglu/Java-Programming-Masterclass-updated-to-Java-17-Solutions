package src.main.java.Section_07_OOP_Part_2_Polymophism.CodingExercise40;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
