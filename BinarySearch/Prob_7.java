package BinarySearch;

// Infinite Array Search
public class Prob_7 {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8,10,11,12,14,16,18,20,22,24};
        int target = 18;

        int start = 0;
        int end = 1;

        // Expand range
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        // Binary Search
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(-1);
    }
}