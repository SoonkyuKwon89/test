package Ex06Object_orientedProgramming;
//다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오
public class Quiz6_02 {
	public static void main(String args[]) {
		Students s = new Students("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	}
}

class Students {
	String name; //학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	public Students(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		String tot =name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+
				(kor+eng+math)+", "+((kor+eng+math)/3);
		return tot;
	}

}
