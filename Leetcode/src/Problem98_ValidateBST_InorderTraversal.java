import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem98_ValidateBST_InorderTraversal {
	 public boolean isValidBST(TreeNode root) {
	       
	        boolean flag=true;
	         
	         if(root==null) return true;
	         
	         List<Integer> result=new ArrayList<>();
	         Stack<TreeNode> curr=new Stack<>();
	         TreeNode temp=root;
	        
	         
	         while(!curr.isEmpty() || temp!=null)
	         {
	             while(temp!=null){
	                 curr.push(temp);
	               
	                temp=temp.left;
	                 
	             }
	             temp=curr.pop();
	             
	             result.add(temp.val);
	             
	             temp=temp.right;
	             
	             
	         }
	         
	  
	         
	      for(int i=0;i<result.size()-1;++i)
	      {
	          if(result.get(i)>=result.get(i+1)) flag=false;
	          
	      }
	         
	       return flag;  
	    }
}
