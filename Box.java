package snake_Ladder;

import snake_Ladder.*;
import java.util.Scanner;

public abstract class Box {
	int Pos;
	String name = "Box";

	char color;

	int initPos;

	abstract void moveTo(int init, int finalPos, Ladder[] ladders, Snake[] snakes, Box[] Board, Player p);

}
