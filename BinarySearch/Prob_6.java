package BinarySearch;

// Find First and Last Position of an element in sorted array
public class Prob_6 {

    public static void main(String args[]) {

        int[] nums = {5, 7, 7, 8, 8, 9, 9, 10};
        int target = 9;

        int first = FindFirstIndex(nums, target);
        int last = FindLastIndex(nums, target);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }


    static int FindFirstIndex(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }


    static int FindLastIndex(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}