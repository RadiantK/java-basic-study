package ex9_StringBuffer;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
				
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = "+sb.deleteCharAt(9));
		System.out.println("sb = "+sb.delete(4, 6));
		System.out.println("sb = "+sb.reverse());
		System.out.println("sb = "+sb.insert(3, "abc"));
		System.out.println("sb = "+sb.replace(6, sb.length(), "END"));
		
		System.out.println("catacity= "+sb.capacity());
		System.out.println("length= "+sb.length());
		
	}

}
