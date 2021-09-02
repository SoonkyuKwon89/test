package Ex04Statement;
//두개의 주사위를 던졌을때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오

public class Quiz4_5 {
	public static void main(String[] args) {
		
		int dice1 , dice2;
		
		for(dice1 = 1 ; dice1 <= 6; dice1 ++) {
			for(dice2 = 1 ;dice2 <= 6; dice2 ++) {
				if(dice1 + dice2 == 6) {
					System.out.println("dice1의 값 = "+ dice1 + ", dice2의 값 = " + dice2);
				}
			}
		}
	}

}
