import java.util.Arrays;

public class MissingNumber {
 
    public static int findMissingBruteForce(int [] arr) {  
        for (int i = 1; i <= arr.length; i++) {
            boolean iPresent = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    iPresent = true;
                    break;
                }
            }
            if(!iPresent)
                return i;
        }
        return -1;
    }

    
    public static int hashing(int [] arr, int N) {
    
        int [] freq = new int[N+1];

        for (int i = 0; i < N-1; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= freq.length; i++) {
            if (freq[i]==0) {
                return i;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        int [] array = {1,5,2,3}; // missing 4 
        System.out.println("Missing found - by brute force = "+findMissingBruteForce(array));
        System.out.println("Missing found - by hashing = "+hashing(array,5));
    }
}
