class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n= nums.length;
        if(n==0) return 0;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else{
                nums[count]= nums[i];
                count++;
            }
        }
        return count;
    }
}