import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class ClassSchedule207 {
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        
	        //Creating adjacency list
	        Map <Integer, ArrayList<Integer>> mp=new HashMap<Integer,ArrayList<Integer>>();
	        
	        for(int i=0;i<numCourses;++i)
	        {
	            mp.put(i,new ArrayList<Integer>());
	        }
	        
	        for(int i[]:prerequisites)
	        {
	            mp.get(i[0]).add(i[1]);
	        }
	        
	        int[] indegree=new int[numCourses];
	        
	        List<Integer> order=new ArrayList<Integer>();
	        
	        //Calculate indegrees
	        
	        for(int i=0;i<numCourses;++i)
	        {
	            for(int k: mp.get(i))
	            {
	                    indegree[k]++;
	            }
	        }
	        
	        Queue<Integer> q= new LinkedList<Integer>();
	        
	        //Add nodes with 0 indegree to the queue
	        
	        for(int i=0;i<indegree.length;i++)
	        {
	            if(indegree[i]==0) q.add(i);
	        }
	        
	        //Loop through queue
	        
	        while(!q.isEmpty())
	        {
	            int u=q.poll();
	            order.add(u);
	            
	            for(int j: mp.get(u))
	            {
	                indegree[j]--;
	                if(indegree[j]==0) q.add(j);
	            }
	        }
	        
	        
	        if(order.size()==numCourses)
	        {  
	            
	            if(numCourses<=order.size()) return true;
	            else return false;
	            
	        }
	        else
	        {
	            return false;
	        }
	      
	    }
	}

