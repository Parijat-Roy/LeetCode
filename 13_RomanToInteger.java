import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		int num = 0, pointer =0;
		HashMap<Character, Integer> romans = new HashMap<Character, Integer>();
		
		romans.put('I', 1);
		
		romans.put('V',5);
		
		romans.put('X',10);
	
		romans.put('L', 50);
	
		romans.put('C', 100);
		
		romans.put('D', 500);
		
		romans.put('M', 1000);
		
		int i=0;
		while(pointer < s.length()) {
			i = pointer;
			if(pointer == s.length()-1)
			{
				num = num + romans.get(s.charAt(i));
				break;
			}
			
			if(romans.get(s.charAt(i)) < romans.get(s.charAt(i+1))) {
				num = num + romans.get(s.charAt(i+1)) - romans.get(s.charAt(i));
				pointer = i+2;
			}
			else if(romans.get(s.charAt(i)) >= romans.get(s.charAt(i+1))) {
				num = num + romans.get(s.charAt(i));
				pointer = i+1;
			}
		}
		
		return num;
    }
	public static void main(String[] args) {
		System.out.println(new RomanToInteger().romanToInt("VIII"));

	}

}
