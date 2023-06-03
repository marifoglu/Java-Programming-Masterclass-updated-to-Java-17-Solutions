package Section_05_ExpressionsStatementsAndMore.CodingExercise06;

public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){

        int newOne  = (int) (one * 1000);
        int newTwo  = (int) (two * 1000);

        if (newOne == newTwo){
            return true;
        }else{
            return false;
        }
    }
}