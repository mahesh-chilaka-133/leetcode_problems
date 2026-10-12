import javax.swing.tree.TreeNode;

public class GoodNodesInTree {
 
    public int goodNodes(TreeNode root) {
        
        return count(root, Integer.MIN_VALUE);
    }

    public int count(TreeNode root, int maxSoFar){

        if (root == null){
            return 0;
        }
        int good = 0;

        if (root.val >= maxSoFar){
            good = 1;
        }
        maxSoFar = Math.max(maxSoFar, root.val);
        good += count(root.left, maxSoFar);
        good += count(root.right, maxSoFar);

        return good;
    }

}
