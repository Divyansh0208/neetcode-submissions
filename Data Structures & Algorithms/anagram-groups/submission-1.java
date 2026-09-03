class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m=new HashMap<>();
        for(String i:strs){
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!m.containsKey(key)) m.put(key,new ArrayList<>());
            m.get(key).add(i);
        }
        return new ArrayList<>(m.values());
    }
}
