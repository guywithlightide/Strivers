public class LongestSubarrayWithSumK {

    // {2,3,5,1,9}
    public static int optimal(int[] arr, int k) {
        int sum = 0;
        int i = 0, j = 0;
        if (k == 0)
            return 0;

        int maxLenTillNow = 0;

        while (i < arr.length - 1 && j < arr.length) {

            System.out.println("i=" + i + " j=" + j + " sum=" + sum + " maxLenTillNow=" + maxLenTillNow);

            sum = sum + arr[j];

            if (sum == k) {
                maxLenTillNow = (j-i+1) > maxLenTillNow ? (j-i+1) : maxLenTillNow; 
            } else if( sum < k) {
                j++;
            } else {
                sum = 0;
                i++;
                j=i;
            }
        }
        return maxLenTillNow;
    }

    public static void main(String[] args) {
        // Problem Statement: Given an array and a sum k, we need to print the length of
        // the longest subarray that sums to k.

        int[] array = { 2, 3, 5, 1, 9 , 2,3,2,3,0,1,2,3,4,1,1,1};
        int k = 3;

        System.out.println(optimal(array, k));
    }

}