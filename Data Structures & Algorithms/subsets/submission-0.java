class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums,0,subset,ls);
        return ls;
    }

    public static void dfs(int[] nums,int i,List<Integer> subset, List<List<Integer>> ls){
        if(i == nums.length){
            ls.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(nums,i+1,subset,ls);
        subset.remove(subset.size()-1);
        dfs(nums,i+1,subset,ls);
    }
}
