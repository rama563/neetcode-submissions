class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer> >res = new ArrayList<>(map.entrySet());
        res.sort((a,b) -> b.getValue() - a.getValue());
        int arr[] = new int[k];
        for(int i =0 ;i<k;i++){
            arr[i] = res.get(i).getKey();
        }
        return arr;
    }
}