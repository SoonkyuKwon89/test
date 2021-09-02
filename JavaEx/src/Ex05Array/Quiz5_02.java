package Ex05Array;
//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하세요
public class Quiz5_02 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float avg = 0;
		//코드 시작
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			tmp += arr[i].length;
			for (int j = 0 ; j < arr[i].length; j++){
 				total += arr[i][j];
			}
		}
		avg = total / (float)tmp;
		System.out.println("total = " + total);
		System.out.println("average = " + avg);
				
		//코드 끝
		
		
	}

}
