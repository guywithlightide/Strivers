import java.util.Arrays;

public class MoveZeros {

    public static int[] bruteForce(int [] arr) {
    
        int [] temp = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[k++] = arr[i];
            }
        }

        return temp;
    }


    public static int [] optimal2pointer(int [] arr) {
        
        int j=0;
        while(arr[j]!=0){
            j++;
        }

        for (int i = j+1; i < arr.length; i++) {
            System.out.println("i="+i+" j="+j);
            System.out.println(Arrays.toString(arr));
            System.err.println();
            if(arr[i]!=0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
            
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {0, 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println(Arrays.toString(bruteForce(arr)));
        optimal2pointer(arr);
    }
}
