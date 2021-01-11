import java.util.HashSet;
import java.util.Set;

public class Problem3_SlidingWindow {
public int lengthOfLongestSubstring(String s) {
        
        //Base case
        
        if(s.length()<=0) return 0;
        
        int left=0,right=0,res=0;
        Set<Character> set=new HashSet<>();
        
        
        
        while(left<s.length() && right<s.length())
        {
            if(!set.contains(s.charAt(right)))
            {   set.add(s.charAt(right));
                right++;
                res=Math.max(res,right-left);
            }
            else
            {   set.remove(s.charAt(left));
                left++;
            }
        }
            
        return res;
}
}
