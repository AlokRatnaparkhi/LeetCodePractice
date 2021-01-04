import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseScheduleII_Kahn {

	    public int[] findOrder(int numCourses, int[][] prerequisites) {
	         int n=numCourses;
	         int[] result=new int[n];
	       
	        //Base case
	        
	        if(numCourses<=0 || prerequisites.length<=0) 
	            
	        {   for(int i=0;i<n;++i)
	                result[i]=i;
	         
	            return result;   
	        }
	        
	        //Construct a graph
	        
	        Map<Integer, ArrayList<Integer>> mp =new HashMap<Integer, ArrayList<Integer>>();
	        
	        
	        for(int i=0;i<n;i++) mp.put(i, new ArrayList<Integer>());
	        
	       
	        
	        for(int i[] : prerequisites )
	        {
	            mp.get(i[0]).add(i[1]);
	            
	        }
	        
	        
	        
	        //Calculate inorder of all vertices
	        
	        int[] inorder=new int[n];
	        
	       
	        
	        for(int i=0;i<n;++i)
	        {
	           for(int k: mp.get(i))
	           {
	               inorder[k]++;
	           }
	            
	            
	        }
	        
	        //To store the result order
	        
	         List<Integer> order= new ArrayList<Integer>();
	        
	       
	        //Kahn's algorithm
	        
	        Queue<Integer> q= new LinkedList<Integer>();
	        
	        for(int i=0;i<n;++i)
	        {
	            if(inorder[i]==0) {
	                
	                q.add(i);
	            
	            }
	                
	        }
	        
	        
	        
	        
	        while(!q.isEmpty())
	        {
	            int vertex= q.poll();
	           
	            
	            order.add(vertex);
	            
	            for(int j: mp.get(vertex))
	            {
	                inorder[j]--;
	                
	                if(inorder[j]==0) q.add(j);
	                
	            }
	                      
	            
	        }
	        
	       
	        int k=n-1;
	        for(int i=0;i<order.size();++i)
	        {
	            result[k--]=order.get(i);
	        }
	        
	        
	        
	        
	        if(order.size() < n) return new int[]{};
	        
	        else
	            return result;
	        
	        
	    }
	}

