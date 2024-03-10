import java.util.Scanner;

public class Question22 {
/*
 * Write a programs to print following pattern
 *  * * * * * * *
 *   * * * * * * 
 *    * * * * *
 *     * * * *
 *      * * *
 *       * *
 *        *
 */
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = c.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.println();
			for(int j=n-i;j>0;j--)
			{
					System.out.print(" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
		}

	}

}
