/**
 * 
 */
package com.hughes.handson;
import java.util.Scanner;


/**
 * @author user
 *
 */
public class Assign9 {

	/**
	 * 2) 
Display the given String as below.
i/p: Computer
o/p:
c
o
m
p
u
t
e
r
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		sc.close();
		
		int n=s.length();
		
		for(int i=0; i<n; i++) {
			System.out.println(s.charAt(i));
		}
		

	}

}
