
public class Problem104_DepthOfTree_DFS {
	 int max;
	    
	    public int maxDepth(TreeNode root) {
	        
	        int counter=0;
	        
	        //Base case
	        
	        if(root==null) return 0;
	        
	        if(root.left==null && root.right==null) return 1;
	        
	        
	        
	        
	        dfs(root,counter);
	        
	        
	        return max+1;
	      
	    }
	    
	    void dfs(TreeNode root, int counter)
	    {
	        if(root==null) return;
	        
	        
	        if(root.left==null && root.right==null)
	        {
	            max=Math.max(max,counter);
	            return ;
	        }
	        
	        
	        dfs(root.left,counter+1);
	        
	        dfs(root.right,counter+1);
	        
	    }
	    
}
