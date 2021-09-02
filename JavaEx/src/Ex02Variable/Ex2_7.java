package Ex02Variable;
/*
 * 문자열 결합
 * 숫자뿐만 아니라 문자열을 결합할 때도 +기호를 사용한다.
 * 
 * 덧셈연산자는 피연산자들이 모두 숫자일 경우 두 수를 더하지만, 한쪽이 String일 경우 나머지 한쪽을 String로 변환
 * 후 두 문자열을 결합한다.
 * 
 * 덧엠연산자는 왼쪽에서 오른쪽으로 연산을 수행하기 때문에 결합 순서에 따라 결과가 달라진다는 것을 주의해야한다.
 */

public class Ex2_7 {
	public static void main(String[] args) {
		
		String name = "Ja"+"va";
		String str = name+ 8.0; // name변수가 String이므로 8.0또한 String타입으로 변환될 것이다.
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + " ");
		System.out.println(" " + 7);//7이 String타입 취급되기 때문에 한칸 띄우고 7이 들어가는 것을 확인할 수 있다.
		System.out.println(7+"");//둘 다 숫자 7을 String타입으로 바꾼 것이다.
		System.out.println(""+7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 덧셈연산자는 왼쪽에서 오른쪽 순서대로 계산하므로 14를 String화 한 것이 된다.
		System.out.println("" + 7 + 7); // String타입으로 먼저 바뀌기 때문에 77이 나온다.
	}

}
