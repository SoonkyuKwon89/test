package Ex05Array;
//배열의 활용 - 로또번호 생성기

public class Ex5_05 {
	public static void main(String[] args) {
		int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성
		
		//배열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 0 ; i < ball.length ; i++)
			ball[i] = i+1; //ball[0]에는 1이 저장됨
		
		int tmp = 0; //두 값을 바꾸기 위해 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45); //0~44까지의 임의의 값을 얻는다.
			tmp = ball[i]; //i번째 값과 j번째 값을 서로 바꾼다.
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		//배열 ball의 앞에서 6개의 요소를 출력한다.
		for (int i = 0; i < 6 ; i ++) {
			System.out.println("ball["+i+"] = " + ball[i]);
		}
	}

}
