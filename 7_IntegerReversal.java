
public class IntegerReversal {
	 public int reverse(int x) {
		 if(Math.abs(x)>Math.pow(2, 31))
			 return 0;
		 
		 StringBuilder str = new StringBuilder(Integer.toString(Math.abs(x)));	  
         char temp;
         for(int i=0;i<str.length()/2; i++) {
        	temp = str.charAt(i);
        	str.setCharAt(i,str.charAt(str.length() - i-1));
        	str.setCharAt(str.length() - i-1, temp);
         }
	        
         try{
        	 int retx = Integer.parseInt(str.toString());
        	 return x>0? retx: -1 * retx;
         }
         catch(Exception e) {
        	 return 0;
         }
 }
	 public static void main(String args[]) {
		 IntegerReversal intr = new IntegerReversal();
		 System.out.println(intr.reverse(1534236469));
	 }
}
