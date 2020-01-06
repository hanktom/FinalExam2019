package com.fju.exam1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many factorials?");
		String line = scanner.nextLine();
		int m = Integer.parseInt(line);
		for(int i = 1; i < m + 1 ; i++){
			System.out.print(i + "! = ");
			System.out.println(i);
		}
	}

}
