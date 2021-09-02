package Ex04Statement;
//다음의 for문을 while문으로 변경하시오
/*
 * public class Ex4_5
 * 	public static void main(String[] args){
 * 		for (int = 0; i <= 10; i++){
 * 			for (int j = 0 ; j <= i ; j ++){
 * 				System.out.print("*");
 * 			}
 * 			System.out.println();
 * 		}
 *	 }
 *}
 */
public class Quiz4_4 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		while ( i <= 10) {
			while( j <= i) {
				System.out.print("*");
				++j;
			}
			j=0;
			++i;
			System.out.println();
		}
	}

}
