import java.util.HashMap;

public class ContainerWithMostWater {
	   public int maxArea(int[] height) {
	       int maxArea = 0, curArea = 0;
	       
	       for(int i=0, j = height.length -1;i!=j;) {
	    	   curArea = Math.min(height[i], height[j])* (j-i);
	    	   if(curArea > maxArea)
	    		   maxArea = curArea;
	    	   
	    	   if(height[i]<height[j])
	    		   i++;
	    	   else 
	    		   j--;
	       } 
	       return maxArea;
	    }
	public static void main(String[] args) {
		System.out.println(new ContainerWithMostWater().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}

}
