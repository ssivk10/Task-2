import java.util.Scanner;

//Write a program to sort the elements in odd positions in descending order and
//elements in ascending order.
public class Question18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		int n = sc.nextInt();
		int i,j,t;
		int [] a = new int [n];
		System.out.println("Enter the array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+2;j<n;j+=2)
			{
				if(i%2==0)
					if(a[i]<a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				if(i%2==1)
				{
					if(a[i]>a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
		}
		System.out.println("The array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
