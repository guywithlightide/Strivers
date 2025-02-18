import java.util.Arrays;

public class ArrayRotationByOne {

    public static int [] rotateLeft(int [] arr) {
        
        int [] temp = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            temp[i-1] = arr[i];
        }
        temp[temp.length-1] = arr[0];
        return temp;
    }

    public static int [] rotateLeftOptimal(int [] arr) {
        
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateLeft(arr)));
        System.out.println(Arrays.toString(rotateLeftOptimal(arr)));
    }
}
