package ch16_1;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final protected void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		for(int i = 0; i < count; i++) {
			turn();
		}
	}
}
