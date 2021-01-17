import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem797_PathFromS2D {
	
	/*  BFS Implementation */
	
	
	class BFS {
	    
	    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        
	        List<List<Integer>> result= new ArrayList<>();
	        
	        Queue<List<Integer>> q= new LinkedList();
	        
	        q.add(Arrays.asList(0));
	        
	        
	        while(!q.isEmpty())
	        {
	            List<Integer> oldPath= q.poll();
	            
	            int curr= oldPath.get(oldPath.size()-1);
	            
	            if(curr==graph.length-1) result.add(oldPath);
	            
	            
	            for(int i: graph[curr])
	            {
	                List<Integer> newPath= new ArrayList<>(oldPath);
	                
	                newPath.add(i);
	                
	                q.add(newPath);
	                
	            }
	            
	            
	        }
	        
	        
	      return result;  
	       
	    }
	    
	   
	        
	}
	
	/*  DFS Implementation */
	
	class DFS {
	    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        
	        List<List<Integer>> result= new ArrayList<>();
	        
	        //Base case
	        
	        if(graph.length<=0) return new ArrayList<List<Integer>>();
	        
	        int source=0;
	        int destination=graph.length-1;
	        
	        dfs(graph,source,destination,new ArrayList<>(),result);
	        
	        
	        
	        return result;
	       
	        
	        
	        
	        
	        
	    }
	    
	    void dfs(int [][] graph,int source,int destination,List<Integer> list, List<List<Integer>> result)
	    {
	        if(source==destination) result.add(list);
	        
	        list.add(source);
	                
	        for(Integer k: graph[source])
	        {
	            List<Integer> copyList = new ArrayList<>(list);
	            dfs(graph,k,destination,copyList,result);
	            
	        }
	        
	        
	    }
	    
	    
	}

}
