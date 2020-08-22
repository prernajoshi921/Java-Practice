import java.util.Scanner;

/*
 * Created by Pree, Aug 21,2020
 */

public class Project1 {
	public static void main(String[] args) {

		System.out.println("**********Welcome to mood survey!**********");
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("");

		// Ques 1
		System.out.println("");
		System.out.println("Have you had your breakfast?");
		String q1 = sc.nextLine();

		if (q1.equals("Yes")) {
			System.out.println("Awesome!");
			x = x + 1;
		} else {
			System.out.println("Eat something!");
		}

		// Ques 2
		System.out.println("");
		System.out.println("Have you had a shower?");
		String q2 = sc.nextLine();

		if (q2.equals("Yes")) {
			System.out.println("Amazing!");
			x = x + 1;
		} else {
			System.out.println("Take a shower!");
		}

		// Ques 3
		System.out.println("");
		System.out.println("Have you had your coffer yet?");
		String q3 = sc.nextLine();

		if (q3.equals("Yes")) {
			System.out.println("Great");
			x = x + 1;
		} else {
			System.out.println("How about a good cup of coffee?");
		}

		// Ques 4
		System.out.println("");
		System.out.println("Is the weather good outside?");
		String q4 = sc.nextLine();

		if (q4.equals("Yes")) {
			System.out.println("Lovely");
			x = x + 1;
		} else {
			System.out.println("Oh no!");
		}

		// Results
		System.out.println("");
		System.out.println("**********Your results are**********");

		if (x == 0) {
			System.out.println("Don't be sad. Take care!");
		}
		if (x == 1) {
			System.out.println("You are somewhat sad but it is fixable.");
		}
		if (x == 2) {
			System.out.println("Your mood is okayish!");
		}
		if (x == 3) {
			System.out.println("You look happy as always!");
		}
		if (x == 4) {
			System.out.println("You are very happy!");
		}

	}

}
