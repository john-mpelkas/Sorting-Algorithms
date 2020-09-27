package sort;

import java.util.function.ToDoubleBiFunction;

public class Merge {

    private static int[] merge(int[] A, int[] L, int[] R){
        int nL = L.length;
        int nR = R.length;
        int i=0; int j=0; int k=0;

        while(i < nL && j < nR){
            if (L[i] <= R[i]){
                A[i] = L[i];
                i+=1;
            }
            else{
                A[k] = R[j];
                j+=1;
            }
            k=+1;
        }
        while(i < nL)
            A[k]=L[i]; i+=1; k+=1;

        while(j < nR)
            A[k]=R[j]; j+=1; k+=1;


        return A;
    }

    public static int[] sort(int[] arr){
        int arrLength = arr.length;

        if(arrLength > 2) {
            int mid = arrLength / 2;
            int[] lSublist = new int[mid];
            int[] rSublist = new int[arrLength - mid];

            for (int i = 0; i <= mid - 1; i++)
                lSublist[i] = arr[i];

            for (int i = mid; i < arrLength - 1; i++)
                rSublist[i - mid] = arr[i];

            // TODO: 9/27/20 Fix issue here
            sort(lSublist);
            sort(rSublist);
            merge(arr, lSublist, rSublist);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }

            System.out.println();
        }
        return arr;
    }
}
