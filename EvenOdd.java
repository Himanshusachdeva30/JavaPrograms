import java.util.Scanner;

public class EvenOdd {


	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("The number entered is:" + a);
		{
			if(a%2==0) {
				{
					if(a>=20&& a<=30) {
						
				System.out.println("Jerry");
			}
					else
						System.out.println("the number is even");}
				
				}
			else {
				if(a>=20&& a<=30) {
					System.out.println("Tom");	
				}
				else
					System.out.println("the number is odd");
			}
			
		}
	}

}
