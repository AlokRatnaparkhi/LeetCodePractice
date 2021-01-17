import java.util.HashMap;
import java.util.Map;

public class KTimesSubstring {

	
	int countNumberOfSubstring(String s,int k)
	{ 	int count=0;
	
		for(int i=0;i<s.length();++i)
		{	
			Map<Character,Integer> mp=new HashMap<>();
		
			for(int j=i;j<s.length();++j)
			{	
				int cnt=mp.getOrDefault(s.charAt(j),0);
				
				mp.put(s.charAt(j), cnt+1);
				
				
				if(check(mp,k)==true)
				{
					count++;
				}
					
				
					
				
				
			}
			
			
			
		}
		
		
	
	
		return count;
		
	}
	
	boolean check(Map<Character,Integer> mp, int k)
	{ 
		boolean flag=true;
		
		for(int p: mp.values())
		{	
			if(k!=p) { flag=false;}
			
			
		}
		
		
		
		return flag;
		
	}
	
	
	public static void main(String[] args) {
		
		String s="0011222";
		int k=3;
		
		KTimesSubstring obj=new KTimesSubstring();
		
		System.out.println("The count is: "+obj.countNumberOfSubstring(s,k));
		
	}

}
