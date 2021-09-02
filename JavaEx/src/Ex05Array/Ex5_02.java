package Ex05Array;
/*
 * 배열의 활용
 * (1)총합과 평균
 */
public class Ex5_02 {
	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for (int i = 0; i < score.length; i ++) {
			sum += score[i];	//배열의 총 합을 구함
		}
		
		average = sum / (float)score.length; //계산결과를 float타입으로 바꾸기 위해 형변환
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + average);
	}

}
