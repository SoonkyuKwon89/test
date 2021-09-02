package Ex05Array;

import java.util.Scanner;

//단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제를 완성하세요.
public class Quiz5_04 {
	public static void main(String[] args) {
		String[] words = {"television" , "computer" , "mouse" , "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i< words.length; i++) {
			char[] question = words[i].toCharArray(); //String를 char로 변환
			for(int j = 0; j < question.length; j++) {
				int random = (int)(Math.random()*question.length);
				char tmp = ' ';
				tmp = question[random];
				question[random] = question[j];
				question[j] = tmp;
			}
			
			System.out.print("Q"+(i+1)+"," + new String(question) +"의 정답을 입력하세요 > ");
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim())) {
				System.out.println("정답입니다.");
				System.out.println();
			} else {
				System.out.println("틀렸습니다. 정답은 "+words[i]+"입니다.");
				System.out.println();
			}
		}
	}

}
