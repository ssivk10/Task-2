import java.util.Scanner;
//Java Program to left rotate the elements of a multidimensional array.

public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int t;
		int [][] a = new int [n][n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nArray before rotation: ");
		for(int i=0;i<n;i++)
		{
			System.out.println();
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
		
		for (int i=0;i<n/2;i++) 
		{
            for (int j=i;j<n-i-1;j++) 
            {                
                t=a[i][j];//t=0,0
                a[i][j]=a[j][n-i-1];//0,0=0,2
                a[j][n-i-1]=a[n-i-1][n-j-1];//0,2=2,2
                a[n-i-1][n-j-1]=a[n-j-1][i];//2,2=2,0
                a[n-j-1][i]=t;//2,0=t
            }
        }
		System.out.println("\nArray after rotation: ");
		for(int i=0;i<n;i++)
		{
			System.out.println();
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
