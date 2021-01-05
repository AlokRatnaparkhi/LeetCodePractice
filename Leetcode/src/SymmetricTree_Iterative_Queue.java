import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree_Iterative_Queue {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	    public boolean isSymmetric(TreeNode root) {
	        
	        Queue<TreeNode> q=new LinkedList<>();
	        
	        
	        
	        q.add(root);
	        q.add(root);
	        
	        while(!q.isEmpty())
	        {
	            TreeNode n1= q.poll();
	            TreeNode n2= q.poll();
	            
	            
	            
	            if(n1==null && n2==null) continue;
	            
	            if(n1==null || n2==null || n1.val!=n2.val) return false;
	            
	            
	            
	            q.add(n1.left);
	            q.add(n2.right);
	            q.add(n1.right);
	            q.add(n2.left);
	           
	            
	        }
	        
	      
	        
	        return true;
	        
	        
	    }
	
}
