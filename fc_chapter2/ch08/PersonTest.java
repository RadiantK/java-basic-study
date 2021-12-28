package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person personUser = new Person();
		personUser.personHeight = 180;
		personUser.personWeight = 78;
		personUser.personName = "Tomas";
		personUser.personAge = 37;
		personUser.personGender = "³²¼º";
		
		System.out.println(personUser.showPerson());
	}

}
