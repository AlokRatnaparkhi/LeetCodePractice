import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem94_Iterative {


	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> result=new ArrayList<Integer>();

		//Base case


		if(root==null) return new ArrayList<Integer>();

		TreeNode curr= root;
		Stack<TreeNode> s= new Stack<>();

		while(curr!=null || !s.isEmpty())
		{
			while(curr!=null)
			{
				s.push(curr);
				curr=curr.left;

			}

			curr=s.pop();
			result.add(curr.val);
			curr=curr.right;


		}





		return result; 
	}



}
