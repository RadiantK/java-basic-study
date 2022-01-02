package ch11_question;

import java.util.*;

@SuppressWarnings("rawtypes")
class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name +","+ban +","+no +","+kor +","+eng +","
				+math+","+getTotal() +","+getAverage();
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student st =(Student)o;
			return name.compareTo(st.name);
		}
		return -1;
	}
}

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student2 && o2 instanceof Student2) {
			Student2 st1 = (Student2)o1;
			Student2 st2 = (Student2)o2;
			int result = st1.ban - st2.ban;
			
			if(result == 0) {
				return st1.no - st2.no;
			}
			return result;
		}
		return -1;
	}
	
}

public class ComparatorTest2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(new Student2("È«±æµ¿",1,1,100,100,100));
		list.add(new Student2("³²±Ã¼º",1,2,90,70,80));
		list.add(new Student2("±èÀÚ¹Ù",2,1,80,80,90));
		list.add(new Student2("ÀÌÀÚ¹Ù",2,3,70,90,70));
		list.add(new Student2("¾ÈÀÚ¹Ù",1,5,60,100,80));
		
		Collections.sort(list, new MyComparator());
		
		Iterator it = list.iterator();
		while(it.hasNext())	{
			System.out.println(it.next());
		}
	}

}
