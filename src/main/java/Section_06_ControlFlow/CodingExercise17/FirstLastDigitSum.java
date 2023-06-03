package Section_06_ControlFlow.CodingExercise17;

public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int number){

        if (number <0){
            return -1;
        }
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number !=0){
            firstDigit = number %10;
            number /= 10;
        }

        sum = firstDigit +lastDigit;
        return sum;
    }
}