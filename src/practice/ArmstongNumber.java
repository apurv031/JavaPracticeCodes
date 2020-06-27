package practice;

public class ArmstongNumber {			//153 = 1  5  3  = 1*1*1 + 5*5*5 +3*3*3
	
	public static void isArmstrongNumber(int x) 
	{
		int cube = 0;
		int r;
		int t;
		t=x;
		
		while(x>0)
		{
			r=x%10;
			x=x/10;
			cube = cube+(r*r*r);
		}
			if(t==cube){
				System.out.println("It is an Armstrong Number::"+t);
			}
			else
			{
				System.out.println("It is not an Armstrong Number::"+t);
			}
			
	}
	
	
	public static void main(String[] args) {
		isArmstrongNumber(370);
		isArmstrongNumber(0);
		isArmstrongNumber(375);
	}

}
