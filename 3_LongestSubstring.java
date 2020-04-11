import java.util.HashMap;

public class LongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
	        HashMap<Character, Integer> lastPosition = new HashMap<Character, Integer>();
	        int count = 0, maxCount = 0, lastDuplicate = 0;
	        
	        for(int i=0;i<s.length();i++) {
	        	if(lastPosition.containsKey(s.charAt(i))) {
	        		count = i - Math.max(lastPosition.get(s.charAt(i)),lastDuplicate);
	        		if(count>maxCount)
	        			maxCount= count;
	        		lastDuplicate = Math.max(lastDuplicate,lastPosition.get(s.charAt(i)));
	        	}
	        	else {
	        		count++;
	        		if(count>maxCount)
	        			maxCount= count;	        		
	        	} 
	        	lastPosition.put(s.charAt(i),i);
	        }	        
	        return maxCount;
	    }
	 
	 public static void main(String args[]) {
		 LongestSubstring str = new LongestSubstring();
		 System.out.println(str.lengthOfLongestSubstring("wobgrovw"));// pwwkew  abcabcbb dvdf wobgrovw zwnigfunjwz
	 }
}
