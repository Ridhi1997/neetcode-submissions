class Solution {
    public int[] productExceptSelf(int[] nums) {
    //    int res[]= new int[nums.length];


    //     for(int i=0;i<nums.length;i++){
    //      int prod =1;
    //      for(int j=0; j<nums.length;j++){
    //         if(i !=j){
    //             prod  *= nums[j];
    //         }
    //      }
    //      res[i]=prod;
    //     }
    //     return res;
    
    /* idea 2: using prefix suffix*/
    int n =nums.length;
    int[] res = new int[nums.length];
    int [] prefix = new int[nums.length];
    int [] suffix = new int[nums.length];
    prefix[0] =1;
    suffix[n-1] =1;
    for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]*nums[i-1];
    }
     for(int i=n-2;i>=0;i--){
        suffix[i]=suffix[i+1]*nums[i+1];
    }
      for(int i=0;i<n;i++){
        res[i]=prefix[i]*suffix[i];
    }
    return res;
    }
}  
