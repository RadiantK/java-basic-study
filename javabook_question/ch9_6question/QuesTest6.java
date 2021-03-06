package ch9_6question;

public class QuesTest6 {

	public static void main(String[] args) {

		String src ="12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
		
	}
	public static String fillZero(String src, int length) {
		if(src == null || src.length() == length) {
			return src;
		}
		if (length<=0) {
			return "";
		}
		if (src.length()>length) {
			return src.substring(0, length);
		}
		char[] ch = new char[length];
		
		for(int i=0; i<ch.length; i++) {
			ch[i] ='0';
		}
		System.arraycopy(src.toCharArray(), 0, ch, src.length(), src.length());
		
		return new String(ch);
	}

}
