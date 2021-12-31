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
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id : ");
			String id = sc.nextLine();
			
			System.out.print("password : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다.");
			} else if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			} else {
				System.out.println("아이디와 비밀번호가 일치합니다.");
				break;
			}
		}
		sc.close();
		
	}

}