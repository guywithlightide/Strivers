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


    public static int bySummation(int [] arr, int N) {
        int expected = (N*(N+1))/2;
        int actual = 0;
        for (int i = 0; i < arr.length; i++) {
            actual+=arr[i];
        }
        return expected-actual;
    }

    public static int byXor(int [] arr, int N) {
        
        int xor1=0,xor2=0;

        for (int i = 0; i < N - 2 ; i++) {
            System.out.println(xor1 +"^"+(i+1)+" = "+(xor1^(i+1)));
            System.out.println(xor2 +"^"+arr[i]+" = "+(xor2^arr[i]));

            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];    
         }

        System.out.println(xor1);
        System.out.println(xor2);
        return xor1 ^ xor2;

    }
 
    public static void main(String[] args) {
        int [] array = {1,5,2,3}; // missing 4 
        System.out.println("Missing found - by brute force = "+findMissingBruteForce(array));
        System.out.println("Missing found - by hashing = "+hashing(array,5));
        System.out.println("Missing found - by summation = "+bySummation(array, 5));
        System.out.println("Missing found - by xor = "+byXor(array, 5));
    }
}
