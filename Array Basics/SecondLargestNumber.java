public class SecondLargestNumber{

    public static int secondLargestOptimal(int [] arr) {
        if(arr.length == 0){
            return -1;
        }
        if(arr.length == 1){
            return arr[0];
        }

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            }else if(arr[i] > secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }
        
        return secondLarge;
    }

    public static int secondLargest(int [] arr) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>large){
                large = arr[i];
            }            
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,1,3,0,8};


        
        // non-optimal
        System.out.println("Second largest non optimal = "+ secondLargest(arr));

        // optimal 
        System.out.println("Second largest optimal = "+ secondLargestOptimal(arr));

    }
}