package ch08;

public class Person {
	
	public int personHeight;
	public int personWeight;
	public String personName;
	public int personAge;
	public String personGender;
	
	public String showPerson() {
		return "키가" + personHeight + "이고, 몸무게가 " + personWeight + "킬로인 " + personGender + "이 있습니다. 이름은 " + personName + "이고 나이는 " + personAge + "입니다.";
	}
}
