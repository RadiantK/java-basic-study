package ex12_Annotation;

import java.lang.annotation.*;

class Parent {
	void parentMethod() {
		
	}
}

class Child extends Parent {
	
	@Override
	@Deprecated
	void parentMethod() {
		
	}
}

// �Լ��� �������̽��� �ϳ��� �߻�޼ҵ常 ��� ����
@FunctionalInterface 
interface Testable {
	void test();
//	void check();
}

@Retention(RetentionPolicy.RUNTIME) // ���� �ÿ� ��밡���ϵ��� source���� ��Ÿ������ ����
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "Junit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

enum TestType { FIRST, FINAL }

@Retention(RetentionPolicy.RUNTIME)  // ���� �ÿ� ��밡���ϵ��� ����
@interface DateTime {
	String yymmdd();
	String hhmmss();
}


@TestInfo(testedBy ="aaa",testTools= {"JUnit",  "JUnit5"}, testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class AnnotationTest {
	
//	@SuppressWarnings("1111") // ��ȿ���� ���� �ֳ����̼��� ����
	public static void main(String[] args) {
		// AnnotaionEx5�� Class��ü�� ��´�.
		Class<AnnotationTest> cls = AnnotationTest.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
      	System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();
		
		// AnnotationEx5�� ����� ��� �ֳ����̼��� �����´�.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	

	}

}
