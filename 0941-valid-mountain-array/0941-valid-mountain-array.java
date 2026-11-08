class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int a=0;
        int b=arr.length-1;
        while(a<b){
            if(arr[a+1]>arr[a]){
                a++;
            }
            else if(arr[b-1]>arr[b]){
                b--;
            }
            else{
                break;
            }
        }
        return a!=0 && b!=arr.length-1 && a==b;
    }
}