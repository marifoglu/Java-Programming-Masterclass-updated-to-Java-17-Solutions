package Section_09_Arrays.CodingExercise43;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[count];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


