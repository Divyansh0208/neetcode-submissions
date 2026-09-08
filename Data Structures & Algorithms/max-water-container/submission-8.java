class Solution {
    public int maxArea(int[] arr) {
        int l = 0, r = arr.length - 1, max = 0;
        while(l<r) {
            int h = Math.min(arr[l], arr[r]), w = r - l;
            max = Math.max(max, h*w);
            if(arr[l] >= arr[r]) r--;
            else l++;
        }
        return max;
    }
}
