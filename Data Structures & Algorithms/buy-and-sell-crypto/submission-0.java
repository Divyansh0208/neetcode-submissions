class Solution {
    public int maxProfit(int[] prices) {
        int a=Integer.MAX_VALUE,b=0;
        for(int i:prices){
            if(i<a) a=i;
            else if(i-a>b) b=i-a;
        }
        return b;
    }
}