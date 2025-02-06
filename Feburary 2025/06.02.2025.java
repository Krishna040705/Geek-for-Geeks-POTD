
class Solution {
    static int preIndex = 0;
    static HashMap<Integer, Integer> inorderMap;
    public static Node buildTree(int inorder[], int preorder[]) {
        inorderMap = new HashMap<>();
        preIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, inorder.length - 1);
    }
    private static Node constructTree(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootValue = preorder[preIndex++];
        Node root = new Node(rootValue);
        int inIndex = inorderMap.get(rootValue);
        root.left = constructTree(preorder, inStart, inIndex - 1);
        root.right = constructTree(preorder, inIndex + 1, inEnd);
        return root;
    }
    public static void postOrderTraversal(Node root, List<Integer> result) {
        if (root == null) return;
        postOrderTraversal(root.left, result);
        postOrderTraversal(root.right, result);
        result.add(root.data);
    }
    public static List<Integer> getPostOrder(int inorder[], int preorder[]) {
        Node root = buildTree(inorder, preorder);
        List<Integer> postorderList = new ArrayList<>();
        postOrderTraversal(root, postorderList);
        return postorderList;
    }
    
}
