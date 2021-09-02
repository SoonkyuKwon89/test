package Ex04Statement;
/*
 * 임의의 정수 만들이 Math.random()
 * 난수를 얻기 위해 사용하는 메서드
 * 0과 1 사이의 난수값을 생성해주는 메서드이다.
 * 만약 1 이상의 난수값을 구하고자 한다면 구할 값 만큼 곱해준 뒤 +1해주면 된다.
 */
public class Ex4_07 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0 ; i < 5 ; i ++) {
			num = (int)(Math.random()*6) + 1; // 1~6까지의 랜덤한 값을 대입함
			System.out.println(num);
		}
	}

}
