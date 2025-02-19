public class MaxConsecutiveOnes {


    public static int countOneBruteForce(int [] arr) {
        
        int globalCounter = 0;
        int tempCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                tempCounter++;
                if(tempCounter > globalCounter)
                    globalCounter = tempCounter;
            }else{
                tempCounter=0;
            }
        }
        return globalCounter;
    }


    public static void main(String[] args) {
        //Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

        int [] prices = {1, 1, 0, 1, 1, 1,0,0,1,1,1,1,0};

        System.out.println("Max consec. ones = "+countOneBruteForce(prices));

    }
}
