import java.util.Arrays;
import java.util.Scanner;
/*
 * Given two sorted arrays, merge them such that the elements are not repeated.
 */
public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter m: ");
		int m = sc.nextInt();
		int [] a = new int[n];
		int [] b = new int[m];
		int [] c = new int[m+n];
		int count=n;
		boolean check=false;
		System.out.println("Enter a: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			c[i]=a[i];
		}
		Arrays.sort(a);
		System.out.println("Enter b: ");
		for(int j=0;j<m;j++)
		{check=false;
			b[j]=sc.nextInt();
			for(int k=0;k<n;k++)
				if(c[k]==b[j])
					{check=true;}
			if(!check) {
				c[count++]=b[j];
				check=false;
			}
		}
		Arrays.sort(c, 0, count);
		System.out.println("The new array: ");
		for(int i=0;i<count;i++)
		System.out.print(c[i]+" ");
	}

}
