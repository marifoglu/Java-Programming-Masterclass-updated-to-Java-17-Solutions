package Section_06_ControlFlow.CodingExercise28;

import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }

        long average = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }
}