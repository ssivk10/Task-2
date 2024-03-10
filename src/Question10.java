import java.util.Scanner;
/*
 * Using Recursion, reverse the string such as
Eg 1: Input: one two three
Output: three two one
 */
public class Question10 {
	
	public static String reverse(String s) {
		int k = s.indexOf(" ");
		if(k==-1) {
			return s;
		}
		else {
			return reverse(s.substring(k+1))+" "+s.substring(0,k);
		}
	}

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("The reverse is: "+ reverse(s));
	}

}
