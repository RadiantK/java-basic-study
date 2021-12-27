package ch16_1;

public class PlayGameTest {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel mPlayer = new AdvancedLevel();
		player.upgradeLevel(mPlayer);
		player.play(2);
		
		SuperLevel hplayer = new SuperLevel();
		player.upgradeLevel(hplayer);
		player.play(3);
	}

}
