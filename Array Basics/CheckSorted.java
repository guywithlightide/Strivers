public class CheckSorted{
    
    public static boolean check(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }   
        }
        return true;
    }

    public static boolean checkOptimal(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,0,8};
        System.out.println(check(arr));
        System.out.println(checkOptimal(arr));
    }
}