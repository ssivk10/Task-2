import java.util.Scanner;
/*
 * Write a programs to print following pattern
 *      1
 *     121
 *    12321
 *   1234321
 *  123454321
 *  
 */
public class Question20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a[][]= new int [n][2*n-1];
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			for(int j=0;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(j);
			}
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
		}
	}

}
