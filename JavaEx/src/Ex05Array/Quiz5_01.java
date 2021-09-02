package Ex05Array;
//배열 arr에 담긴 모든 값을 더하는 프로그램을 작성하세요
public class Quiz5_01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		//코드 넣기
		for(int i = 0 ; i < arr.length; i++) {
			sum+= arr[i];
		}
		//코드 넣기(끝)
		
		System.out.println("sum = " + sum);
	}

}
