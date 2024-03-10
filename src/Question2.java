import java.util.Scanner;
//Write a program to define the functionality of a Bitwise operators.
public class Question2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("a & b: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int res = a&b;
		System.out.println("Bitwise AND & :"+res);
		res=a|b;
		System.out.println("Bitwise OR | :"+res);
		res=a^b;
		System.out.println("Bitwise XOR ^ :"+res);
		res=~a;
		System.out.println("Bitwise Complement ~ :"+res);
		res=a<<2;
		System.out.println("Bitwise Shift << :"+res);
		res=a>>2;
		System.out.println("Bitwise Shift >> :"+res);
	}

}
