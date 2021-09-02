package Ex06Object_orientedProgramming;
/*연습문제6-1에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal()과
*getAverage()를 추가하시오
*
*1.메서드명 : getTotal
*기능 : 국어, 영어 , 수학의 점수를 모두 더해서 반환한다.
*반환타입 : int
*매개변수 : 없음
*
*2.메서드명 : getAverage
*기능 : 총점을 과목수로 나눈 평균을 구한다. 소수점 둘째자리에서 반올림할것
*반환타입 : float
*매개변수 : 없음
*/
public class Quiz6_03 {
	public static void main(String[] args) {
		Student03 s = new Student03();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}

class Student03 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		int tot = kor + eng + math;
		return tot;
	}
	
	public float getAverage() {
		float average = Math.round(((float)(getTotal()/3)*100)/100);
		return average;
	}
}


