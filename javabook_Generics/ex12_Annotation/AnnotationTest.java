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

// 함수형 인터페이스는 하나의 추상메소드만 사용 가능
@FunctionalInterface 
interface Testable {
	void test();
//	void check();
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 source말고 런타임으로 지정
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "Junit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

enum TestType { FIRST, FINAL }

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}


@TestInfo(testedBy ="aaa",testTools= {"JUnit",  "JUnit5"}, testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class AnnotationTest {
	
//	@SuppressWarnings("1111") // 유효하지 않은 애노테이션은 무시
	public static void main(String[] args) {
		// AnnotaionEx5의 Class객체를 얻는다.
		Class<AnnotationTest> cls = AnnotationTest.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
      	System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();
		
		// AnnotationEx5에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	

	}

}
