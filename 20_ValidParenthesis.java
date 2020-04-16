import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
      public boolean isValid(String s) {
		  HashMap<Character,Character> complements = new HashMap<Character, Character>();
		  Stack<Character> stk = new Stack<Character>();
		  
		  complements.put('[', ']');
		  complements.put('(', ')');
		  complements.put('{', '}');
		  complements.put(']', '[');
		  complements.put(')', '(');
		  complements.put('}', '{');
		  
		  for(int i=0;i<s.length();i++) {
			  if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(' )
				  stk.push(s.charAt(i));
			  else {
				  if(stk.isEmpty() || stk.pop()!=complements.get(s.charAt(i))){
					  return false;
				  }
			  }
		  }
		  if(stk.isEmpty())
			  return true;
		  
		  return false;
	  }
      
	  public static void main(String[] args) {
		
	  }

}
