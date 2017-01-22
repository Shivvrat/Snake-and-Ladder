package snake_Ladder;

class Square extends Box {
	String name = "Square";

	@Override
	void moveTo(int init, int finalPos, Ladder[] ladders, Snake[] snakes, Box[] Board, Player p) {
		// TODO Auto-generated method stub
		p.pieces.initPos = finalPos;
	}

}
