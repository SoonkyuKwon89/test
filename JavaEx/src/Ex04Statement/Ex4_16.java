package Ex04Statement;
/*
 * continue 문
 * 반복문 내에서만 사용할 수 있으며 반복이 진해오디는 도중 continue문을 만나게 되면 반복문의 제일 끝으로 이동하게 된다.
 * for문의 경우 - 증감식으로 이동
 * while문의 경우 - 조건식으로 이동
 */
public class Ex4_16 {
	public static void main(String[] args) {
		for(int i = 0 ; i <= 10 ; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
