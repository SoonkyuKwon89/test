package Ex02Variable;
/*
 * ���ڿ� ����
 * ���ڻӸ� �ƴ϶� ���ڿ��� ������ ���� +��ȣ�� ����Ѵ�.
 * 
 * ���������ڴ� �ǿ����ڵ��� ��� ������ ��� �� ���� ��������, ������ String�� ��� ������ ������ String�� ��ȯ
 * �� �� ���ڿ��� �����Ѵ�.
 * 
 * ���������ڴ� ���ʿ��� ���������� ������ �����ϱ� ������ ���� ������ ���� ����� �޶����ٴ� ���� �����ؾ��Ѵ�.
 */

public class Ex2_7 {
	public static void main(String[] args) {
		
		String name = "Ja"+"va";
		String str = name+ 8.0; // name������ String�̹Ƿ� 8.0���� StringŸ������ ��ȯ�� ���̴�.
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + " ");
		System.out.println(" " + 7);//7�� StringŸ�� ��޵Ǳ� ������ ��ĭ ���� 7�� ���� ���� Ȯ���� �� �ִ�.
		System.out.println(7+"");//�� �� ���� 7�� StringŸ������ �ٲ� ���̴�.
		System.out.println(""+7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // ���������ڴ� ���ʿ��� ������ ������� ����ϹǷ� 14�� Stringȭ �� ���� �ȴ�.
		System.out.println("" + 7 + 7); // StringŸ������ ���� �ٲ�� ������ 77�� ���´�.
	}

}
