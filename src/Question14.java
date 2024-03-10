import java.util.Scanner;
//Java Program to copy all elements of one array into another array.
public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Enter array 1: ");
		int a[]= new int [n];
		int [] b = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println("The copied array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
