
public class LongestPalindromicSubstring {
	 public String longestPalindrome(String s) {
		 int n = s.length();
		 
		 if (n ==0 || n==1)
			 return s;
		 int start=0, maxlen =1, j=0;
		 boolean[][] markers = new boolean[n][n];
		 
		 for(int i=0;i<n;i++)
			 markers[i][i]=true;
		 
		 for(int i=0;i<n-1;i++)
			 if(s.charAt(i)==s.charAt(i+1)) {
				 markers[i][i+1] = true;
				 start = i;
				 maxlen = 2;
			 }
		 
		 for(int k=3;k<=n;k++) {
			 
			 for(int i=0;i<n-k+1; i++) {
				 j = i+k-1;
				 markers[i][j] =  markers[i+1][j-1] && s.charAt(i)==s.charAt(j);
				 if(markers[i][j] && k>maxlen) {
					 maxlen = k;
					 start = i;
				 }
			 }
		 }
		 
		 return s.substring(start, start + maxlen);
    }
	 
	 public static void main(String[] args) {
		 System.out.println(new LongestPalindromicSubstring().longestPalindrome("cbbd"));// babad elonnole cbbd
 	}

}
