package sort;

/**
 * This class can be used to sort integer or double arrays using <b>Bubble Sort</b>.
 * This class is apart of the sort package that will contain other sorting algorithms.
 *
 * <b>Time Complexity:</b> O(n^2)
 * <b>Space Complexity:</b> O(1)
 *
 */
public class Bubble {

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
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int j = 0;
            int k = 1;
            while(k < arr.length){
                if(arr[j] > arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
                j += 1;
                k += 1;
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
    public static double[] sort(double[] arr) {
        for (int i = 0; i < arr.length; i++){
            int j = 0;
            int k = 1;
            while(k < arr.length){
                if(arr[j] > arr[k]){
                    double temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
                j += 1;
                k += 1;
            }
        }
        return arr;
    }
}
