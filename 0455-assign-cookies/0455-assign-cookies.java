class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=g.length;
        int j=s.length;
        int l=0;
        int r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<j && r<i){
            if(g[r]<=s[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}