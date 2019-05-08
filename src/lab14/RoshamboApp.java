package lab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("");
		System.out.println("Enter your name?");
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		
		
		System.out.println(userName + "rock, paper, or scissors?");
		
		
	}

}
