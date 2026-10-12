class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int j=k; j<arr.length; j++){
            sum= sum+arr[j]-arr[j-k];
            maxsum= Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}