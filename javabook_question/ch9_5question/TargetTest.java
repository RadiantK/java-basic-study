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
			// target�� pos��ġ���� ã��
			pos = src.indexOf(target,pos);
			
			if(pos!=-1) {
				count++;
				pos += target.length(); // pos�� ã���ܾ� ���ķ� �ű�
			} else {
				// index����� -1�̸� �ݺ����� ��������
				break;
			}
			
		}
		return count;
	}

}
