class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumofn=(n*(n+1))/2;
        int sumofnums =0;
        int res=0;
        for(int i=0;i<n;i++){
            sumofnums=sumofnums+nums[i];
            res= sumofn - sumofnums;
        }
        return res;
    }
}