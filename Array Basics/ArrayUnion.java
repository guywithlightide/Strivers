import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUnion {

    public static Set<Integer> brute(int[] arr1, int[] arr2) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set;
    }

    public static int[] optimal(int[] arr1, int[] arr2) {

        int i = 0, j = 0;

        int[] temp = new int[arr1.length + arr2.length];
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (k == 0 || temp[k-1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
            } else {
                if (k == 0 || temp[k-1] != arr2[j]) {
                    temp[k++] = arr2[j];
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (k ==0 || temp[k-1] != arr1[i])
                temp[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            if (k ==0 || temp[k-1] != arr2[j]) 
                temp[k++] = arr2[j++];
        }

        int [] temp2 = new int[k];
        for (int k2 = 0; temp[k2]!=0 && k2 < temp.length ; k2++) {
            temp2[k2] = temp[k2];
        }


        return temp2;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };

        System.out.println(Arrays.toString(brute(arr1, arr2).toArray()));
        System.out.println(Arrays.toString(optimal(arr1, arr2)));
    }
}