package Ex05Array;

import java.util.Scanner;

//2���� �迭�� �ʱ�ȭ ����3
public class Ex5_10 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair" , "����"},
				{"computer" , "��ǻ��"},
				{"integer", "����"},
				{"dog" , "��"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length ; i++) {
			System.out.print("Q"+(i+1)+", "+ words[i][0] + "�� ����? >");
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�!");
				System.out.println();
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+words[i][1] +"�Դϴ�.");
				System.out.println();
			}
		}
	}

}
