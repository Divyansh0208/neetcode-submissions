class Solution {
    public int maxArea(int[] heights) {
        int a=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                a=Math.max(a,Math.min(heights[i],heights[j])*(j-i));
            }
        }
        return a;
    }
}
