package trees;
static int max(TreeNode root) {

    if (root == null) {
        return Integer.MIN_VALUE;
    }

    int left = max(root.left);
    int right = max(root.right);

    return Math.max(root.val, Math.max(left, right));
}