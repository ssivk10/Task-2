import java.util.Scanner;
/*
 * Write a program to print the following pattern for the given input number.
Eg 1: Input: 4
Output:
********
***__***
**____**
*______*
**____**
***__***
********
 */
public class Question26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("The output is: ");
		for(int i=1;i<2*n;i++)
		{
			System.out.println();
			for (int j=1;j<=n;j++)
			{
				if(j>=Math.abs(n-i)+2 && (j<=Math.abs(-n-i+1)))
					System.out.print("_");
				else
					System.out.print("*");
			}
			for (int j=n;j>=1;j--)
			{
				if(j>=Math.abs(n-i)+2 && (j<=Math.abs(-n-i+1)))
					System.out.print("_");
				else
					System.out.print("*");
			}
		}
	}
}
