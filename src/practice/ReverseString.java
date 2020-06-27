package practice;

public class ReverseString {

	public static void main(String[] args) {
//		String input = "APURV";
//		byte[] a = input.getBytes();
//		byte[] result = new byte[a.length];
//		for(int i=0; i<a.length; i++)
//			result [i] = a[a.length-i-1];
//		System.out.println(new String(result));
//		
//		String input1 = "Hare Ram";
//		byte[] a1=input1.getBytes();
//		byte[] result1 = new byte[a1.length];
//		for(int j=0; j<a1.length; j++ )
//			result1[j] = a1[a1.length-j-1];
//		System.out.println(new String(result1));
//		
		String s = "AUTOMATION";
		int len = s.length();
		String rev = "";
		for (int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
			

	}

}
