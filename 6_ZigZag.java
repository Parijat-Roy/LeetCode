
public class ZigZag {
	 public String convert(String s, int numRows) {
		 
		 	if(numRows == 1)
		 		return s;
		 	StringBuilder str = new StringBuilder();
		    int skipValue = 0, count = 0;
		    int rowsTop = 0, rowsBottom = 0, zigzagBottom = 0, zigzagTop = 0;
		    
		    for(int j=1; j<=numRows; j++) {
		    	if(j==1 || j==numRows) {
		    		skipValue = (2*numRows-2);
		    		for(int i=j;i<=s.length();i+=skipValue)
		    			str.append(s.charAt(i-1));
		    	}
		    	else {
		    		rowsBottom = numRows - j;
		    		rowsTop = j-1;
		    		zigzagBottom = numRows - 2 -j +1;
		    		zigzagTop = j-2;
		    		skipValue = rowsBottom + zigzagBottom + 1;
		    		count =0;
		    		for(int i=j;i<=s.length();i+=skipValue,count++)
		    			{
		    				str.append(s.charAt(i-1));
		    				if(count%2 == 1)
		    					skipValue = rowsTop + zigzagTop + 1;
		    				else	
		    					skipValue = rowsBottom + zigzagBottom + 1;
		    			}
		    	}
		    }
		    return str.toString();
	    }
	 
	 public static void main(String args[]) {
		 ZigZag sg = new ZigZag();
		 System.out.println(sg.convert("humpyd", 1));
	 }
}
