class Solution {
    public int missingNumber(int[] nums) {
        int total=(nums.length*(nums.length+1))/2;
        
        int arrsum=0;
       
        for (int i = 0; i < nums.length; i++){
            arrsum += nums[i];
        }
    
           int missing = total - arrsum;
            System.out.println("Missing Number = " + missing);


        return missing;
    }
}