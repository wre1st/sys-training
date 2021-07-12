package com;

import java.util.*;
import java.io.*;

public class JBitField1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter Value1:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String value1 = reader.readLine();
		System.out.println("Enter Value2:");
		String value2 = reader.readLine();
		checkSameCharacters(value1, value2);
	}

	public static void checkSameCharacters(String str1, String str2) {
		System.out.println("===========     Similar Characters using Bit Field in Java  =============");
		int checker = 0;

		for (int i = 0; i < str1.length(); ++i) {
			int characterIndex = str1.charAt(i) - 'a';
			int bitPosition = 1 << characterIndex;
			checker |= bitPosition;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			int characterIndex = str2.charAt(i) - 'a';
			int bitPosition = 1 << characterIndex;

			if ((checker & bitPosition) > 0) {
				System.out.println("Common Character: " + str2.charAt(i));
			}

		}

	}

}