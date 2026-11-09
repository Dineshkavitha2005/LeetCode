class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] hex=heights.clone();
        Arrays.sort(hex);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=hex[i]){
                count++;
            }
        }
        return count;
    }
}