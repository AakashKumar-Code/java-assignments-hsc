package com.hughes.handson;

/**
 * @author user
 *
 */
public class Assign13 {

	/*
	 * 1)Display 'a','b','c','d' in reverse order using Arrays.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = { 'a', 'b', 'c', 'd' };

		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i]);
		}

		System.out.println("");

		for (int i = 3; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
