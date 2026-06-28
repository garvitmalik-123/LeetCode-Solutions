package BinarySearch;

// Order Agnostic Binary Search
public class Prob_2 {

    public static void main(String args[]) {

        int[] arr = {99, 88, 77, 44, 33, 22, 11, -1, -2};
        int target = 44;

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
    }
}