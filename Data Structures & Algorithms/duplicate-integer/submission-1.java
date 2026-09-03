class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> h= new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])==false) h.put(nums[i],1);
            else return true;
        }
        return false;
    }
}