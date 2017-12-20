
public class SpaceRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is it";
		
		int len = str.length();
		ReplaceFun(str, len);
	}
	
	public static void ReplaceFun(String arr,int len) {
		
		int spaceCount = 0, newLength, i = 0;
	char [] str = arr.toCharArray();
	System.out.println(arr);
	for (i = 0; i < len; i++) {
		 if (str[i] == ' ') {
		 spaceCount++;
		 }
		 }
		 newLength = len + spaceCount * 2;
		// str[newLength] = '\0';
		 for (i = len - 1; i >= 0; i--) {
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

}
