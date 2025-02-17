import java.util.Arrays;

public class LargestNum{
    
    public static int largest(int [] arr){
        if(arr.length == 0){
            return -1;
        }

        if(arr.length == 1){
            return arr[0];
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,0,8};

        // brute force
        Arrays.sort(arr);

        System.out.println("Largest via BF = "+arr[arr.length-1]);

        System.out.println("Largest = "+largest(arr));

    }
}