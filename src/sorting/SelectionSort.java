package sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }









    public static void main(String[] args) {


        int[] arr = {2,1,22,3,23,6,23};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(" " + i);
        }



    }



}

