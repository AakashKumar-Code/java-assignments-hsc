/**
 * 
 */
package com.hughes.handson;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Assign6 {

	/**
	 * 4)

i/p: 3

o/p: +++
 
i/p: 4

o/p: ++++
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		for(int i=0; i<num; i++) {
			System.out.print("+");
		}
	}

}
