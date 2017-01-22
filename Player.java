package snake_Ladder;

import java.util.Scanner;

class Player {

	String name;
	char color;
	Piece pieces;

	Player(String name, char color) {

		this.name = name;
		this.color = color;

	}

	void checkBox(Box[] Board, int finalPos, int initPos, Player p1, Ladder[] ladders, Snake[] snakes, int chance,
			Piece pieces) {

		// initPos = position before taking chance
		// finalPos = position after taking chance
		for (int a = 0; a < ladders.length; a++) {
			if (p1.pieces.initPos == ladders[a].initPos) {

				ladders[a].moveTo(initPos, finalPos, ladders, snakes, Board, p1);
				return;
			}
		}
		for (int a = 0; a < snakes.length; a++) {
			if (p1.pieces.initPos == snakes[a].initPos) {

				snakes[a].moveTo(initPos, finalPos, ladders, snakes, Board, p1);
				return;
			}
		}

		Square sq = new Square();
		sq.moveTo(initPos, finalPos, ladders, snakes, Board, p1);

	}

}
