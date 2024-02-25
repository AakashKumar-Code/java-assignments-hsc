/**
 * 
 */
package com.hughes.handson;

import java.util.*;

/**
 * @author user
 *
 */
public class Assign15 {

	/**
	 * if i give input as 1, then data shld be inserted input is 2 then data shld be
	 * deleted input is 3 then data shld be displayed input is 4 then duplicate
	 * values shld be displayed
	 * 
	 * note:switch
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> a = new Vector<Integer>();

		System.out.print("No. to be operations: ");

		Scanner sc = new Scanner(System.in);
		int numOfOps = sc.nextInt();

		for (int i = 0; i < numOfOps; i++) {
			System.out.print("Which Operation: ");
			int opNo = sc.nextInt();

			switch (opNo) {
			case 1:
				System.out.print("No. to be added: ");
				int num = sc.nextInt();
				a.add(num);
				break;
			case 2:
				System.out.print("No. to be deleted: ");
				int del = sc.nextInt();
				if (a.indexOf(del) != -1) {
					a.remove(a.indexOf(del));
				}
				break;
			case 3:
				System.out.print("Current Vector:- ");
				System.out.println(a);
				break;
			case 4:
				Map<Integer, Integer> frequencyMap = new HashMap<>();
				for (int value : a) {
					frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
				}
				boolean duplicatesExist = false;
				for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
					if (entry.getValue() > 1) {
						System.out.println(entry.getKey() + " is duplicated " + (entry.getValue() - 1) + " times");
						duplicatesExist = true;
					}
				}
				if (!duplicatesExist) {
					System.out.println("No duplicates found.");
				}
				break;
			}
		}
		sc.close();

	}

}
