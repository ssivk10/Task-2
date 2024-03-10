import java.util.Scanner;
//Program to Check Whether a Character is an Alphabet or not.
public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch))
			System.out.println("The character is an alphabet.");
		else
			System.out.println("The character is not an alphabet.");

	}

}
