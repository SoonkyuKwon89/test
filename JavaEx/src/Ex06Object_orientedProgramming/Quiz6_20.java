package Ex06Object_orientedProgramming;
/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오
 * 메서드명 : max
 * 기능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
 * 만일 주어진 배열이 Null이거나 크기가 0인 경우, -999999를 반환한다.
 * 반환타입 : int
 * 매개변수 int[]arr - 최대값을 구할 배열
 */

public class Quiz6_20 {
	
	public static int max(int[] arr) {
		int max = 0;
		if(arr == null || arr.length == 0) {
			max = -999999;
		}else {
			for(int i = 0; i < arr.length; i++) {
			  if(max < arr[i]) {
				  max = arr[i];
			  }
			}
		}
		
		return max;
				
	}
	
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
	}

}
