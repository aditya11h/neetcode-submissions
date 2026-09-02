
class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Ignore empty parts and "."
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // Go back one directory
            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Normal directory
            else {
                st.push(part);
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.insert(0, "/" + st.pop());
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
}