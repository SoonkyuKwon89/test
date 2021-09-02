package Ex05Array;

import java.util.Arrays;

/*
 * 배열
 * 배열이란?
 * 같은 타입의 여러 변수를 하나로 묶어 다루는 것
 * 
 * 배열 선언방법
 * 타입[] 변수이름 or 타입 변수이름[]
 * 
 * 배열의 생성
 * 타입[] 변수이름 // 배열을 선언(배열을 다루기 위한 참조변수 선언)
 * 변수이름 = new 타입[길이] // 배열을 생성(실제 저장공간을 생성)
 * 
 * 배열의 인덱스
 * 인덱스란? - 배열에 요소마다 붙여진 일렬번호; 인덱스의 범위는 0부터 배열의 길이 -1까지이다.
 * 배열에 값을 저장하거나 읽어올 때는 인덱스의 값을 사용한다.
 * 인덱스는 상수대신 변수나 수식에도 사용 가능하다. 즉 for문이나 if문등 조건식에도 사용 가능하다는 것이다.
 * 
 * 배열의 길이
 * 배열이름.length로 정보를 얻어온다.
 * 배열은 한번 생성하면 길이를 바꿀 수 없기 때문에, 배열의 길이는 상수이다.
 * for문의 조건식에는 배열의 길이를 직접 쓰는 것보다는 배열이름.length를 사용하는 것이 좋다.
 * 
 * 배열의 초기화
 * 배열은 생성과 동시에 0으로 초기화되기때문에 따로 초기화를 해줄 필요가 없지만, 원하는 값을 쓰기 위해서는 각 요소마다 값을
 * 지정해 주어야 한다.
 *  * 배열의 길이가 큰 경우 일일히 대입하기 보다는 for문을 사용해서 대입하는 것이 좋다.
 * 일정한 규칙이 없을경우 , 배열을 간단히 초기화 할 수 있다.
 * int[] score = new int[] {50 , 60 , 70 , 80 , 90} // 배열의 선언과 초기화를 동시에
 * int[] score;
 * score = new int {50 , 60 , 70 , 80 , 90} // new 타입도 생략 가능.
 * 
 * 배열의 출력
 * 배열을 초기화 할때 for문을 사용하듯, 배열을 출력할때에도 for문을 사용하면 된다.
 * int[] arr = {100,90,80,70,60};
 * for(int i = 0; i < arr.length ; i++){
 * 		System.out.pritnln(arr[i])
 * }
 * 
 * 더 간단한 방법은 Arrays.toString(배열이름)을 사용하는 것이다.
 * int[] arr = {100, 90, 80, 70, 60};
 *	//배열 arr의 모든 요소를 출력한다.[100, 90, 80, 70, 60]이 출력된다.
 *System.out.println(Arrays.toString(arr));
 *
 *에외적으로 char배열은 println 메서드로 출력하면 각 요소가 구분자 없이 그대로 출력된다.
 */

public class Ex5_01 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70 , 60};
		//int[] iArr3 = new int[]{100, 95, 80, 70 , 60};
		char[]chArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length ; i++) {
			iArr1[i] = i + 1; //1~10 사이의 숫자를 순서대로 배열에 넣는다.
		}
		
		for (int i = 0; i < iArr2.length ; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1; //1~10까지 랜덤한 값을 배열에 저장
		}
		
		//배열에 저장된 값들을 출력한다.
		for (int i = 0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+" , ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}














