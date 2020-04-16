import java.util.Arrays;

public class ThreeSumClosest {
	 public int threeSumClosest(int[] nums, int target) {
		   int minDiff =Integer.MAX_VALUE, ret =0;
	       Arrays.sort(nums);
	       
	       for(int i=0; i<nums.length-2;i++) {
	    	   int left = i+1;
	    	   int right = nums.length-1;
	    	   while(left<right) {
	    		   int sum = nums[i] + nums[left] + nums[right];
	    		   if(sum>target) {
	    			   right--;
	    		   }
	    		   else if(sum<=target) {
	    			   left++;
	    		   }
                 if(minDiff > Math.abs(sum-target))
	    				   {minDiff = Math.abs(sum-target);ret=sum;}
	    	   }
	       }
	       return ret;
	    }
	 public static void main(String[] args) {
		 System.out.println(new ThreeSumClosest().threeSumClosest(new int[] {-1,2,1,-4}, 1));
	 }
}
