package BinarySearch;

//Find the smallest letter greater than the target
public class Prob_5 {
    public static void main(String args[]){
        char[] letters={'c','f','j'};
        char target='a';
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
//            if(letters[mid]==target){
//                System.out.println(letters[mid]);
//                return;
//            }
             if (letters[mid]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        System.out.println(letters[start]);

    }
}
