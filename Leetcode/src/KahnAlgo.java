import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class KahnAlgo {
	
	Map<Integer,ArrayList<Integer>> mp;
	int V=0,E=0;
	
	public KahnAlgo(int V,int E)
	{	mp= new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<V;++i)
			mp.put(i, new ArrayList<Integer>());
		this.V=V;
		this.E=E;
			
	}
	
	void sortTopology()
	{
		//Calculate indegrees
		
		int [] indegrees=new int[V];
		List<Integer> order=new ArrayList<>(V);
		for(int i=0;i<V;++i)
		{
			for(int k: mp.get(i))
			{
				indegrees[k]++;
				
			}
			
			
		}
		
				
		//Find nodes with 0 indegree and add them to Queue
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		for(int i=0;i<V;++i)
		{
			if(indegrees[i]==0)
			{
				q.add(i);
			
			}
			
		}
		
		//Loop through all nodes, modify indegrees and add them into queue
		while(!q.isEmpty())
		{	int u=q.poll();
			order.add(u);
			
			for(int temp:mp.get(u))
			{
				indegrees[temp]--;
				
				if(indegrees[temp]==0) q.add(temp);
			}
			
			
			
		}
		
		//Check if there is cycle by length of order
		
		if(order.size()==V)
		{
			System.out.println("The topological order is:");
			
			for(int i: order)
			{
				System.out.print(i+" ");
			}
		}
		else
		{
			System.out.println("No topological order possible. Cycle exists!!");
		}
		
	}
	
	
	void addEdges(int source,int destination)
	{
		mp.get(source).add(destination);
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the number of vertices for given graph:");
		Scanner sc=new Scanner(System.in);
		int V=sc.nextInt();
		System.out.println("Enter the number of edges for given graph:");
		int E=sc.nextInt();
		KahnAlgo k=new KahnAlgo(V,E);
		System.out.println("Enter the edges from node m to n as specified as m,n");
		
		for(int i=0;i<E;i++) {
			String[] temp=sc.next().split(",");
			k.addEdges(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
		}
		k.sortTopology();

	}

}
