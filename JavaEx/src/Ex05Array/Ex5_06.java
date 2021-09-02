package Ex05Array;
/*
 * String배열의 선언과 생성
 * 배열의 타입이 String인 경우에도 int배열의 선언과 생성방법은 다르지 않다.
 * 
 * String[] name = new String[3];
 * 
 * String배열을 선언했을 경우 초기값은 null값이 들어간다.
 * 
 * 초기화 방법 또한 int형과 다르지 않다.
 * String[] name = new String[3];
 * String[0] = "kim";
 * String[1] = "park";
 * String[2] = "yi";
 * 
 * 또는
 * 
 * String[] name = {"kim" , "park" , "yi"};
 *
 * String 클래스
 * String 클래스는 char배열에 기능을 추가한 것이다.
 * String 클래스와 char배열의 가장 큰 차이점은 String클래스는 문자열을 읽을 수만 있을 뿐 내용을 변경할 수 없다는
 * 것이다.
 * ex) String str = "Java";
 * 	   str = str + "8";
 *     System.out.println(str);
 *위의 문장에서 문자열 str의 내용이 변경되는거 같지만, 사실 새로운 내용의 문자열이 생성되는 것이다.
 *
 * String 클래스의 주요 메서드
 * char charAt(int index) - 문자열에서 해당 위치에 있는 문자를 반환한다.
 * int length() - 문자열의 길이를 반환한다.
 * String substring(int from , int to) - 문자열에서 해당 범위(from~ to-1)의 문자열을 반환한다.
 * booLean equals(Object obj) - 문자열의 내용이 같은지 확인한다. 같으면 true , 틀리면 false
 * char[] toCharArray() - 문자열을 문자배열(char[])로 변환해서 반환한다.
 * 
 */
public class Ex5_06 {
	public static void main(String[] args) {
		String[] names = {"kim" , "park" , "yi"};
		
		for(int i = 0; i < names.length ; i++) {
			System.out.println("names["+i+"] : "+names[i]); //순서대로 하나씩 출력
		}
		
		String tmp = names[2]; //배열의 3번째 요소를 tmp에 저장
		System.out.println("tmp : " + tmp);
		
		names[0] = "yu"; //배열의 첫번째 요소를 yu로 변경
		for(int i = 0; i < names.length ; i++) {
			System.out.println("names["+i+"] : "+names[i]); //순서대로 하나씩 출력
		}
		
	}

}
