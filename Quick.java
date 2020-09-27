package sort;
/**
 * This class can be used to sort integer or double arrays using <b>Quick Sort</b>.
 * This class is apart of the sort package that will contain other sorting algorithms.
 *
 * <b>Time Complexity:</b>
 *  <i>Best Case</i> O(n log(n))
 *  <i>Worst Case</i> O(log(n))
 * <b>Space Complexity:</b> O(n)
 *
 */
public class Quick {

    /**
     * Method used to print out int arrays.
     * @param arr - Array to be printed to console.
     */
    public static void toString(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(String.format("%s ",arr[i]));
        }
    }

    /**
     * Method used to place all smaller values to the left of the pivot and all the larger
     * values to the right of the pivot.
     * @param arr - Array to be sorted.
     * @param scanner - Smallest index of the partition.
     * @param pivot - The last number in the index.
     * @return i - The final position of the pivot index.
     */
    private static int partition(int[] arr, int scanner, int pivot) {
        int i = scanner;
        for (; scanner < arr.length - 1; scanner++) {
            if (arr[scanner] < arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[scanner];
                arr[scanner] = temp;

                i += 1;
            }
        }
        //Placing pivot element in correct index
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        return i;
    }

    /**
     * Method used to control the flow of quick sort.
     * @param arr - Array to be sorted using quick sort.
     * @param low - The lowest index in the partitioning frame.
     * @param high - The highest index in the partitioning frame.
     * @return - Sorted array.
     */
    private static int[] quickSort(int[] arr, int low, int high){
            if (low < high) {
                int pivotPos = partition(arr, low, high);

                quickSort(arr, low, pivotPos - 1);
                quickSort(arr, pivotPos + 1, high);
            }
        return arr;
    }

    /**
     * Method to be called passing only the array from another class
     * to easily sort the given array.
     * @param arr - Array to be sorted.
     * @return - Sorted array.
     */
    public static int[] sort(int[] arr){
        return quickSort( arr, 0, arr.length-1);
    }


    /**
     * Method used to print out double arrays.
     * @param arr - Array to be printed to console.
     */
    public static void toString(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(String.format("%s ",arr[i]));
        }
    }

    /**
     * Method used to place all smaller values to the left of the pivot and all the larger
     * values to the right of the pivot.
     * @param arr - Array to be sorted.
     * @param scanner - Smallest index of the partition.
     * @param pivot - The last number in the index.
     * @return i - The final position of the pivot index.
     */
    private static int partition(double[] arr, int scanner, int pivot) {
        int i = scanner;
        for (; scanner < arr.length - 1; scanner++) {
            if (arr[scanner] < arr[pivot]) {
                double temp = arr[i];
                arr[i] = arr[scanner];
                arr[scanner] = temp;

                i += 1;
            }
        }
        //Placing pivot element in correct index
        double temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        return i;
    }

    /**
     * Method used to control the flow of quick sort.
     * @param arr - Array to be sorted
     * @param low - Lowest index value in the quick sort frame
     * @param high - Highest index value in the quick sort frame
     * @return - Sorted array.
     */
    private static double[] quickSort(double[] arr, int low, int high){
        if (low < high) {
            int pivotPos = partition(arr, low, high);

            quickSort(arr, low, pivotPos - 1);
            quickSort(arr, pivotPos + 1, high);
        }
        return arr;
    }
    /**
     * Method to be called passing only the array from another class
     * to easily sort the given array.
     * @param arr - Array to be sorted.
     * @return - Sorted array.
     */
    public static double[] sort(double[] arr){
        return quickSort( arr, 0, arr.length-1);
    }
}
