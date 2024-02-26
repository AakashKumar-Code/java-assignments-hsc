// user Aakash Kumar from Hughes Systique Pvt Ltd
package com.hughes.handson;

import java.util.*;

/**
 * @author user
 *
 */
public class Assign18 {

	/**
	 * assume there is an array with 6 elementsie {bat,rat,cat,mat,TV,Laptop}.
	 * Deisgn a hashmap whose values are same as array element value and whose keys
	 * are index no in hashmap.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "bat", "rat", "cat", "mat", "TV", "Laptop" };
		HashMap<Integer, String> mpp = new HashMap<Integer, String>();

		int n = 6;
		for (int i = 0; i < n; i++) {
			mpp.put(i, arr[i]);
		}

		System.out.print(mpp);

	}

}
