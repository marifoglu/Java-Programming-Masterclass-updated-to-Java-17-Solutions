package Section_09_Arrays.CodingExercise42;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){

        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integers: ");

        for (int i=0; i< size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        for(int i = 0; i<array.length/2; i++){
           int temp = sortedArray[i];
           sortedArray[i] = sortedArray[sortedArray.length -1 -i];
           sortedArray[sortedArray.length - 1 -i] = temp;
        }
        return sortedArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}

