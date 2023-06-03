package Section_06_ControlFlow.CodingExercise16;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int reversedNumber = 0;
        int remainder = 0;
        int originalNumber = number;

        while (number != 0){
            remainder = number %10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber){
            return true;
        }else {
            return false;
        }
    }
}