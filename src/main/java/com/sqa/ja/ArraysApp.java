/**
 * File Name: ArraysApp.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 22, 2017
 */
package com.sqa.ja;

import com.sqa.ja.helpers.*;

/**
 * ArraysApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class ArraysApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] ages;
		// ages = new int[] { 3, 6, 23, 456, 23 };
		// for (int age : ages) {
		// System.out.println(age);
		// }
		/*
		 * Declare an array of char with 5 element, show 2 forms. You can also
		 * iterate through elements and display contents. Remember chars are
		 * used literally with single quotes ‘A’.
		 */
		char[] charArray1 = { 'H', 'E', 'L', 'L', 'O' };
		char[] charArray2 = new char[5];
		charArray2[0] = 'W';
		charArray2[1] = 'O';
		charArray2[2] = 'R';
		charArray2[3] = 'L';
		charArray2[4] = 'D';
		for (char i : charArray1) {
			System.out.print(i + " ");
		}
		for (char i : charArray2) {
			System.out.print(i + " ");
		}
		System.out.println();
		/*
		 * Declare an array of int and initialize elements in the array. You may
		 * iterate through these as well and display elemtents.
		 */
		int[] intArray = new int[10];
		for (int i = 0; i < 10; i++) {
			intArray[i] = i + 1;
			System.out.print(intArray[i] + " ");
		}
		printArraySize(intArray);
		String[] stringArray = { "Printing ", "a string ", "array." };
		printStringArray(stringArray);
		employeeEntryApp();
	}

	/**
	 * Take employee details such as Name, Address, Age, City, PhoneNumber, and
	 * Job Title. The number of employees that will be entered into the array
	 * should be determined at the start of the application. Upon exiting the
	 * employee details should be echoed to the user.
	 */
	private static void employeeEntryApp() {
		String appName = "Employee Entry App";
		String name = AppBasics.greetUserAndGetName(appName);
		String numberOfEmployees = "How many employees will be enters?";
		int numOfEmps = AppBasics.requestIntWithinRange(numberOfEmployees, 1, 10,
				"You can only register 10 employees at a time");
		String nameQuest = "Name?";
		String[] empName = new String[numOfEmps];
		String addressQuest = "Address?";
		String[] address = new String[numOfEmps];
		String ageQuest = "Age?";
		int[] age = new int[numOfEmps];
		String cityQuest = "City?";
		String[] city = new String[numOfEmps];
		String phoneQuest = "Phone number?";
		String[] phoneNumber = new String[numOfEmps];
		String jobQuest = "Job title?";
		String[] jobTitle = new String[numOfEmps];
		for (int i = 0; i < numOfEmps; i++) {
			System.out.println("Employee " + (i + 1) + ":");
			empName[i] = AppBasics.requestString(nameQuest);
			address[i] = AppBasics.requestString(addressQuest);
			age[i] = AppBasics.requestIntWithinRange(ageQuest, 1, 120, "Out of age range");
			city[i] = AppBasics.requestString(cityQuest);
			phoneNumber[i] = AppBasics.requestString(phoneQuest);
			jobTitle[i] = AppBasics.requestString(jobQuest);
		}
		System.out.println("Name\tAddress\t\tAge\tCity\t\tPhone Number\tJobTitle");
		for (int i = 0; i < numOfEmps; i++) {
			System.out.println(empName[i] + "\t" + address[i] + "\t\t" + age[i] + "\t" + city[i] + "\t\t"
					+ phoneNumber[i] + "\t" + jobTitle[i]);
		}
		System.out.println();
		AppBasics.farewellUser(name);
	}

	/**
	 * Write a method which takes a parameter of array of int and print the size
	 * of any array.
	 *
	 * @param int
	 *            array
	 */
	private static void printArraySize(int[] intArray) {
		System.out.println("Array size = " + intArray.length);
	}

	/**
	 * Write a method which takes a parameter of array of String and print all
	 * the items in the array using a for or for-each loop.
	 *
	 * @param string
	 *            array
	 */
	private static void printStringArray(String[] stringArray) {
		for (String word : stringArray) {
			System.out.print(word);
		}
		System.out.println("\n");
	}
}
