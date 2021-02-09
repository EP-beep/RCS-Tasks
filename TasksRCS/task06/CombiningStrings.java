package task06;
import java.util.Scanner;

public class CombiningStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		System.out.print("Please enter one word: ");
		str1 = sc.nextLine();
		System.out.print("Please enter second word: ");
		str2 = sc.nextLine();
		sc.close();
		int wordlength1 = str1.length();
		int wordlength2 = str2.length();
		if ( wordlength1 > wordlength2 ) {
			System.out.println(str2 +str1 +str2);
		} else if (wordlength2 > wordlength1) {
			System.out.println(str1 +str2 +str1);
		} else if (wordlength1 == wordlength2) {
			System.out.println(str1 +str2 +str1);
		}
		
	}

}