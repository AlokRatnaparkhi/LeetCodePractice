import java.util.Stack;

public class Problem111_minDepthOfTree_IterativeDFS {
public int minDepth(TreeNode root) {
        
        int result=Integer.MAX_VALUE;
        
        //Base Case
        
        
        if(root ==null) return 0;
        
        if(root.left==null && root.right==null)
        {   
                return 1;
                
        }
        
        
        
        
        Stack<TreeNode> stack= new Stack<>();
        Stack<Integer> i= new Stack<>();
        
        stack.add(root);
        i.add(0);
        
        
        while(!stack.isEmpty())
        {
            TreeNode curr= stack.pop();
            
            int mint=i.pop();
                
            if(curr.left==null && curr.right==null)
            {
                result=Math.min(result,mint);
                
            }
                            
            
            
            if(curr.right!=null)
            {
                stack.add(curr.right);
                i.add(mint+1);
                
            }
            
            if(curr.left!=null)
            {
                stack.add(curr.left);
                i.add(mint+1);
            }
            
          
                    
            
            
        }
        
        
      return result+1;  
}}
