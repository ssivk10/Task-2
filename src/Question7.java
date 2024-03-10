import java.util.Scanner;
/*
 * Evaluate the following expression on paper and on program and understand the
difference
a+=a++ + ++a + –a + a–; when a=28
 */
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 28;
		System.out.println("Pre operation, a = "+a);
		System.out.println("a+ = a++ + ++a + --a + a--");
		a+=a++ + ++a + --a + a--;
		/*
		 * a+=28 + 30 + 29 + 29 = 116; a=28
		 * a=28+116=144;
		 */
		System.out.println("Post operation, a = "+a);
	}
}
