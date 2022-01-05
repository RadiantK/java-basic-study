package test;

public class LangTest {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(format(str, 8, 0));
		System.out.println(format(str, 8, 1));
		System.out.println(format(str, 8, 2));
		
		
	}
	
	static String format(String str, int length, int align) {
		int result = length - str.length();
		if(result<0) {
			return str.substring(0, length);
		}
		char[] temp= str.toCharArray();
		char[] ch = new char[length];
		for(int i=0; i<ch.length; i++) {
			ch[i] = ' ';
		}
		
		switch(align) {
			case 0:
			default:
				System.arraycopy(temp, 0, ch, 0, temp.length);
				break;
			case 1:
				System.arraycopy(temp, 0, ch, result/2, temp.length);
				break;
			case 2:
				System.arraycopy(temp, 0, ch, result, temp.length);
				break;
		}
		return new String(ch);
	}
}
