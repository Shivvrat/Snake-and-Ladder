package snake_Ladder;

import snake_Ladder.*;
import java.util.Scanner;

public class Piece extends Box {

	int initPos;

	Piece(int pos) {
		initPos = pos;
	}

	public void moveTo(int init, int finalPos, Ladder[] ladders, Snake[] snakes, Box[] Board, Player p) {
		p.pieces.initPos = finalPos;

	}
}
