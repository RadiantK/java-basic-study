package ex11_HashMap;

import java.util.*;

public class HashMapTest3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// �� �� ��� (�� �� ��������)
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		
		HashMap map = new HashMap();
		
		for (int i = 0; i < data.length; i++) {
			
			if(map.containsKey(data[i])) {
				// ���ڰ� map�� ���ԵǾ� �ִٸ� value�� 1�߰�
				int value = (int)map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				// ���� ���ڿ� 1�� ���� key : "A" , value : 1
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey()+ " : " + printBar('*', value)+" "+ value );
		}
	}
	
	// value�� ����ŭ ���� �߰�
	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; 
		} 

		return new String(bar); 	// String(char[] chArr)
	}

}
