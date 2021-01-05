//Number of Island problem 

public class Problem200 {
	
	    public int numIslands(char[][] grid) {
	     int count=0;
	      //Base case
	        
	        if(grid.length<=0) return 0;
	        
	        int r=grid.length;
	        int c=grid[0].length;
	        
	        
	        
	        
	        for(int i=0;i<grid.length;++i)
	        {
	            for(int j=0;j<grid[i].length;++j)
	            {
	                if(grid[i][j]=='1')
	                {   count+=1;
	                    Bfs(grid,i,j,r,c);
	                   
	                }
	                
	                
	            }
	            
	        }
	        
	        
	      return count;  
	        
	    }
	    
	    
	    void Bfs(char[][] grid,int i,int j,int r,int c)
	    {
	        //Boundary check
	        
	        if(i < 0 || j < 0 || j >= c || i >= r || grid[i][j] == '0') return;
	        
	        grid[i][j]='0';
	        
	        Bfs(grid,i-1,j,r,c);
	        Bfs(grid,i+1,j,r,c);
	        Bfs(grid,i,j+1,r,c);
	        Bfs(grid,i,j-1,r,c);
	        
	    }
	    
	
}
