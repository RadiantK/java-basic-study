package ch04;
//package ch04;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class ClassTest {
//
//	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
//		IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//
//		Class c1 = Class.forName("ch04.Person");
//		
//		Person person = (Person)c1.newInstance();
//		
//		person.setName("Kang");
//		System.out.println(person);
//		
//		Class c2 = person.getClass(); // Object의 함수, 인스턴스가 이미 있어야 사용가능
//		Person p = (Person)c2.newInstance();
//		System.out.println(p);
//		
//		// Constructor를 찾으면 반환해줌
//		Class[] parameterTypes = {String.class};
//		Constructor cons = c2.getConstructor(parameterTypes);
//		
//		Object[] initargs = {"Kim"};
//		Person KimPerson = (Person)cons.newInstance(args);
//		System.out.println(KimPerson);
//		
////		Person Kim2 = new Person("Kim");
//		
//	}
//
//}
