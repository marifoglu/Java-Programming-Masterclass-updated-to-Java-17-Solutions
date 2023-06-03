package Section_06_ControlFlow.CodingExercise22;

public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = Math.min(first, second);
        int ground = 1;

        for (int i = 2; i <= min; i++){
            if (first % i ==0 && second % i ==0){
                ground = i;
            }
        }
        return ground;
    }
}