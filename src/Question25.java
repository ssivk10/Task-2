import java.util.Scanner;
/*
 * Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1: Input: 12345
Output:
1   5
 2 4
  3
 2 4
1   5
 */
public class Question25 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a string of odd length: ");
		String s = c.nextLine();
		int n=s.length();
		System.out.println("The output is: ");
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			for(int j=1;j<=n;j++)
			{
				
				if(j==i||j==n-i+1)
				{
					if(j==i&&j==n-i)i++;
					System.out.print(s.charAt(j-1));
					
				}
				else
					System.out.print(" ");
			}
		}

	}

}
