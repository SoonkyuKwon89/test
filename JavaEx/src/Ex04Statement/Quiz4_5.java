package Ex04Statement;
//�ΰ��� �ֻ����� �������� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

public class Quiz4_5 {
	public static void main(String[] args) {
		
		int dice1 , dice2;
		
		for(dice1 = 1 ; dice1 <= 6; dice1 ++) {
			for(dice2 = 1 ;dice2 <= 6; dice2 ++) {
				if(dice1 + dice2 == 6) {
					System.out.println("dice1�� �� = "+ dice1 + ", dice2�� �� = " + dice2);
				}
			}
		}
	}

}
