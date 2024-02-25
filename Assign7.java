/**
 * 
 */
package com.hughes.handson;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Assign7 {

	/*
	  i/p:String a = "Computer"		
	  o/p: r e t u p m o C
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		sc.close();
		
		String rev="";
		int n=s.length();
		
		for(int i=n-1; i>=0; i--) {
			rev+=s.charAt(i);
			rev+=' ';
		}
		
		System.out.println(rev);		

	}

}
