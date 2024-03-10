import java.util.Scanner;
/*
 * Write a program to print a letters from the user input character to 'Z' without using
 * strings.
 */
public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a character: ");
		char ch = s.next().charAt(0);
		int c=ch;
		while(c>=65 && c<=90)
		{
			System.out.print((char)c);
			c++;
		}
	}

}
