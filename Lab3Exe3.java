package com.lab.demo.lab3;

import java.io.*;

class Lab3Exe3 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("WORD : ");

		String s = br.readLine();

		s = s.toUpperCase();
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {

				if (isVowel(ch))
					t += ch;

				else {
					char p = (char) (ch + 1);
					if (isVowel(p))
						t += (char) (ch + 1);

					else
						t += p;
				}
			} else
				t += ch;
		}
		System.out.println(t);
	}

	public static boolean isVowel(char ch) {
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}

}
