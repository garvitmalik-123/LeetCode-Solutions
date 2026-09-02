class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean even =false;
        boolean odd=false;

        for(int x:nums1){
            if(x%2==0){
                even=true;
            }
            else{
                odd =true;
            }
        }
        return true;
    }
}