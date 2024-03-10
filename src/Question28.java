import java.util.Scanner;
/*Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.*/
public class Question28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int sum=0;
		long t=1;
		for(int i=1;i<=n;i++)
		{
			sum+=t;
			t=t*10+1;
			System.out.print(t);
			if(i<n)System.out.print(" + ");
		}
		System.out.print(" = "+sum);

	}

}
