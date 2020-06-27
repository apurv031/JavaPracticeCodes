package practice;

public class RevString {

	public static void main(String[] args) {
	//1 using for loop
		String s = "AUTOMATION";
		int len = s.length();
		String rev = "";
		for (int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	
	//2 using Stringbuffer
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		String a = "Selenium";
		int leng = a.length();
		String reve = "";
		for (int i = leng-1; i>=0; i--) {
			reve = reve + a.charAt(i);
		}
		System.out.println(reve);
		
		
	}
	

}
