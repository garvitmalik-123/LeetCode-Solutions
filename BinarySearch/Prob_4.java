package BinarySearch;

// Find the floor of a number
public class Prob_4 {

    public static void main(String args[]){
        int[] arr={2,3,5,9,14,16,18,19};
        int target=15;
        int start=0;
        int end=arr.length-1;

        if(target>arr[end]){
            System.out.println(arr[end]);
            return;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        System.out.println(arr[end]);
    }
}
