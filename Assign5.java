/**
 * 
 */
package com.hughes.handson;
import java.util.Scanner;
/**
 * @author user
 *
 */
public class Assign5 {

	/**
	 * 3)till 6 digits
 
i/p: 34567

o/p: Thirty four Thousand Five Hundred and Sixty Seven Only
 
i/p: 345

o/p: Three Hundred and Forty Five only
	 */
	private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 999999): ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Number name: " + convertNumberToWords(number));
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String word = "";

        if ((number / 1000000) > 0) {
            word += convertNumberToWords(number / 1000000) + " million ";
            number %= 1000000;
        }

        if ((number / 1000) > 0) {
            word += convertNumberToWords(number / 1000) + " thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            word += convertNumberToWords(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 10) {
                word += units[number];
            } else if (number < 20) {
                word += teens[number - 10];
            } else {
                word += tens[number / 10];
                if ((number % 10) > 0) {
                    word += " " + units[number % 10];
                }
            }
        }

        return word;
    }

}
