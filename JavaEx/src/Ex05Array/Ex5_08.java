package Ex05Array;
/*
 * 2차원 배열의 선언
 * 2차원 배열을 선언하는 법은 다음과 같다.
 * 타입[][] 변수이름 or 타입 변수이름[][] or 타입[] 변수이름[]
 * ex) int[][] score = new int[4][3]; // 4행 3열의 데이터를 담기위한 배열 생성
 * 			   score[0][0] = 100;
 * 	   System.out.println(score[0][0]);
 * 
 * 2차원 배열의 초기화
 * 2차원 배열도 괄호{}를 사용해서 생성과 초기화를 동시에 할 수 있다.다만, 1차원 배열보다 괄호를 한번 더 써서
 * 행별로 구분해준다.
 * int arr[][] = {{1,2,3},{4,5,6}};
 * 크기가 큰 배열의 경우 한줄로 써부기보다는 행별로 줄 바꿈을 해주는게 알아보기도 쉽고 이해하기 쉽다.
 * in[][] arr = {
 * 					{1,2,3},
 * 					{4,5,6}
 * 				};
 */

public class Ex5_08 {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		int sum = 0;
		
		for (int i = 0 ; i < score.length ; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("score["+i+"]["+j+"] = "+score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum = " + sum);
	
		}
	}
	


