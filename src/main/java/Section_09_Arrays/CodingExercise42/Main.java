package Section_09_Arrays.CodingExercise42;

import static Section_09_Arrays.CodingExercise42.SortedArray.*;

public class Main {
    public static void main(String[] args) {

        int[] numbers = getIntegers(5);
        int[] sortedArray = sortIntegers(numbers);
        printArray(sortedArray);
    }
}
