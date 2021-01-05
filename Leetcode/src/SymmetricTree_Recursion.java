
public class SymmetricTree_Recursion {
	
	    public boolean isSymmetric(TreeNode root) {
	        
	        //Base case
	        if(root==null) return true;
	        
	        
	        return isMirror(root.left,root.right);
	        
	        
	        
	        
	    }
	    
	    boolean isMirror(TreeNode n1,TreeNode n2)
	    {
	        if(n1==null && n2==null) return true;
	        
	        if(n1==null || n2==null) return false;
	        
	        
	        return isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left) && (n1.val==n2.val);
	        
	        
	        
	    }
	    
	    
	    
	
}
