import java.util.*;
public class StringBufferClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String s = sc.next();
		
		StringBuffer bf = new StringBuffer(s);
		
		int str_len = s.length();
		for(int i = 0; i<str_len; i++) {
			char ch = bf.charAt(i);
			if(ch>= 'a' && ch <= 'z') {
				int offset = ch - 'a';
				ch = (char)('A' + offset);
			}else if(ch >= 'A' && ch <= 'Z') {
				int offset = ch - 'A';
				ch = (char) ('a'+offset);
			}
			bf.setCharAt(i, ch);
		}
		System.out.println(bf);
	}
}
