class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //using Hash Map  TC : O(N), SC :O(N)
        int n = numbers.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<n;i++){
            int diff = target-numbers[i];
          if(map.containsKey(diff)){
            return new int[]{map.get(diff),i+1};
          }
          map.put(numbers[i],i+1);
        }
        return new int[]{};
        
    }
}
