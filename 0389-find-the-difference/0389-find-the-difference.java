class Solution {
    public char findTheDifference(String s, String t) {
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        while(i<a.length&&a[i]==b[i]){
            i++;
        }
        return b[i];
    }
}