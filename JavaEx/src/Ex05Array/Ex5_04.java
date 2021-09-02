package Ex05Array;
/*
 * 배열의 활용
 * (3) 섞기
 */

import java.util.Arrays;

public class Ex5_04 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0 ; i < 100 ; i ++) {
			int n = (int)(Math.random()*10); //0~9까지 임의의 값을 받는다.
			int tmp = numArr[0]; //tmp에 배열의 첫번째 수를 넣음
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
