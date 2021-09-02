package Ex06Object_orientedProgramming;
//다음에 코드에 정의된 변수들을 종류별로 구분하여 적으시오
public class Quiz6_05 {
	int kind; //인스턴스 변수
	int num;  //인스턴스 변수	
	
	static int width;  //클래스변수
	static int height; //클래스변수
	
	Quiz6_05(int k, int n) {
		kind = k; //지역변수
		num = n;  //지역변수
	}
	
	public static void main(String[] args) {
		Quiz6_05 card = new Quiz6_05(1 ,1);
	}

}
