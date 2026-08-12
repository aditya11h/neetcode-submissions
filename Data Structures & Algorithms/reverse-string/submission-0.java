class Solution {
    public void reverseString(char[] s) {
        char[] dummy = s.clone();
        for(int i = 0; i < s.length; i++){
            s[i] = dummy[s.length-i-1]; 
        }
    }
}