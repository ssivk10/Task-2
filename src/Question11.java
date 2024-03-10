import java.util.Scanner;
/*
 * Write a program to give the following output for the given input:
Eg 1: Input: a1b10
Output: abbbbbbbbbb
 */
public class Question11 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc=new Scanner(System.in);
		String str,tempstr="";
		str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				int n=Integer.parseInt(str.substring(i+1));
				for(int k=0;k<n;k++)
					tempstr+=str.charAt(i);
				str=str.substring(0,i);
			}
		}
		System.out.println(new StringBuilder(tempstr).reverse().toString());

	}

}
