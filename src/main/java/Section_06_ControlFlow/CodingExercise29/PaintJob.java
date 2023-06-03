package Section_06_ControlFlow.CodingExercise29;

public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double wallArea = width * height;
        double bucketsNeed = Math.ceil(wallArea / areaPerBucket);
        int bucketsToBuy = (int) (bucketsNeed - extraBuckets);

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeed = Math.ceil(area / areaPerBucket);
        return (int) bucketsNeed;
    }
}