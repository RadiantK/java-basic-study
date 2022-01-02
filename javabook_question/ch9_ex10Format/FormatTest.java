package ch9_ex10Format;

public class FormatTest {

	public static void main(String[] args) {
		
		String str = "가나다라";
		
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
		
	}
	
	static String format(String str, int length, int alignment) {
		int result = length - str.length();
		if (result < 0) {
			return str.substring(0, length);
		}
		
		char[] ch = new char[length];
		for (int i = 0; i<ch.length; i++) {
			ch[i] = ' ';
		}
		
		char[] temp = str.toCharArray();
		
		switch(alignment) {
			case 0:
			default:
				System.arraycopy(temp, 0, ch, 0, temp.length);
				break;
			case 1:
				System.arraycopy(temp, 0, ch, result/2, temp.length);
				break;
			case 2:
				System.arraycopy(temp, 0, ch,  result, temp.length);
				break;
		
		}
		return new String(ch);
	}

}
