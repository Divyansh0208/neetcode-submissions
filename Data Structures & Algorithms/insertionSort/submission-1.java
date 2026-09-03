public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if (pairs.size() == 0) return result;
        List<Pair> copy = copy(pairs);
        result.add(copy);
        for (int i = 1; i < pairs.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (pairs.get(i).key < pairs.get(j).key) {
                    Pair tmp = pairs.remove(i);
                    pairs.add(j, tmp);
                    break;
                }
            }
            copy = copy(pairs);
            result.add(copy);
        } 
        return result;
    }
    public List<Pair> copy(List<Pair> source) {
        List<Pair> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) result.add(source.get(i));
        return result;
    }
}
