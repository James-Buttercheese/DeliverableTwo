import java.util.Scanner;

public class SecretCode {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input; //variables
		String message;
		char specificLetter;
		int checksum;
		int i;
		int magicalNumbers;
		
		message = "";
		checksum = 0;
		
		System.out.println("What is your message?");//inputs from user
		input = scnr.nextLine();
		
		input =  input.toUpperCase(); //switch to all caps
		
		for (i = 0; i < input.length(); ++i) { // find unicode of letters
			specificLetter = input.charAt(i); // breaks message down character by character
			magicalNumbers = specificLetter; //converts letters to int/unicode/ascii thingy
			message = (message + (magicalNumbers-64) + "-"); //makes message grow within loop
			checksum = (checksum + magicalNumbers); // add all unicode together into checksum
			
		}
			
		System.out.println(message);//output both new message and checksum
		System.out.println(checksum);
		
	}

}
