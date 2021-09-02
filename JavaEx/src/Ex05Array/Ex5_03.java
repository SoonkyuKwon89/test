package Ex05Array;
//배열의 활용
//(2) 최대값과 최소값
public class Ex5_03 {
	public static void main(String[] args) {
		int[] score = {79, 88 , 91 , 33 , 100, 55 , 95};
		
		int max = score[0]; //  배열의 최대값을 배열의 첫번째값으로 초기화
		int min = score[0]; //  배열의 최소값을 배열의 첫번째값으로 초기화
		
		for (int i = 1; i < score.length ; i ++) {
			if(score[i] > max) { // 만약 배열의 i번째 숫자가 최대값보다 크다면
				max = score[i]; // max에 배열의 i번째 값을 대입
			} else if (score[i] < min) { // 만약 배열의 i번째 숫자가 최소값보다 작다면
				min = score[i]; //min에 배열의 i번째 값을 대입
			}
		} // for end
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
