import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Detecting cycle using DFS (And not using topological sort 
 * 
 * 
 * @author alokr
 *
 */



public class ClassSchedule207_Standard {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
	       Map <Integer,ArrayList<Integer>> mp= new HashMap<Integer,ArrayList<Integer>>();
	        
	       if(numCourses<=0 ||prerequisites.length<=0 || prerequisites==null) return true;
	       
	        //CREATE GRAPH  
	        
	        for(int i=0;i<numCourses;++i)
	            mp.put(i,new ArrayList<Integer>());
	        
	        for(int i[]:prerequisites)
	        {
	            mp.get(i[0]).add(i[1]);
	            
	        }
	        
	        //Graph ready
	        
	        int[] visited=new int[numCourses];
	        List<Integer> order= new ArrayList<Integer>();
	        
	        
	        for(int i=0; i<numCourses;++i)
	        {   
	            if(!Dfs(mp,i,visited)) 
	            {  
	                return false;
	            }
	        
	        }
	        
	        return true;
	    }
	    
	    
	   boolean Dfs(Map<Integer,ArrayList<Integer>> mp, int vertex, int[] visited)
	    {   
	       
	        if(visited[vertex]==1) 
	        {
	            System.out.println(vertex);
	            
	            return false;}
	            
	        if(visited[vertex]==2) return true;
	        
	        visited[vertex]=1;
	       
	       
	        for(int i: mp.get(vertex))
	        {   
	            if(!Dfs(mp,i,visited))
	            	
	                return false;
	          
	            
	        }
	        
	                
	        visited[vertex]=2; 
	        return true;
	       
	     
	    }

	
	
	
	
	public static void main(String[] args) {
		
		ClassSchedule207_Standard e= new ClassSchedule207_Standard();
		int numCourses=4;
		int [][] prerequisites= new int[][] {{1,0},{2,1}};
		System.out.println(prerequisites.length);
		System.out.println(e.canFinish(numCourses, prerequisites));
		
		
		
	}

}
