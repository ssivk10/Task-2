import java.util.Arrays;
import java.util.Scanner;
//Java Program to print the smallest element in an array.
public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		int [] a = new int [n];
		System.out.println("Enter a limit: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		System.out.println("The smallest element of the array: "+a[0]);

	}

}
