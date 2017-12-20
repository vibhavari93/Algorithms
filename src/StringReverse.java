
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is !";
		String result1 = reversal(s);
		System.out.println(result1);
	}
	
	public static String reversal(String s) {
		
		char [] arr = s.toCharArray();
		char temp;
		for(int i = 0, j= s.length()-1; i < s.length()/2 ; i++, j--)
		 {
		
		temp = arr[i];	
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}
		String s1 = new String(arr);
		return s1;
	}

}
