package Ex04Statement;
//���� ������ ������ �ϼ��ض� 1~100 ������ ���� �Է��ؼ� ��ǻ�Ͱ� �����ϴ� ���ڸ� �����
public class Quiz4_9 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;		//����� �Է��� ������ ����
		int count = 0;		//�õ�Ƚ���� ���� ���� ����
		
		//ȭ�����κ��� ����� �Է��� �ޱ� ���� scanner Ŭ������ ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���ڸ� �Է��ϼ��� : ");
			input = s.nextInt();
			
			if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
				continue;
			} else if (answer > input) {
				System.out.println("�� ū���� �Է��ϼ���.");
				continue;
			} else if (answer == input) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ���� " + count + "�Դϴ�.");
				break;
			}
			
		} while(true); //���ѹݺ���
	}

}
