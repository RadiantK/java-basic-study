package ex11_Arrays;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, 5);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		System.out.println();
		
//		for(int x=0; x<arr7.length; x++) {
//			int i=arr[x];
//		}
		for(int i : arr7) { // 향상된 for문
			char[] graph = new char[i]; // arr7[]이 들어감
			Arrays.fill(graph, '*'); // i의 수만큼 *로 채움
			System.out.println(new String(graph)+i); // 문자배열 문자열로 변환
//			String => char[] toCharArray() 사용
//			char[] => String new String(char[])생성자 사용		
		}
		System.out.println();
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); // false 2차원배열은 딥이퀄사용
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // true
		System.out.println();
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E' }; 
		
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("== After sorting ==");
		Arrays.sort(chArr); // 이진탐색을 하기전에는 정렬을 해줄 것.
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
		
	}

}
