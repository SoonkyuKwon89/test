package Ex05Array;

import java.util.Arrays;

//1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 완성하세요
public class Quiz5_03 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i < ballArr.length ; i++) {
			int j = (int)(Math.random()*ballArr.length); //랜덤값 생성
			int tmp = 0;//tmp값 초기화
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
		}
		
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		for(int a = 0 ; a < ball3.length; a ++) {
			ball3[a] = ballArr[a];
		}
		for(int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
