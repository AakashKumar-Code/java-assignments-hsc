//user Aakash Kumar from Hughes Systique Pvt Ltd
package com.hughes.handson;

import java.util.*;

/**
 * @author user
 *
 */
public class Assign17 {

	/**
	 * Program to find duplicate numbers in an array if it contains
	 * multiple duplicates?
	 */
	static int numOfElementsAfterRemovingDuplicates(int arr[], int n) {
		int ans[] = new int[n];
		ans[0] = arr[0];
		int ind = 1;

		for (int i = 1; i < n; i++) {
			Boolean exists = false;
			for (int j = 0; j < ind; j++) {
				if (arr[i] == ans[j]) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				ans[ind++] = arr[i];
			}
		}
		System.out.println("Array after removing duplicates: ");
		for (int i = 0; i < ind; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println('\n');
		return ind;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of Array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements of the array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Original Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println('\n');
		int num = numOfElementsAfterRemovingDuplicates(arr, n);
		System.out.print("Number of elements left After Removing Duplicates: " + num);
		sc.close();

	}

}
