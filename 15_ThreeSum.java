import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 List<List<Integer>> aList = new ArrayList<>();
		 
		 Arrays.sort(nums);
		 int cur, first, last, sum;
		 ArrayList<String> arl = new ArrayList<String>();
		 
		 for(int i=0;i<nums.length-2;i++) {
			 cur = i;
			 first = cur+1;
			 last = nums.length - 1 ;

			 if(cur!=0 && nums[cur] == nums[cur-1])
				 continue;
			 
			 while(first<last) {
				 sum = nums[cur] + nums[first] + nums[last];
				 if(sum < 0)
					 first++;
				 else if (sum > 0)
					 last --;
				 else if(sum==0){
					 aList.add(Arrays.asList(nums[cur], nums[first], nums[last]));
					 
					 while(first<last && nums[first]==nums[first+1])
						 first++;
					 while(first<last && nums[last]==nums[last-1])
						 last--;
					 
					 first++;last--;
				 }
			 }
		 }
		 		 
	     return aList;
	    }
	 
	public static void main(String[] args) {
		System.out.println(new ThreeSum().threeSum(new int[] {-1,0,1,2,-1,-4}));
	}

}
