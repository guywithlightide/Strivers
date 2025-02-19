public class LonelyNumber {


    public static int lonely(int [] arr) {
        
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        // Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
        int [] arr = {2,2,1,3,1,5,6,5,3};

        System.out.println("Lonely = "+lonely(arr));
    }
}
