package practice;

public class MissingNo {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 6} ;
		int expElem = a.length+1;
		int totalSum = expElem*(expElem+1)/2;
		System.out.println(totalSum);
		
		int sum = 0;
		for(int i =0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("missing no. is" + (totalSum-sum));
	
		//-------Naveen--------//
		System.out.println("----- second");
		int b[] ={10,11,12,13,15};
		int sum1 = 0;
		for(int c=0; c<b.length; c++)
		{
			sum1 = sum1+b[c];
			
		}
		System.out.println(sum1);
		int sum2=0;
		for(int d=2; d<=6; d++)
		{
			sum2=sum2+d;
			
		}
		System.out.println(sum2);
		System.out.println("Missing number is::"+(sum2-sum1));
		
		//--------even numbers-------//
		
		System.out.println("----- third");
		int e[]={10,12,14,18,20};
		int leng = e.length;
		int sum3 = 0;
		for(int f=0; f<leng ; f++)
		{
			sum3=sum3+e[f];
		}
		System.out.println(sum3);
		int expCounts = leng+1;
		int expTotalCount = expCounts*(2*10+leng*2)/2;//n[2a+(n-1)d]/2
		System.out.println("Missing number between even numbers is::"+(expTotalCount-sum3));
		
	
	}
	
	
}
