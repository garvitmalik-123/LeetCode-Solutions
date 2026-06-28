package BinarySearch;


//Ceiling of a give number
public class Prob_3 {
    public static void main(String args[]){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int left=0;
        int right=arr.length-1;

        if(target>arr[right]){
            System.out.println(-1);
            return;
        }

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
                return;
            }
            else if (arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        System.out.println(arr[left]);
    }
}
