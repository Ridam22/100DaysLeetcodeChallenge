class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] ans= new int[n];
        int left=0;
        int right= n-1;
        int j=n-1;
        while(left<=right){
            int sqL= nums[left]*nums[left];
            int sqR= nums[right]*nums[right];
            if(sqL>=sqR){
                ans[j]= sqL;
                left++;
            }else{
                ans[j]= sqR;
                right--;
            }
            j--;
        }
        return ans;
    }
}