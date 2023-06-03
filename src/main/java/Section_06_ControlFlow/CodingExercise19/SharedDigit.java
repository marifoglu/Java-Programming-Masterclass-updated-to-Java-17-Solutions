package Section_06_ControlFlow.CodingExercise19;

public class SharedDigit {
    // write your code here

    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 ||  num1 > 99 || num2 <10 || num2 > 99){
            return false;
        }
        int num1DigitFirst = 0;
        int num1DigitLast = num1 % 10;
        int num2DigitFirst = 0;
        int num2DigitLast = num2 % 10;

        while (num1 != 0){
            num1DigitFirst = num1 % 10;
            num1 /= 10;
        }
        while (num2 != 0){
            num2DigitFirst = num2 % 10;
            num2 /= 10;
        }
        if (num1DigitFirst == num2DigitFirst || num1DigitFirst == num2DigitLast || num1DigitLast == num2DigitFirst || num1DigitLast == num2DigitLast){
            return true;
        }else {
            return false;
        }
    }
}