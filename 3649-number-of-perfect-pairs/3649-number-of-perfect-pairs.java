class Solution {
    public long perfectPairs(int[] nums) {
        int n=nums.length;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=Math.abs((long)nums[i]);
        }

        Arrays.sort(arr);
        long ans=0;
        int left=0;

        for(int right=0;right<n;right++){
            while(arr[right]>2  * arr[left]){
                left++;
            }
            ans+=right-left;
        }

        return ans;
        
    }
}