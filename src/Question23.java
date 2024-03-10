import java.util.Scanner;
/*
 * Write a programs to print following pattern:
 *   6 6 6 6 6 6
 *    5 5 5 5 5
 *     4 4 4 4
 *      3 3 3
 *       2 2
 *        1
 */
public class Question23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		int t=n;
		for(int i=n;i>0;i--)
		{
			System.out.println();
			for(int j=n-i;j>0;j--)
			{
					System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(t +" ");
			}
			t--;
		}
	}
}
