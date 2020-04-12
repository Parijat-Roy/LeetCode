
public class isPalindrome {
	public boolean checkForPalindrome(int x) {
		String str = Integer.toString(x);
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length() - i - 1))
				return false;
		}
		return true;
    }
	public static void main(String[] args) {
		System.out.println(new isPalindrome().checkForPalindrome(1234));
	}
}