package ch11_question;

import java.util.*;

@SuppressWarnings("rawtypes")
class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
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
class MyCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			return (int)(s1.getAverage()-s2.getAverage()); 
		}
		return -1;
	}
	
}

public class ComparatorTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static int getGroupCount(TreeSet set, int from, int to) {
		Student s1 = new Student("", 0,0, from,from,from);
		Student s2 = new Student("", 0,0, to,to,to);
		
		return set.subSet(s1, s2).size();
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyCompare());
		
		ts.add(new Student("È«±æµ¿",1,1,100,100,100));
		ts.add(new Student("³²±Ã¼º",1,2,90,70,80));
		ts.add(new Student("±èÀÚ¹Ù",1,3,80,80,90));
		ts.add(new Student("ÀÌÀÚ¹Ù",1,4,70,90,70));
		ts.add(new Student("¾ÈÀÚ¹Ù",1,5,60,100,80));


		
		Iterator it = ts.iterator();
		while(it.hasNext())	{
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// Æò±Õ È®ÀÎ
		System.out.println("[60~69] :"+getGroupCount(ts,60,70));
		System.out.println("[70~79] :"+getGroupCount(ts,70,80));
		System.out.println("[80~89] :"+getGroupCount(ts,80,90));
		System.out.println("[90~100] :"+getGroupCount(ts,90,101));
	}

}
