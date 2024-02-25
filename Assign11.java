/**
 * 
 */
package com.hughes.handson;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Assign11 {

	/**
	 * Based on the i/p,you need to display whether it is integer or float or
	 * character or string.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		sc.close();

		Boolean isFloat = false;
		int n = s.length();

		if (n == 1) {
			if (!(s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
				System.out.print("Character");
				return;
			}
		}

		for (int i = 0; i < n; i++) {
			if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) == '.'))) {
				System.out.print("String");
				return;
			}
			if (isFloat == true && s.charAt(i) == ('.')) {
				System.out.print("String");
				return;
			}

			if (s.charAt(i) == '.')
				isFloat = true;
		}

		if (isFloat) {
			System.out.print("Float");
			return;
		}

		System.out.print("Integer");

	}

}
