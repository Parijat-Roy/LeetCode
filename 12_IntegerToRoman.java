import java.util.HashMap;

public class IntegerToRoman {
	public String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();
		
		int q = 0, i=0;
		int[] nums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		HashMap<Integer, String> romans = new HashMap<Integer, String>();
		
		romans.put(1, "I");
		romans.put(4, "IV");
		romans.put(5, "V");
		romans.put(9, "IX");
		romans.put(10, "X");
		romans.put(40, "XL");
		romans.put(50, "L");
		romans.put(90, "XC");
		romans.put(100, "C");
		romans.put(400, "CD");
		romans.put(500, "D");
		romans.put(900, "CM");
		romans.put(1000, "M");
		
		while(num > 0) {
			for(i=0;i<nums.length;i++) {
				if(nums[i]>num)
					break;
			}
			i--;
			q = num/nums[i];
			for(int j=0;j<q;j++)
				roman.append(romans.get(nums[i]));
			num = num % nums[i];			
		}
		return roman.toString();
    }

	
	public static void main(String[] args) {
		System.out.println(new IntegerToRoman().intToRoman(95));
	}

}
