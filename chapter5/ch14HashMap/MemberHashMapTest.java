package ch14HashMap;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

	
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberJang = new Member(1004, "장보고");
		Member memberKang = new Member(1001, "강감찬");
		Member memberKim = new Member(1002, "김유신");
		Member memberLee = new Member(1003, "이순신");

		memberHashMap.addMember(memberJang);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberLee);
		

		memberHashMap.showAllMember();
		
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1001, "Kang");
		hashMap.put(1002, "Kim");
		hashMap.put(1003, "Lee");
		hashMap.put(1004, "Park");
		
		System.out.println(hashMap);
		
	}

}
