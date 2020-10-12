public class PlayGround {
	String[] define(String[] playGround) {
		for (int i = 0; i < playGround.length; i++) {
			playGround[i] = " ";
		}
		return playGround;
	}
	void output(String[] playGround) {
		for (int i = 0; i < playGround.length; i++) {
			System.out.print(playGround[i]);
			if (i % 3 == 2) {
				System.out.println();
				if (i < playGround.length - 1) {
					System.out.println("-----");
				}
			} else {
				System.out.print("|");
			}
		}
	}
}
