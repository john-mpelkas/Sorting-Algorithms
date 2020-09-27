package sort;

/**
 * This class can be used to sort integer or double arrays using <b>Selection Sort</b>.
 * This class is apart of the sort package that will contain other sorting algorithms.
 *
 * <b>Time Complexity:</b> O(n^2)
 * <b>Space Complexity:</b> O(1)
 *
 */
public class Selection {

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
    public static int[] sort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
    public static double[] sort(double [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[min] > arr[j])
                    min = j;
            }
            double temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
