package ch16;

public class PlayTest {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel advanPlayer = new AdvancedLevel();
		player.upgradeLevel(advanPlayer);
		player.play(2);
		
		SuperLevel superlevel = new SuperLevel();
		player.upgradeLevel(superlevel);
		player.play(3);
	}

}
