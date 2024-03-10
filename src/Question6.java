import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		System.out.println("Enter a & b: ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x=0;
		System.out.println("a & b: "+a+" "+b);
		System.out.println("++a-b--: "+(++a-b--));
		System.out.println("a & b: "+a+" "+b);
		System.out.println("a%b++: "+(a%b++));
		System.out.println("a & b: "+a+" "+b);
		System.out.println("a*=b+5: "+(a*=b+5));
		System.out.println("a & b: "+a+" "+b);
		System.out.println("x: "+x);
		System.out.println("x=69>>>2: "+(x=69>>>2));
		System.out.println("x: "+x);
	}

}
