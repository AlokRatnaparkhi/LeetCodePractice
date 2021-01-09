import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	Problem 15
 * 
 * Find 3sum
 * 
 * 
 * */


public class Problem15_ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums){
		
		//Base case
		
		if(nums.length<3) return new ArrayList<List<Integer>>();
						
		//Sort the array
		Arrays.sort(nums);
		
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		
		for(int i=0; i<nums.length-2;++i)
		{
			int low=i+1;
			int high=nums.length-1;
			
			//Avoid duplicate checks
			if(i>0 && nums[i]==nums[i-1]) continue;
			
			
			while(low < high)
			{	int sum=nums[i]+nums[low]+nums[high];
			
				if(sum==0)
				{	
					result.add(Arrays.asList(nums[i],nums[low],nums[high]));
					low++;
					high--;
					
					while(low<high && nums[low]==nums[low-1]) low++;
					while(low<high && nums[high]==nums[high+1]) high--;
				}
				else if(sum < 0) low++;
				else high--;
				
				
			}
				
			
		}
		
		return result;
		
	
	}
	
	
	public static void main(String[] args) {
		
		int[] nums=new int[] {-1,0,1,2,-1,-4};
		
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		Problem15_ThreeSum t= new Problem15_ThreeSum();
		
		result=t.threeSum(nums);
		
		
		for(List<Integer> i: result)
		{
			System.out.print("[");
			
			for(Integer k:i)
			{
				System.out.print(k+" ");
			}
			System.out.println("]");
		}
		
		
		
	}

}
