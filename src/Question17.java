import java.util.Arrays;

import java.util.Scanner;
/*Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.*/
public class Question17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		int i=0, j=n-1;
		System.out.println("The rearranged array is: ");
		for(i=0;i<n/2;i++)
		{
			System.out.print(a[j--]+" ");
			System.out.print(a[i]+" ");
		}
	}

}
