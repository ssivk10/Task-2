import java.util.Scanner;
/*
 * Write a program to make such a pattern like a pyramid with numbers increased by 1.
 */
public class Question24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		int t=1, count=1;
		int i=1, j=1;
		for(i=1;count<=n;i++)
		{
			System.out.println();
			for(j=0;j<n-i;j++)
			{
					System.out.print(" ");
			}
			for(j=1;j<=i && count<=n;j++)
			{
				System.out.print(count+++" ");
			}
		}
		
	}

}
