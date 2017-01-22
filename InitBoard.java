package snake_Ladder;

public class InitBoard {
	static void initBoard(Box[] Board) {
		for (int a = 0; a < 100; a++) {
			// create class for null ones(boxes)
			// Pos = number
			Board[a] = new Square();
			Board[a].Pos = a;
		}
	}

	public static void print(Player[] p, Snake[] s, Ladder[] l) {
		int i = 100;
		boolean order = false;
		while (i > 0) {

			for (int a = 0; a < 6; a++) {
				if (s[a].initPos == i) {
					int j = s[a].finalPos;
					if (i > j) {
						// snake
						System.out.format("%2d", i);
						System.out.print(" S");
						System.out.format("%2d", j);
						for (int b = 0; b < p.length; b++) {
							if (i == p[b].pieces.initPos + 1)
								System.out.print(+p[b].color);

						}
						System.out.print(" | ");

					}

					if ((i - 1) % 10 == 0 && (i - 1) % 20 != 0) {
						System.out.println();
						i = i - 10;
						order = true;

					} else if (i % 10 == 0 && i % 20 != 0) {
						System.out.println();
						i = i - 10;
						order = false;
					} else if (order)
						i++;
					else
						i--;

				}
				if (l[a].initPos == i) {

					int q = l[a].finalPos;
					if (i < q) {
						// ladder
						System.out.format("%2d", i);
						System.out.print(" L");
						if (q == 100)
							System.out.print("00");
						else
							System.out.format("%2d", q);
						for (int b = 0; b < p.length; b++) {
							if (i == p[b].pieces.initPos + 1)
								System.out.print(p[b].color);

						}

						System.out.print(" | ");
					}
					if ((i - 1) % 10 == 0 && (i - 1) % 20 != 0) {
						System.out.println();
						i = i - 10;
						order = true;

					} else if (i % 10 == 0 && i % 20 != 0) {
						System.out.println();
						i = i - 10;
						order = false;
					} else if (order)
						i++;
					else
						i--;

				}
			}

			if (i == 100) {
				System.out.print("00     | ");

			} else {

				System.out.format("%2d", i);
				for (int b = 0; b < p.length; b++) {
					if (i == p[b].pieces.initPos + 1) {
						System.out.print(p[b].color);

					}
				}

				System.out.print("     | ");
			}

			if ((i - 1) % 10 == 0 && (i - 1) % 20 != 0) {
				System.out.println();
				i = i - 10;
				order = true;

			} else if (i % 10 == 0 && i % 20 != 0) {
				System.out.println();
				i = i - 10;
				order = false;
			} else if (order)
				i++;
			else
				i--;
		}

		
		InitBoard.displayPlayerPos(p, p.length);

	}

	

	static public void displayPlayerPos(Player[] players, int numPlayers) {
		for (int a = 0; a < numPlayers; a++) {
			System.out.println("Player " + (a + 1) + " is at " + (players[a].pieces.initPos + 1));
		}

	}

}
