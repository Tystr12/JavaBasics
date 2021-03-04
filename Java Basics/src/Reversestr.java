import java.util.Arrays;
import java.util.Collections;

public class Reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "world";
		
		System.out.println(reverse(one));
		
	}
	
	public static String reverse(String str) {
		
		
		String rev = new StringBuilder(str).reverse().toString();
		return rev;
//		int len = str.length()-1;
//	
//		
//		for (int i = len; i <= 0; i) {
//			String result = "";
//			result += str.charAt(i);
//			i--;
//			return result;
//		}
//		return "did not work";		
	}

}
