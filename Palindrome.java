import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, sum=0, temp, rev=0;
		int n = 867888;
		temp=n;
		while(n>0)
		{
			a=n%10;
			rev=(rev*10)+a;
			n=n/10;
			if(a%2==0) {
				sum = sum + a;
			}
			
			
		}
		System.out.println("sum" + sum);
		if(temp==rev) {
			if(sum>25) {
			System.out.println("Number is palindrome and also sum is greater than 25");
			}
			else 
			{
			System.out.println("Number is palindrome and also sum is less than 25");

			}
			
		}
		else
				System.out.println("number is not palindrome");
		
		
	}
	
}