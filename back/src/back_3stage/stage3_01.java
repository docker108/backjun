package back_3stage;

import java.util.Scanner;

public class stage3_01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9 ; i++) {
			System.out.println( num + " * " + i + " = "+ num*i);
		}
		
		sc.close();
	}

}
