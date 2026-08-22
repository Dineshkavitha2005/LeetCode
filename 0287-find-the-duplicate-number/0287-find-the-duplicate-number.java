class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> intset= new HashSet<>();
        int len=nums.length;
        int res = 0;
        for(int i =0;i<len;i++){
            if(intset.contains(nums[i])){
                res = nums[i];
            }
            else{
                intset.add(nums[i]);
            }
            }
            return res;
        }
    }
