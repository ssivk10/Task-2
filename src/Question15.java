import java.util.Scanner;
//Java Program to print the duplicate elements of an array.
public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a[]= new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("The duplicate elements are: ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					System.out.print(" "+a[j]);
			}
		}
	}

}
