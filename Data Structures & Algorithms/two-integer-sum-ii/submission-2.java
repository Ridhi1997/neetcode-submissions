class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //using Two Pointers  TC : O(N), SC :O(1)
        int n = numbers.length;
         int start =0, end = n-1;

         while(start < end){
            int currentSum = numbers[start]+ numbers[end];

            if(currentSum > target){
                end--;
            }else if(currentSum < target){
                start++;
            }else{
                return new int[]{start+1,end+1};
            }

         }
         return new int[]{};
        
    }
}
