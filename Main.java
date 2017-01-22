package snake_Ladder;

import java.util.Scanner;
import java.util.Scanner;
import snake_Ladder.*;

public class Main {
	// snake and ladder not working
	// for snakes and ladder check with initial and final position
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Box[] Board = new Box[100];
		InitBoard.initBoard(Board);
		Ladder[] ladders = new Ladder[6];
		ladders[0] = new Ladder();
		ladders[1] = new Ladder();
		ladders[2] = new Ladder();
		ladders[3] = new Ladder();
		ladders[4] = new Ladder();
		ladders[5] = new Ladder();
		ladders[0].initPos = 2;
		ladders[0].finalPos = 38;
		ladders[1].initPos = 9;
		ladders[1].finalPos = 11;
		ladders[2].initPos = 26;
		ladders[2].finalPos = 52;
		ladders[3].initPos = 55;
		ladders[3].finalPos = 83;
		ladders[4].initPos = 71;
		ladders[4].finalPos = 89;
		ladders[5].initPos = 60;
		ladders[5].finalPos = 98;
		Snake[] snakes = new Snake[6];
		snakes[0] = new Snake();
		snakes[1] = new Snake();
		snakes[2] = new Snake();
		snakes[3] = new Snake();
		snakes[4] = new Snake();
		snakes[5] = new Snake();
		snakes[0].finalPos = 3;
		snakes[0].initPos = 30;
		snakes[1].finalPos = 24;
		snakes[1].initPos = 46;
		snakes[2].finalPos = 59;
		snakes[2].initPos = 62;
		snakes[3].finalPos = 51;
		snakes[3].initPos = 65;
		snakes[4].finalPos = 74;
		snakes[4].initPos = 96;
		snakes[5].finalPos = 23;
		snakes[5].initPos = 98;
		System.out.println("How many players want to play");
		int numPlayers = scan.nextInt();
		char color;
		Player[] p = new Player[numPlayers];
		for (int a = 0; a < numPlayers; a++) {
			System.out.println("Enter your Color in one char");
			color = scan.next().charAt(0);

			System.out.println("Enter your name ");
			scan.nextLine();
			p[a] = new Player(scan.nextLine(), color);
			p[a].pieces = new Piece(0);

		}
		int chance = 0;
		while (true) {
			if (chance < numPlayers) {
				if (p[chance].pieces.initPos == 99) {
					System.out.println("Player " + p[chance].name + " wins");
					System.exit(0);
				} else if (p[chance].pieces.initPos <= 93) {

					System.out.println("Your chance please,You wanna play,Type Yes");
					String want = scan.next();
					if (want.equals("Yes")) {
						int x = Dice.diceReturns();
						p[chance].checkBox(Board, p[chance].pieces.initPos + x, p[chance].pieces.initPos, p[chance],
								ladders, snakes, chance, p[chance].pieces);
						InitBoard.print(p, snakes, ladders);
						if (p[chance].pieces.initPos == 99) {
							System.out.println("Player " + p[chance].name + " wins");
							System.exit(0);
						}
					} else {
						System.err.println("So you Dont wanna play");
						System.exit(0);
					}
				} else {
					int x = Dice.diceReturns();
					if (x == 99 - p[chance].pieces.initPos) {
						System.out.println("Player " + p[chance].name + " wins");
						System.exit(0);
					} else {
						System.out.println("Try Again ;)");
					}

				}

				chance++;
			} else {
				chance = 0;
			}

		}

	}

}
