package com.sqa.ja.helpers;

import java.util.*;

import com.sqa.ja.helpers.exceptions.*;

public class AppBasics {

	private static Scanner scan = new Scanner(System.in);

	/**
	 * Method to farewell user from the application
	 */
	public static void farewellUser(String name) {
		System.out.print("Thanks for using this app.\nHave a great day " + name + "!");
		scan.close();
	}

	/**
	 * Method to greet user and get name
	 *
	 * @return The user's name
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + " Application");
		System.out.print("Could I get your name please: ");
		return scan.nextLine();
	}

	/**
	 * Method to request a Boolean response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Boolean response from user
	 */
	public static boolean requestBoolean(String question) {
		boolean isInvalid = true;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " (true/false) ");
			input = scan.nextLine();
			try {
				if (!(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false"))) {
					throw new InvalidBooleanResponse();
				}
				isInvalid = false;
			} catch (InvalidBooleanResponse e) {
				System.out.println("You didn't answer true or false [" + input + "]");
			}
		}
		return Boolean.parseBoolean(input.trim());
	}

	/**
	 * Method to request a Byte response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Byte response from user
	 */
	public static byte requestByte(String question) {
		byte value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Byte.parseByte(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a Char response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Char response from user
	 */
	public static char requestChar(String question) {
		boolean isInvalid = true;
		String input = "";
		while (isInvalid) {
			System.out.print(question + " ");
			input = scan.nextLine();
			try {
				if (input.length() > 1) {
					throw new InvalidCharRepsonseLength();
				}
				isInvalid = false;
			} catch (InvalidCharRepsonseLength e) {
				System.out.println("You have entered too many characters [" + input + "]");
			}
		}
		return input.charAt(0);
	}

	/**
	 * Method to request a Double response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Double response from user
	 */
	public static double requestDouble(String question) {
		double value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Double.parseDouble(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a Float response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Boolean response from user
	 */
	public static float requestFloat(String question) {
		float value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Float.parseFloat(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted decimal number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a Int response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Int response from user
	 */
	public static int requestInt(String question) {
		int value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Integer.parseInt(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a Long response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Long response from user
	 */
	public static long requestLong(String question) {
		long value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Long.parseLong(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a Short response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return Short response from user
	 */
	public static short requestShort(String question) {
		short value = 0;
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.print(question + " ");
			String input = scan.nextLine();
			try {
				value = Short.parseShort(input.trim());
				isInvalid = false;
			} catch (Exception e) {
				System.out.println("You have not entered a correct formatted number [" + input + "]");
			}
		}
		return value;
	}

	/**
	 * Method to request a String response from user
	 *
	 * @param question
	 *            Question to ask the user
	 * @return String response from user
	 */
	public static String requestString(String question) {
		System.out.print(question + " ");
		String s = scan.nextLine();
		return s.trim();
	}
}
