class Solution {
    public int maxArea(int[] heights) {
        int max = 0, i=0, j=heights.length-1, min=0;
        while(i<j){
            if (heights[i]<heights[j]) min=heights[i];
            else min=heights[j];
            int area =(j-i)*min;
            if (area>max) max=area;
            if(heights[i]<heights[j]) i++;
            else j--;
        }
       return max ;
    }
}
