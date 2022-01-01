package ch7_ex10question;

class MyTv {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
		
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume < MIN_VOLUME ) {
			return;
		}
		this.volume = volume;
	}
	
}

public class QuestionTest10 {

	public static void main(String[] args) {

		MyTv mt = new MyTv();
		
		mt.setChannel(10);
		System.out.println(mt.getChannel());
		mt.setVolume(30);
		System.out.println(mt.getVolume());
		
	}

}