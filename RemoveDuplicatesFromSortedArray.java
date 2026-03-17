import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};

        int left = 0;
        int right = 1;

        while (right < arr.length) {

            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
}