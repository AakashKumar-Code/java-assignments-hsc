// user Aakash Kumar from Hughes Systique Pvt Ltd
package com.hughes.handson;

/**
 * @author user
 *
 */

public class Assign16 {

	/**
	 * Write a Java program to remove duplicate elements from a given array and
	 * return the updated array length. Sample array: [20, 20, 30, 40, 50, 50, 50]
	 * After removing the duplicate elements the program should return 4 as the new
	 * length of the array.
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
		int arr[] = { 20, 20, 30, 40, 50, 50, 50 };
		int n = 7;
		System.out.println("Original Array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println('\n');
		int num = numOfElementsAfterRemovingDuplicates(arr, n);
		System.out.print("Number of elements left After Removing Duplicates: " + num);

	}

}
