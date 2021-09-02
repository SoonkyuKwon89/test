package Ex04Statement;
/*
 * break문
 * break문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
 * 주로 if문과 같이 사용되어 특정 조건을 만족하게 되면 반복문을 벗어나게 한다.
 */
public class Ex4_15 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {//무한반복(break가 없을경우 무한으로 반복된다.)
			if (sum > 100)
				break;
			++i;
			sum += i;			
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
