package Section_06_ControlFlow.CodingExercise24;

public class NumberToWords {
    // write your code here
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);

        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            String word = "";
            switch (lastDigit) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
            }
            System.out.println(word);
            reversedNumber /= 10;
        }

        if (originalDigitCount > getDigitCount(reverse(number))) {
            int numZeroes = originalDigitCount - getDigitCount(reverse(number));
            for (int i = 0; i < numZeroes; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = -number;
        }

        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        if (isNegative) {
            reversedNumber = -reversedNumber;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}