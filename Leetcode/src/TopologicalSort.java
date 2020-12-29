import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
	
	Map<Integer, ArrayList<Integer>> graph;
	int V;
	boolean visited[];
	Stack<Integer> st;

	TopologicalSort(int V)
	{	graph= new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<V;++i)
			graph.put(i, new ArrayList<>());
		
		this.V=V;
		visited= new boolean[V];
		
		st=new Stack<>();
	}
	
	void addEdge(int source,int destination)
	{
		graph.get(source).add(destination);
		
	}
	
	void DFS(int i)
	{
		visited[i]=true;
		
		Iterator <Integer> it= graph.get(i).iterator();
		
		while(it.hasNext())
		{
			int k=it.next();
			
			if(!visited[k]) DFS(k);
			
			
		}
		
		st.push(i);
		
	}
	
	void sortUsingTopology()
	{
		
		
		for(int i=0; i<V;i++)
		{
			if(!visited[i])
			{
				
				DFS(i);
				
			}
			
		}
		
		System.out.println("Topological ordering of given graph is: ");
		while(st.empty()==false)
		{
			System.out.print(st.pop()+" ");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the number of vertices in your graph:");
		Scanner sc=new Scanner(System.in);
		int V= sc.nextInt();
		TopologicalSort ts=new TopologicalSort(V);
		System.out.println("Enter the number of edges in your graph:");
		int E= sc.nextInt();
		System.out.println("Enter the nodes between which an edge exist followed by space:");
		for(int i=0; i<E;i++)
		{	String[] temp= sc.next().split(",");
			ts.addEdge(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
						
		}
		
		
		
		ts.sortUsingTopology();
		
		
	}

}
