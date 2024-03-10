import java.util.Scanner;
//Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
//details.
public class Question30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int [][] a = new int [n][n];
		int [][] b = new int[n][n];
		int k=0;
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int r=0, c=n-1;
		while(r<2*n-1) 
		{
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<n;j++)
				{
					if(i+j==r) System.out.print(a[i][j]+" ");
				}
			}
			
			r++;
			System.out.println();
		}
		
		
		

	}

}
