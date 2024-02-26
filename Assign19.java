// user Aakash Kumar from Hughes Systique Pvt Ltd
package com.hughes.handson;

import java.util.*;

/**
 * @author user
 *
 */
public class Assign19 {

	/**
	 * Assume there is a hashtable with below values.
	 * Srinivas,srinivas,laptop,Laptop,Edu,Tech. Design code which shld display
	 * index of duplicate values(pls ignore case).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, List<Integer>> mpp = new HashMap<>();

		String arr[] = { " Srinivas", " srinivas", " laptop", " Laptop", " Edu", " Tech" };
		int n = 6;
		for (int i = 0; i < n; i++) {
			String ch = arr[i].toLowerCase();
			if (!mpp.containsKey(ch)) {
				// If the key doesn't exist, create a new list
				mpp.put(ch, new ArrayList<>());
			}
			// Add the index to the list associated with the key
			mpp.get(ch).add(i);
		}

		for (HashMap.Entry<String, List<Integer>> entry : mpp.entrySet()) {
			String key = entry.getKey();
			List<Integer> value = entry.getValue();
			// Your code here
			if (value.size() >= 2) {
				System.out.print("Key :" + key + " -> ");
				System.out.print(value);
				System.out.print('\n');

			}
		}
		
		//System.out.println(mpp);

	}

}
