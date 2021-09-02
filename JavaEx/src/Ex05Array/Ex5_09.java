package Ex05Array;
//2차원 배열 초기화 예제

public class Ex5_09 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		//과목별 총점
		int korTotal = 0 , engTotal = 0, mathTotal = 0;
		
		System.out.println("번호	국어	영어	수학	총점	평균 ");
		System.out.println("===========================");
		
		for(int i = 0; i < score.length ; i++) {
			int sum = 0; //sum값 초기화 ---- 1
			float avg = 0.0f; // avg값 초기화 ---2
			
			korTotal += score[i][0]; //국어점수 총 합 저장(초기화 X) --- 3
			engTotal += score[i][1]; //영어점수 총 합 저장(초기화 X)
			mathTotal += score[i][2];//수학점수 총 합 저장(초기화 X)
			System.out.printf("%3d", i+1); //순서 출력
			
			for (int j = 0 ; j < score[i].length ; j++){//sum에 전체 점수 합계 저장
				sum += score[i][j]; //i번째 국영수 총 합 더함 ---4
				System.out.printf("%5d" , score[i][j]); //5칸씩 띄우고 sum 출력
			}
			
			avg = sum/(float)score[i].length; // avg값 저장 ---5
			System.out.printf("%5d %5.1f%n" , sum , avg); // 프린트(다시 1번부터)
			
		}
		System.out.println("===========================");
		System.out.printf("총점 : %3d , %4d , %4d%n" , korTotal,engTotal,mathTotal);
		
	}

}
