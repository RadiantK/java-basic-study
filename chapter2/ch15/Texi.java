package ch15;

public class Texi {
	String texiName;
	int getMoney;
	
	public Texi(String texiName) {
		this.texiName = texiName;
	}
	
	public void take(int getMoney) {
		this.getMoney += getMoney;
	}
	
	public void texiInfo() {
		System.out.println(texiName + "택시 수입은 " + getMoney + "원 입니다.");
	}
}
