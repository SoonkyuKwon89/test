package Ex05Array;

import java.util.Scanner;

//2차원 배열의 초기화 예제3
public class Ex5_10 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair" , "의자"},
				{"computer" , "컴퓨터"},
				{"integer", "정수"},
				{"dog" , "개"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length ; i++) {
			System.out.print("Q"+(i+1)+", "+ words[i][0] + "의 뜻은? >");
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다!");
				System.out.println();
			} else {
				System.out.println("틀렸습니다. 정답은 "+words[i][1] +"입니다.");
				System.out.println();
			}
		}
	}

}
