package codingTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] chars = a.toCharArray();
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }
	
		
	}
}
