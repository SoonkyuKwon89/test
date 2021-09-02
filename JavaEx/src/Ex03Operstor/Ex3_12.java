package Ex03Operstor;

public class Ex3_12 {
	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b = %b%n" , b); // true
		System.out.printf("!b = %b%n" ,!b);// !true = false
		System.out.printf("!!b = %b%n" , !!b);//!!true = !false = true
		System.out.printf("!!!b = %b%n" , !!!b);
		
		System.out.println();
		
		System.out.printf("ch = %c%n" , ch);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n" ,ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch <= 'z') = %b%n" ,!('a' <= ch && ch <= 'z'));
		System.out.printf(" 'a' <= ch && ch <= 'z' =%b%n" ,'a' <= ch && ch <= 'z' );
	}

}
