import java.util.Scanner;
/*
 * Write a program to display the number in reverse order without use of String
 *functions.
 */
public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int t = n;
		int rev=0;
		while(t>=10)
		{
			rev=rev*10+t%10;
			t/=10;
		}
		rev=rev*10+t;
		System.out.println("Reverse is: "+rev);

	}

}
