import java.util.Scanner;
/*
 * Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics.
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = s.nextInt();
		int max=100+n;
		
		for(int i=1;i<=4;i++)
		{
			System.out.println("\nGroup "+i+" : ");
			for(int j=100+i;j<=100+n;j+=4)
				System.out.println(j);
		}
	}

}
