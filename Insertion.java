package sort;

/**
 * This class can be used to sort integer or double arrays using <b>Insertion Sort</b>.
 * This class is apart of the sort package that will contain other sorting algorithms.
 *
 * <b>Time Complexity:</b> O(n^2)
 * <b>Space Complexity:</b> O(1)
 *
 */
public class Insertion {

    /**
     * This method is used to output int arrays to console.
     * @param arr - Array to print out to the console
     */
    public static void toString(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(String.format("%s ",arr[i]));
        }
    }

    /**
     * This method is used to sort a given integer array from lowest to highest value.
     * @param - arr int array to be sorted
     * @return - returns sorted array
     */
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int num = i;
            int prevNum = i - 1;

            while (prevNum < num && num != 0){
                int temp = arr[prevNum];
                arr[prevNum] = arr[num];
                arr[num] = temp;

                num = prevNum;
                prevNum -= 1;
            }
        }
        return arr;
    }

    /**
     * This method is used to output double arrays to console.
     * @param arr - Array to print out to the console
     */
    public static void toString(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(String.format("%s ",arr[i]));
        }
    }

    /**
     * This method is used to sort a given double array from lowest to highest value.
     * @param - arr double array to be sorted
     * @return - returns sorted array
     */
    public static double[] sort(double[] arr){
        for (int i = 1; i < arr.length; i++){
            int num = i;
            int prevNum = i - 1;

            while (prevNum < num && num != 0){
                double temp = arr[prevNum];
                arr[prevNum] = arr[num];
                arr[num] = temp;

                num = prevNum;
                prevNum -= 1;
            }
        }
        return arr;
    }

}
