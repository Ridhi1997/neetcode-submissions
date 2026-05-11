class Solution {
    /*
   1) Iteration (One Pass)
   TC : O(N)
   SC : O(N)
    */
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2*n];

        for(int i=0; i<n; i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
        
    }
}