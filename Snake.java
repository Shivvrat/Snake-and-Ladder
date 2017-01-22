package snake_Ladder;

import java.util.Scanner;

public class Snake extends Box {
	String name = "Snake";
	int Pos;
	int initPos;// tail
	int finalPos;// head

	void moveTo(int init, int finalPos, Ladder[] ladders, Snake[] snakes, Box[] Board, Player p) {
//return the last number only 
		//the updating should be done in driver class
		for (int a = 0; a < 5; a++) {
			if (snakes[a].initPos == p.pieces.initPos) {
				p.pieces.initPos = snakes[a].finalPos;
				break;
			}
		}
	}
}
