package com.hughes.handson;


/*
 * "aksajd5676@$%^"
 
No of Numbers:
No of Alpahbets:
Total Size:
 */



/**
 * @author user
 *
 */
public class Assign2 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aksajd5676@$%^";
				
				int cnt1=0, cnt2=0, tot=0;
				
				for(int i=0; i<s.length(); i++) {
					tot++;
					if(s.charAt(i)>='0' && s.charAt(i)<='9') cnt1++;
					else if(s.charAt(i)>='a' && s.charAt(i)<='z') cnt2++;
				}
				
				System.out.println("No. of Digits: ");
				System.out.println(cnt1);
				
				System.out.println("No of Alphabets: ");
				System.out.println(cnt2);
				
				System.out.println("Total Size: ");
				System.out.println(tot);

	}

}
