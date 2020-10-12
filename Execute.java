class Execute {
	public static void main(String[] args) {
		String[] playGround = new String[9];
		PlayGround play = new PlayGround();
		playGround = play.define(playGround);
		play.output(playGround);
	}
}
