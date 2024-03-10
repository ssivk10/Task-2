import java.util.Scanner;
/*
 * Write a programs to print following pattern
 * 
 *     5
 *    454
 *   34543
 *  2345432
 * 123454321
 * 
 */
public class Question21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		int a[][]= new int [n][2*n-1];
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=n-i+1;j<=n;j++)
			{
				System.out.print(j);
			}
			
			for(int j=n-1;j>=n-i+1;j--)
			{
				System.out.print(j);
			}
		}
	}

}
