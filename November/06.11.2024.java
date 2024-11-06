class Solution {
    public static int treePathsSum(Node root) {
        // add code here.
        // base case
        if (root == null) return 0;
        // Store pair of node and value
        // associated with it.
        Stack<AbstractMap.SimpleEntry<Node, Integer>> st = 
                                          new Stack<>();
        st.push(new AbstractMap.SimpleEntry<>(root, 0));
        int ans = 0;
        while (!st.isEmpty()) {
            AbstractMap.SimpleEntry<Node, Integer> top = st.pop();
            Node curr = top.getKey();
            int val = top.getValue();
            // update the value
            val = val * 10 + curr.data;
            // if current node is leaf node, 
            // then add the value to result.
            if (curr.left == null && curr.right == null) {
                ans += val;
                continue;
            }
            if (curr.right != null) {
                st.push(new AbstractMap.SimpleEntry<>
                                    (curr.right, val));
            }
            if (curr.left != null) {
                st.push(new AbstractMap.SimpleEntry<>
                                    (curr.left, val));
            }
        }
        return ans;
    }
}
