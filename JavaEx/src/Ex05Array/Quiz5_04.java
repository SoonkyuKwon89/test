package Ex05Array;

import java.util.Scanner;

//�ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� ������ �ϼ��ϼ���.
public class Quiz5_04 {
	public static void main(String[] args) {
		String[] words = {"television" , "computer" , "mouse" , "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i< words.length; i++) {
			char[] question = words[i].toCharArray(); //String�� char�� ��ȯ
			for(int j = 0; j < question.length; j++) {
				int random = (int)(Math.random()*question.length);
				char tmp = ' ';
				tmp = question[random];
				question[random] = question[j];
				question[j] = tmp;
			}
			
			System.out.print("Q"+(i+1)+"," + new String(question) +"�� ������ �Է��ϼ��� > ");
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("�����Դϴ�.");
				System.out.println();
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+words[i]+"�Դϴ�.");
				System.out.println();
			}
		}
	}

}
