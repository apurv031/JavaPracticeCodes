package practice;

public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Apurv";
		String rev = "";
		int leng = a.length();
		for (int i = leng-1 ; i >=0 ; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.print(rev);

	}

}
