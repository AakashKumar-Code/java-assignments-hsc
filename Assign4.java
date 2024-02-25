package com.hughes.handson;

import java.util.Scanner;

/*
 * 2) 

i/p: a b c d e f

o/p: f1 e2 d3 c4 b5 a6

 */


/**
 * @author user
 *
 */
public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String ans="";
		int n=s.length();
		for(int i=0; i<n; i++) {
			ans+=s.charAt(n-i-1);
			ans+=String.valueOf(i+1);
			ans+=' ';
		}
		System.out.println("Original String: "+ s);
		System.out.println("New String: " + ans);
	}

}
