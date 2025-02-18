import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayRotation {

    public static int[] rotateLeftBruteForce(int[] arr, int n) {

        if (n == 0)
            return arr;

        // If n is greater than length of the array, we take the modulo result since 1
        // full rotation means n = length of the array
        n = n % arr.length;

        int[] temp = new int[arr.length];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }

        int k = 0;
        for (int i = arr.length - n; i < temp.length; i++) {
            arr[i] = temp[k++];
        }
        return arr;
    }

    public static int[] rotateLeftOptimal(int[] arr, int n) {

        if (n == 0)
            return arr;

        // If n is greater than length of the array, we take the modulo result since 1
        // full rotation means n = length of the array
        n = n % arr.length;

        int[] temp = new int[arr.length];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length - n; i++) {
            arr[i] = arr[i + n]; // assigning i+n th element to i position, effectively shifting elements by n
                                 // places to left
        }

        int z = 0;

        for (int i = arr.length - n; i < arr.length; i++) {
            arr[i] = temp[z++];
        }

        return arr;

    }


    public static void reverse(int [] arr, int start, int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;            
        }
    }


    public static void ReversalAlgoRotateLeft(int [] arr, int n) {
        // reverse first n elements
        reverse(arr, 0, n-1);
        // reverse last len-n elements
        reverse(arr, n, arr.length-1);
        // reverse full array
        reverse(arr, 0, arr.length-1);
    }

    public static void ReversalAlgoRotateRight(int [] arr, int n){
        
        // reverse first len-n elements
        reverse(arr, 0, arr.length-n-1);

        // reverse last n elements
        reverse(arr, arr.length-n, arr.length-1);

        // reverse full array
        reverse(arr, 0, arr.length-1);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of places to rotate?");
        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(rotateLeftBruteForce(arr, n)));

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(rotateLeftOptimal(arr1, n)));

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        ReversalAlgoRotateRight(arr2, n);
        System.out.println("Rotated right by "+n+" places "+Arrays.toString(arr2));

        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
        ReversalAlgoRotateLeft(arr3, n);
        System.out.println("Rotated left by "+n+" places "+Arrays.toString(arr3));
    }
}
