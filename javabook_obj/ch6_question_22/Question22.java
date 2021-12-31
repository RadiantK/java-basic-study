package ch6_question_22;

public class Question22 {
	
	static boolean isNumber(String str) {
		if ("".equals(str) || str == null) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
		
			if(ch<'0' || ch>'9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str+"는 숫자입니까? "+ isNumber(str));
		
		String str2 = "1234o";
		System.out.println(str2+"는 숫자입니까? "+ isNumber(str2));
	}

}
