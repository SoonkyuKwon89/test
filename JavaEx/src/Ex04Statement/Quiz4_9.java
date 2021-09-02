package Ex04Statement;
//숫자 맞히기 게임을 완성해라 1~100 사이의 값을 입력해서 컴퓨터가 생각하는 숫자를 맞춰라
public class Quiz4_9 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;		//사용자 입력을 저장할 공간
		int count = 0;		//시도횟수를 세기 위한 변수
		
		//화면으로부터 사용자 입력을 받기 위해 scanner 클래스를 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 숫자를 입력하세요 : ");
			input = s.nextInt();
			
			if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
				continue;
			} else if (answer > input) {
				System.out.println("더 큰수를 입력하세요.");
				continue;
			} else if (answer == input) {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수는 " + count + "입니다.");
				break;
			}
			
		} while(true); //무한반복문
	}

}
