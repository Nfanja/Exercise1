/**
 * 
 */

import java.util.Scanner;

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		HelloUser person = new HelloUser(scn.nextLine());
		person.greetUser();
	}

}
