package Practice;
import java.util.*;

public class Anagrams {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		char ch[] = new char[A.length()];
		
		if(A.length()!=B.length())
			System.out.println("Not an Anagram!");
		else
		{
			ch = A.toCharArray();
			System.out.println(ch);
		}
		sc.close();
	}
}
