import java.util.Scanner;
/*Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.*/
public class Question27 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter string 1 and string 2: ");
		String s1=c.nextLine();
		String s2=c.nextLine();
		int i=-1;
		if(s1.contains(s2))
			i=s1.indexOf(s2);
		System.out.print("Index is: ");
		System.out.println(i);
	}

}
