class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.add(root);
        index.add(0L);

        int max = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long first = index.peek();
            long last = first;

            for (int i = 0; i < size; i++) {

                TreeNode curr = q.poll();
                long pos = index.poll();

                last = pos;

                if (curr.left != null) {
                    q.add(curr.left);
                    index.add(2 * pos + 1);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                    index.add(2 * pos + 2);
                }
            }

            max = Math.max(max, (int)(last - first + 1));
        }

        return max;
    }
}