package com.java.test;

public class PalindromeTest {

	public static void main(String[] args) {
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("dhiraj"));
		System.out.println("**********");
		System.out.println(isPalindrome_01("madam"));
		System.out.println(isPalindrome_01("dhiraj"));
		System.out.println("**********");
		System.out.println(isPalindrome_02("madam"));
		System.out.println(isPalindrome_02("dhiraj"));

	}

	public static boolean isPalindrome(String inputString) {
		return new StringBuffer(inputString).reverse().toString()
				.equals(inputString);
	}

	// FIXME : This method does not performs as expected, workaround is needed
	// for this method
	public static boolean isPalindrome_01(String inputString) {
		char[] charArray = inputString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			for (int j = inputString.length() - 1; j >= 0; j--) {
				char ch2 = inputString.charAt(j);
				if (ch == ch2) {
					return true;
				}
			}

		}
		return false;
	}

	public static boolean isPalindrome_02(String inputString) {
		String reversedVersion = new StringBuffer(inputString).reverse()
				.toString();
		return reversedVersion.equals(inputString);
	}

}
