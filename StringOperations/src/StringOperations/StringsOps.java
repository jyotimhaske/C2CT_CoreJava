package StringOperations;

import java.util.*;

public class StringsOps {
	public static void main(String[]args){
		// sum of two strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 and 2 below:");
		String s1 = sc.next();
		String s2 = sc.next();
		
		String add = s1 + s2;
		System.out.println("total sum of the strings: "+add.length());
		
		// Determining the lexicographically Larger string
		
		System.out.print("1st string lexicographically larger than 2nd: ");
		System.out.print(s1.compareTo(s2)>0?"Yes!\n":"No!\n");

		//Converting the first letter of the strings
		
		System.out.println("After first alphabet conversion: "+s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+Character.toUpperCase(s2.charAt(0))+s2.substring(1));
	}

}
