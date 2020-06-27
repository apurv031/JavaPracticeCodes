package practice;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "(&/*&SELENIUM";
		System.out.println("Before removing junk::"+s);
		
		//Regular Expression[^]--regular expression is represented as square bracket ^ is 'not'
		
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println("After removing junk::"+s);

		
		String s1="/*-Selenium **) Webdriver(*(&@@ v3.14";
		System.out.println("Before removing junk::"+s1);
		
		s1=s1.replaceAll("[^a-zA-Z0-9.]", " ");
		System.out.println("After removing junk::"+s1);
		
	}

}
