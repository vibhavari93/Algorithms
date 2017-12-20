
public class UiqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		str = "abcde";
		String str1 = "deefg";
		boolean truestr = isUniqueChars2(str1);
		System.out.println(truestr);
		

	}
	
	public static boolean isUniqueChars2(String str) {
		 boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
	int val = str.charAt(i);
		 if (char_set[val]) return false;
		 char_set[val] = true;
		 }
		 return true;
		 
	}

}
