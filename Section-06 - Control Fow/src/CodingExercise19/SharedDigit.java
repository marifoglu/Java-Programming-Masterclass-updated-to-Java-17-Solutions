package CodingExercise19;
/*
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
 */
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