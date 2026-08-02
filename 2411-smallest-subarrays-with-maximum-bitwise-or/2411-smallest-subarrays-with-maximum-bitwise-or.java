class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] last=new int[32];
        Arrays.fill(last,-1);
        for(int i=n-1;i>=0;i--){
            int len=1;
            for(int b=0;b<32;b++){
                  if (((nums[i] >> b) & 1) == 1)
                  last[b]=i;
                  else if(last[b]!=-1)
                  len=Math.max(len,last[b]-i+1);
            }
            ans[i]=len;
        }
        
        return ans;
    }
}