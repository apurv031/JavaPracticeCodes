package practice;

public class SwapString {

	public static void main(String[] args) {
		String a= "Apurv";
		String b= "Kumar";
		System.out.println("Before swapping::a="+a+ " b="+b);
		a=a+b;//append
		
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println("After swapping::a="+a+ " b="+b);
	}

}
