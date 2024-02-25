package com.hughes.handson;

/*
 * write a java program for below requirement.
i/p:Hyderabad
o/p:dabaredyH
 */



/**
 * @author user
 *
 */

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hyderabad";
		
		String rev="";
		
		int n=s.length();
		
		for(int i=n-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		
		System.out.println(rev);

	}

}
