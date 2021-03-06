package app;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Runtime: 1 ms, faster than 86.02% of Java online submissions for Binary Tree Level Order Traversal.
// Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
class Q102_binary_tree_level_order_traversal_BFS
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if( root == null ) return ans;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer( root );
        while( !queue.isEmpty() )
        {
            List<Integer> level = new ArrayList<Integer>();
            int len = queue.size();
            for( int i = 0; i < len; i++ )
            {
                TreeNode cur = queue.remove();
                level.add( cur.val );
                if( cur.left != null )  queue.add( cur.left );
                if( cur.right != null ) queue.add( cur.right );                
            }
            ans.add( level );
        }
        return ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}