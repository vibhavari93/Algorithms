
public class CheckDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Thisisit";
		char [] arra = str.toCharArray();
		removeDuplicate(arra);
	}
	

	public static void removeDuplicate(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		boolean[] hit = new boolean[256];
		 for (int i = 0; i < 256; ++i) {
		 hit[i] = false;
	 }
		 hit[str[0]] = true;
		 int tail = 1;
		 for (int i = 1; i < len; ++i) {
		 if (!hit[str[i]]) {
		 str[tail] = str[i];
	 ++tail;
		 hit[str[i]] = true;
		 }
		 }
		 str[tail] = 0;
		}
		

}
