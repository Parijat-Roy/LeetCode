
public class StringToInteger {
	 public int myAtoi(String str) {
		 long num = 0, pro=1, start=0;
		 str = str.trim();
		 if(str.isEmpty())
			 return 0;
		 char firstCharacter = str.charAt(0);
		 if(firstCharacter!='+' && firstCharacter!='-' && (int)firstCharacter<48 && (int)firstCharacter>57)
			 return 0;
		 
		 if(firstCharacter == '+')
			 {pro = 1;start=1;}
		 else if(firstCharacter == '-')
			 {pro=-1;start=1;}
		 
		 for(int i=(int)start;i<str.length() && (int)str.charAt(i)<=57 && (int)str.trim().charAt(i)>=48; i++) {
			 int cur = Integer.parseInt(String.valueOf(str.charAt(i)));
			 		 	 
			 num = num*10 + cur;
			 
			 if(num > Integer.MAX_VALUE && pro == 1)
				 return Integer.MAX_VALUE;
			 else if(num > Integer.MAX_VALUE && pro == -1)
				 return Integer.MIN_VALUE;
		 }
		 return (int)(num*pro);
	 }
	 
	 public static void main(String args[]) {
		 StringToInteger str = new StringToInteger();
		 System.out.println(str.myAtoi("2147483648"));
	 }
}
