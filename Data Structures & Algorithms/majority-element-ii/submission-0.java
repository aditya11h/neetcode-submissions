class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.get(i) > n/3){
                set.add(i);
            }
        }
        List<Integer> ls = new ArrayList<>(set);
        return ls;
    }
}