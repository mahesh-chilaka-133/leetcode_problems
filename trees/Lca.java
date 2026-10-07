/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null){
            return null;
        }

        //case 1
        if (root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode lca1 = lowestCommonAncestor(root.left, p, q);
        TreeNode lca2 = lowestCommonAncestor(root.right, p, q);

        //case 2
        if(lca1 != null && lca2 != null){
            return root;
        }

        //case 3
        if (lca1 != null){
            return lca1;
        }else{
            //case 4
            return lca2;
        }

    }
}