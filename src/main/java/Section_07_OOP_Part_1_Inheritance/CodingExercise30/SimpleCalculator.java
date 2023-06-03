package Section_07_OOP_Part_1_Inheritance.CodingExercise30;

public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber (double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double adding  = firstNumber + secondNumber;
        return adding ;
    }

    public double getSubtractionResult(){
        double subtracting = firstNumber - secondNumber;
        return subtracting;
    }

    public double getMultiplicationResult (){
        double multiplying   = firstNumber * secondNumber;
        return multiplying  ;
    }

    public double getDivisionResult (){
        if ( secondNumber != 0) {
            double dividing  = firstNumber / secondNumber;
            return dividing ;
        }else {
            return 0;
        }
    }
}