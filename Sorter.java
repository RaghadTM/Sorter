import java.util.Arrays;
import java.util.Random;

class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arrayLength = 10;
        int[] randomArray = new int[arrayLength];
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(100);
        }

        System.out.println("Before sorting: " + Arrays.toString(randomArray));

        // Sort the array using selection sort
        selectionSort(randomArray);

        System.out.println("After sorting: " + Arrays.toString(randomArray));
    }
    public class InsertionSort {
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key,
               to one position ahead of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }


}
