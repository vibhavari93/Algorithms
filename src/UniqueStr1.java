
public class UniqueStr1 {
	
	public static void main(String[] args) {
		
		String str1 = "agdhbg";
		boolean check = isUnique(str1);
		System.out.println(check);
				
		
		
	}

	public static boolean isUnique(String str) {
		
		boolean [] char_At = new boolean[256];
		for(int i=0; i<str.length();i++) {
			
			int val = str.charAt(i);
			if(char_At[val] == true) return false;
			char_At[val] = true;
			
			
		}
		
		return true;
		
		
	}
	
}
