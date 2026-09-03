class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> c=new HashMap<>();
        List<Integer>[] f=new List[nums.length+1];
        for(int i=0;i<f.length;i++) f[i]=new ArrayList<>();
        for(int i:nums) c.put(i,c.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> e:c.entrySet()) f[e.getValue()].add(e.getKey());
        int[] r=new int[k];
        int idx=0;
        for(int i=f.length-1;i>0 && idx<k;i--){
            for(int j:f[i]){
                r[idx++]=j;
                if(idx==k) return r;
            }
        }
        return r;
    }
}
