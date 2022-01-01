package ch9_5question;

public class TargetTest {

	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
	}
	public static int count(String src, String target) {
		
		int pos=0;
		int count =0;
		
		while(true) {
			// target을 pos위치부터 찾음
			pos = src.indexOf(target,pos);
			
			if(pos!=-1) {
				count++;
				pos += target.length(); // pos를 찾은단어 이후로 옮김
			} else {
				// index결과가 -1이면 반복문을 빠져나감
				break;
			}
			
		}
		return count;
	}

}
