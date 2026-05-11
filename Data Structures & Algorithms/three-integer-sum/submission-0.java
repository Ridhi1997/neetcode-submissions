class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Brute Force
        int n= nums.length;
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<n;i++){
            for(int j= i+1; j<n;j++){
                for(int k = j+1; k<n;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                       List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                       res.add(temp); 
                    }
                }
            }
        }
        return new ArrayList<>(res);

        
    }
}
