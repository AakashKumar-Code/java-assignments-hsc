/**
 * 
 */
package com.hughes.handson;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class Assign14 {

	/**
	 * "cat" "bat" "rat" "computer"
	 * 
	 * in an array
	 * 
	 * and display the contents in array in ascending order.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "cat", "bat", "rat", "computer" };

		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + ',');
		}

		System.out.println(" ");

		Arrays.sort(a);

		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + ',');
		}

	}

}
