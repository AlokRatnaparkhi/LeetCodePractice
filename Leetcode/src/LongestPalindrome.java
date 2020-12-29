import java.util.Scanner;

public class LongestPalindrome {
	
	
	int checkPalindrome(String in)
	{	int table [] []= new int[in.length()][in.length()];
		int left = 0,right = 0,largestPal=0;
		
		for(int i=0;i<in.length();++i)
			table[i][i]=1;
		
		for(int cl=2;cl<=in.length();++cl)
		{	
			for(int i=0;i<=in.length()-cl;++i)
			{
				int j= i+cl-1;
				
				if(in.charAt(i)==in.charAt(j) && cl==2)
				{
					table[i][j]=2;
				}
				else if(in.charAt(i)==in.charAt(j))
				{
					table[i][j]= table[i+1][j-1]+2;
					
				}
				else
				{
					table[i][j]=Math.max(table[i][j-1],table[i+1][j]);
						
				}
				
				if(largestPal<table[i][j])
				{	
					left=i;
					right=j;
					System.out.println(largestPal+" >>>"+table[i][j]);
					System.out.println(left+">>>>>>>>>>>>>>>.."+right);
					
					largestPal=table[i][j];
					
					
				}
				
				
			}
			
			
		}
		
		System.out.println(in.substring(left, right+1));
		return table[0][in.length()-1];
	}

	public static void main(String[] args) {
		LongestPalindrome pal=new LongestPalindrome();
		
		String seq="aacabdkacaa";
		
		System.out.println("Length of greatest palindrome is "+pal.checkPalindrome(seq));
		
		
		
	}

}
