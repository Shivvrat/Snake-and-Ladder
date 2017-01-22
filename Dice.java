package snake_Ladder;

public class Dice {

	static int diceReturns() {
		int x = 0;

		x = (int) Math.floor((Math.random() * 6)) + 1;

		if (x == 6) {
			x = x + diceReturns(); 
		}
		System.out.println("Dice Gives " + x);
		return x;

	}

}
