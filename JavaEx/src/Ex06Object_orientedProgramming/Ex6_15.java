package Ex06Object_orientedProgramming;

//멤버변수의 초기화 예제 2
public class Ex6_15 {
	//명시적 초기화(생성과 동시에 선언-간단)
	static int[] arr = new int[10];
	//static을 붙이는 이유? 메모리 로딩 제일 처음부터 사용해야 하기 때문
	//클래스 초기화 블럭
	//1~10 사이의 랜덤값을 배열 arr에 저장한다.
	static {
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;			
		}
	}
	//메인 메서드
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
	}	
}
