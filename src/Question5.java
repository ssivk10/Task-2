import java.util.Scanner;
//Write a program to evaluate the polynomial equation.
public class Question5 {
	public static void main(String[] args) {
		double a, b, c, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, & c: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		x=(-b+Math.sqrt(b*b-(4*a*c)))/2*a;
		System.out.print("x= "+x);
		x=(-b-Math.sqrt(b*b-(4*a*c)))/2*a;
		System.out.print(" and x= "+x);

	}

}
