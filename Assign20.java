// user Aakash Kumar from Hughes Systique Pvt Ltd
package com.hughes.handson;

import java.util.*;

/**
 * @author user
 *
 */
public class Assign20 {

	/**
	 * create an program,which will display latitude and longitude based on
	 * cityname. Use Map . Hyd, chenn, calc, bihar, mum
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> longi = new HashMap<>();
		HashMap<String, String> lati = new HashMap<>();

		longi.put("Hyderabad", " 78.4772° E");
		longi.put("Chennai", " 80.2707° E");
		longi.put("Calcutta", " 88.3639° E ");
		longi.put("Bihar", " 85.2722° E ");
		longi.put("Mumbai", " 72.8777° E ");

		lati.put("Hyderabad", " 17.4065° N ");
		lati.put("Chennai", " 13.0827° N ");
		lati.put("Calcutta", " 22.5726° N ");
		lati.put("Bihar", " 25.9644° N ");
		lati.put("Mumbai", " 19.0760° N ");

		System.out.println("Enter the City Name from \n(Hyderabad / \nChennai / \nCalcutta / \nBihar / \nMumbai): ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		if (longi.containsKey(s)) {
			System.out.println("You have entered City Name as: " + s);
			System.out.println("It's longitude is: " + longi.get(s));
			System.out.println("It's latitude is: " + lati.get(s));
		} else {
			System.out.println("Invalid City Name!");
		}

	}

}
