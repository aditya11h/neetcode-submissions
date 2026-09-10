class Solution {
    List<List<Integer>> ls;
    public List<List<Integer>> combine(int n, int k) {
        ls = new ArrayList<>();
        dfs(1,n,k,new ArrayList<>());
        return ls;
    }

    public void dfs(int i , int n , int k , List<Integer> comb){
        if(i > n){
            if(comb.size() == k){
                ls.add(new ArrayList<>(comb));
            }
            return;
        }

        comb.add(i);
        dfs(i+1,n,k,comb);
        comb.remove(comb.size()-1);
        dfs(i+1,n,k,comb);
    }
}