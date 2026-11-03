import javax.swing.tree.TreeNode;

public class KthSmallestInBST {
  

    int cnt = 0;
    int res = -1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return res;
    }

    public void inorder(TreeNode root, int k){

        if (root == null || cnt >= k){
            return;
        }

        inorder(root.left, k);

        if (cnt >= k){
            return;
        }
        cnt++;

        if (cnt == k){
            res = root.val;
            return;
        }
        inorder(root.right, k);
    }

}
