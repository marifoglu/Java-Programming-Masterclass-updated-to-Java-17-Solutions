package src.main.java.Section_07_OOP_Part_2_Polymophism.CodingExercise40;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
