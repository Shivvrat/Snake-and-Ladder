package snake_Ladder;

import java.util.Scanner;

public class Ladder extends Box {
	String name = "Ladder";

	int initPos;// lower
	int finalPos;// higher

	void moveTo(int pos, int finalPos, Ladder[] ladders, Snake[] snakes, Box[] Board, Player p) {
		for (int a = 0; a < 5; a++) {
			if (ladders[a].initPos == p.pieces.initPos) {
				p.pieces.initPos = ladders[a].finalPos;
				break;
			}
		}

	}

}
