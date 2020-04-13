
public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 
		 if (strs.length == 0)
			 return "";
		 else if (strs.length == 1)
			 return strs[0];
	        String max= strs[0], cur = "";
	        
	        for(int i=1;i<strs.length; i++) {
	        	cur = getCommonSubstring(max, strs[i]);
	        	if (cur.length()<max.length())
	        		max = cur;
	        }
	        return max;
	    }
	 public static String getCommonSubstring(String a, String b) {
		 
		 int i=0;
		 for(i=0;i<Math.min(a.length(), b.length());i++) {
			 if (a.charAt(i)!=b.charAt(i))
				 break;
		 }
		 return a.substring(0, i);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
