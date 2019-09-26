import java.util.Scanner;

public class Letter {

		

	
		public static void main(String[ ] arg)
		{
		String res = "";
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine(); 
		System.out.println("Enter a word : ");
		//char ch=sc.next( ).charAt(0);	 	
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//		{
//		System.out.println("Entered character "+ch+" is  Vowel"); 
//		}
//		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
//			System.out.println("Entered character "+ch+" is Consonant");
//		      else
//			System.out.println("Not an alphabet");	
		
		char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
	
		for(int i=0;i<str.length();i++) {
			int j =0;
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')) {
				while(j<10) {
					if(str.charAt(i)==vowel[j]){
						
						res = "Vowel";
						break;
					}	
					else if(j<10){
						j++;
						res = "Consonant";
						
					}
					else {
						res = "Consonant";
						break;
					}
				}
			System.out.println("Result" + res);
				}
			else {
				System.out.print("Not a word");
				break;
			}
			}
		}

	
}