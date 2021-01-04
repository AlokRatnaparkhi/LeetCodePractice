import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CourseScheduleII_DFS {
	  public int[] findOrder(int numCourses, int[][] prerequisites) {
	        
	      int n=numCourses; 
	       int order[]=new int[n];
	      List<Integer> result=new ArrayList<>();
	      int counter=-1;
	      
	      //Base case
	      
	      if(n<=0 || prerequisites.length<=0)
	      {
	          for(int i=0;i<n;++i) 
	          { order[i]=i;
	            
	          }
	        return order;
	          
	      }
	      
	      //Creating graph
	      
	      Map<Integer,List<Integer>> mp= new HashMap<Integer,List<Integer>>();
	      
	      for(int i=0;i<n;++i)
	          mp.put(i,new ArrayList());
	      
	      
	          for(int k[]:prerequisites)
	          {
	              mp.get(k[1]).add(k[0]);
	          }
	      
	      
	      
	      int[] visited=new int[n];
	      
	        //Depth First Search
	      
	      for(int i=0;i<n;++i)
	      {
	            if(!Dfs(mp,i,visited,result))
	            {
	                return new int[]{};
	            }
	          
	      }
	      
	     
	      
	     for(int i=0;i<n;++i) {
	         //System.out.print(result[i]+" ");
	        order[i]=result.get(n-i-1);   
	     }
	        
	      return order;
	     
	  }
	    
	    boolean Dfs(Map<Integer,List<Integer>> mp, int vertex, int[] visited, List<Integer> result)
	    {   
	        if(visited[vertex]==1) return false;
	        if(visited[vertex]==2) return true;
	        
	        
	        visited[vertex]=1;
	       
	      
	        
	        if(mp.containsKey(vertex)){
	        for(int k: mp.get(vertex))
	        { 
	            if(!Dfs(mp,k,visited,result))
	                return false;
	                
	        }}
	        
	        visited[vertex]=2;
	       
	        result.add(vertex);
	        
	        
	        
	        return true;
	        
	    }
	    
	    
	    
	}