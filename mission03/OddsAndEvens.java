package mission03;

import java.util.Random;
import java.util.Scanner;

class ClassName {

	static int playerScore = 0;
	static int computerScore = 0;

	public static void youLose() {
		System.out.println("You Lose!");
		System.out.println("===========================");
		computerScore++;
		System.out.println("Your score: " + ClassName.playerScore);
		System.out.println("Computer's score: " + ClassName.computerScore);
		System.out.println("===========================");

	}

	public static void youWin() {
		System.out.println("You Win!");
		System.out.println("===========================");
		playerScore++;
		System.out.println("Your score: " + ClassName.playerScore);
		System.out.println("Computer's score: " + ClassName.computerScore);
		System.out.println("===========================");

	}

	public static void selectNumPrint() {
		System.out.println("Enter 1 or 2");
		System.out.println("1. Odd");
		System.out.println("2. Even");

	}
}

public class OddsAndEvens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Enter your name");
		String playerName = sc.nextLine();

		System.out.println("Hi, " + playerName + ".");
		System.out.println("Your score: " + ClassName.playerScore);
		System.out.println("Computer's score: " + ClassName.computerScore);
		System.out.println("===========================");
//==========================반복문 시작=============================
	

		while (ClassName.playerScore < 5 && ClassName.computerScore < 5) {
			ClassName.selectNumPrint();
			int selectedNum = sc.nextInt();
			if (selectedNum == 1) {
				int rNum1 = rd.nextInt(19) + 1;
				System.out.println("===========================");
				System.out.println("Computer picked: " + rNum1);
				if (rNum1 % 2 == 1) {
					ClassName.youWin();
					
				}
				if (rNum1 % 2 == 0) {
					ClassName.youLose();
				}
			}

			if (selectedNum == 2) {
				int rNum2 = rd.nextInt(19) + 1;
				System.out.println("===========================");
				System.out.println("Computer picked: " + rNum2);
				if (rNum2 % 2 == 1) {
					ClassName.youLose();
				}
				if (rNum2 % 2 == 0) {
					ClassName.youWin();
				}
			}

		}
	}
}
