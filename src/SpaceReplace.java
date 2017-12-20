
public class SpaceReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is it";
		
		int len = str.length();
		ReplaceFun(str, len);

	}

	public static void ReplaceFun(String arr, int length) {
		int spaceCount = 0, newLength, i = 0;
		char [] str = arr.toCharArray();
		for (i = 0; i < length; i++) {
		 if (str[i] == ' ') {
		 spaceCount++;
		 }
		 }
		 newLength = length + spaceCount * 2;
		 str[newLength] = '\0';
		 for (i = length - 1; i >= 0; i--) {
		 if (str[i] == ' ') {
		 str[newLength - 1] = '0';
		str[newLength - 2] = '2';
		 str[newLength - 3] = '%';
		 newLength = newLength - 3;
		 } else {
		 str[newLength - 1] = str[i];
		 newLength = newLength - 1;
		 }
		 }
		 }
	
}
