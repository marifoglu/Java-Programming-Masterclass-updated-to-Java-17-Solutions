package Section_05_ExpressionsStatementsAndMore.CodingExercise12;

public class PlayingCat {
    // write your code here
    public static boolean isCatPlaying(boolean summer, int temperature){

        if (summer == true){
            if (temperature <= 45 && temperature >= 25){
                return true;
            }else {
                return false;
            }
        }else {
            if (temperature <= 35 && temperature >= 25){
                return true;
            }else {
                return false;
            }
        }
    }
}