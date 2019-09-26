
import java.util.Scanner;
import java.util.regex.Pattern;
public class ConsonantVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String : ");
		String str = new Scanner(System.in).nextLine();
        if(Pattern.matches("[A-Za-z]{1,}", str))
        {
            for(char c: str.toCharArray())
            {
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    System.out.print("Vowel ");
                else
                    System.out.print("Consonant ");
            }
        }
        else
        {
            System.out.println("Input String Contains Non Alphabetic Chars!");
        }
	}

}
