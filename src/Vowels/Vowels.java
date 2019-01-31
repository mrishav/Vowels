//Rishav Mitra
//10-15-17
//This is main method prints out a new file that counts the number of vowels and replaces all spaces with tildes.

package Vowels;

import java.util.Scanner;
import java.io.*;

public class Vowels {
	public static void main(String[] args) {
		Scanner input = null;
		PrintWriter output = null;
		// creating output file and trying to find the input file
		try {
			//File text = new File("/Users/rishavmitra/Documents/workspace/Vowels/src/Vowels/poetry.txt");
			File text = new File("poetry.txt");
			input = new Scanner(text);
			File outputName = new File("dentist.txt");
			output = new PrintWriter(outputName);
			// notifies user of missing file
		} catch (FileNotFoundException e) {
			System.out.println("Could not find poetry.txt");
		}
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		// scanning through input file lines
		while (input.hasNext()) {
			String currentLine = input.nextLine();
			System.out.print(currentLine + "\r\n");
			String writeString = "";
			// checking each charcater in a given line, replacing spaces with
			// tildes, and counting number of each vowel
			for (int i = 0; i < currentLine.length(); i++) {
				char currentCharacter = currentLine.charAt(i);
				if (currentCharacter == ' ') {
					writeString += "~";
				} else {
					if (currentCharacter == 'a' || currentCharacter == 'A') {
						aCount++;
					} else if (currentCharacter == 'e' || currentCharacter == 'E') {
						eCount++;
					} else if (currentCharacter == 'i' || currentCharacter == 'I') {
						iCount++;
					} else if (currentCharacter == 'o' || currentCharacter == 'O') {
						oCount++;
					} else if (currentCharacter == 'u' || currentCharacter == 'U') {
						uCount++;
					}
					writeString += currentCharacter;
				}

			}
			// adding the new string to the output
			output.write(writeString + "\r\n");
		}
		output.write("Number of A: " + aCount + "\nNumber of E: " + eCount + "\nNumber of I: " + iCount
				+ "\nNumber of O: " + oCount + "\nNumber of U: " + uCount);
		// letting Java know the output is complete
		output.flush();

	}

}
