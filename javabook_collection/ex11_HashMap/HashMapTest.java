package ex11_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashMap map = new HashMap();
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
//		System.out.println(map);
		
		map.put("asdf", "1234");
//		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.print("id : ");
			String id = sc.nextLine();
			
			System.out.print("password : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			} else if(!(map.get(id)).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			} else {
				System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�.");
				break;
			}
		}
		sc.close();
		
	}

}