import java.util.ArrayList;
import java.util.List;

public class LPSE {

	
	String findLongestPalindrome(String seq)
	{	int n= seq.length();
		//Base case
		int start=0,end=0,max=0;
		if(seq==null || seq.length()<1) return "";
		
		boolean table [][]= new boolean [n][n];
		
		for(int i=0; i<n;++i)
			table[i][i]=true;
		
		for(int cl=2;cl<=n;cl++)
			{
				for(int i=0;i<n-cl+1;i++)
					{	int j= cl+i-1;
					
						if(seq.charAt(i)==seq.charAt(j) && (cl==2 || table[i+1][j-1]))
						{
							table[i][j]=true;
							
							if(cl>max)
							{
								max=cl;
								start=i;
								end=j;
								
							
							}
							
						}
						else
						{
							continue;
						}
					 
					
						
					}
			
			}
		
		
		return seq.substring(start,end+1);
		
	}
	
	
	
	public static void main(String[] args) {
		
		String seq="aacabdkacaa";
		
		LPSE lp=new LPSE();
		
		 List<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
	        
		
		System.out.println("Longest palindrome is: "+lp.findLongestPalindrome(seq));
		
		

	}

}
