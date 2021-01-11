import java.util.ArrayList;
import java.util.List;

public class Problem94_Recursion {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        
	        List<Integer> result=new ArrayList<Integer>();
	        
	        //Base case
	        
	        
	        if(root==null) return new ArrayList<Integer>();
	        
	        if(root.left==null && root.right==null) { result.add(root.val);
	        return result;}
	         
	        dfs(root,result);
	        
	      
	            
	        return result;
	    }
	    
	    
	    void dfs(TreeNode root, List<Integer> result)
	    {   
	       
	        if(root.left!=null){
	        dfs(root.left, result);
	        
	        }
	        result.add(root.val);
	        
	        if(root.right!=null){
	        dfs(root.right,result);
	        
	        }
	    }
}
