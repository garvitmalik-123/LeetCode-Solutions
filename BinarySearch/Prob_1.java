package BinarySearch;

public class Prob_1 {
    public static void main(String args[]) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
    }
}