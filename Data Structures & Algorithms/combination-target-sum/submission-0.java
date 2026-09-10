class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, target, subset, ls);
        return ls;
    }

    public void dfs(int[] nums, int i, int target, List<Integer> subset, List<List<Integer>> ls) {
        int currentSum = sum(subset);
        if (currentSum == target) {
            ls.add(new ArrayList<>(subset));
            return;
        }
        if (i == nums.length || currentSum > target) {
            return;
        }

        subset.add(nums[i]);
        dfs(nums, i, target, subset, ls);
        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, target, subset, ls);
    }

    public int sum(List<Integer> subset) {
        int res = 0;
        for (int i = 0; i < subset.size(); i++) {
            res += subset.get(i);
        }
        return res;
    }
}
