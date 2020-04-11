
import java.util.HashMap;


public class TwoSum {

	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	    	HashMap<Integer,Integer> numberPositions = new HashMap<Integer, Integer>();
	    	
	        for(int i=0;i<nums.length; i++) {
	        	if(numberPositions.containsKey(target-nums[i]))
	        		return new int[] {i, numberPositions.get(target-nums[i])};
	        	else
	        		numberPositions.put(nums[i], i);
	        }
	        return new int[] {-1,-1};
	    }
	}
}
