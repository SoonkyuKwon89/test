package Ex03Operstor;
/*�� ������
 * �� �����ڴ� �ΰ��� �ǿ����ڸ� ���ϴ� �������̴�.
 * �ַ� ���ǹ��� �ݺ����� ���ǽĿ� ���Ǹ�, ����� ���� true�� false�� ���´�.
 * 
 * ��Һ� ������
 * > < >= <=
 * �� �ǿ������� ũ�⸦ ���ϴ� ������ ���̸� true , �����̸� false�� ����� ��ȯ
 * 
 * ��� ������
 * == !=
 * �� �ǿ������� ���� ������ �ٸ��� ���ϴ� ������
 * 
 * ���ڿ��� ���Ҷ� ���� �޼���
 * ���ڿ����� ���� ���� ==��� equals()��� �޼��带 ����ؾ� �Ѵ�.
 */

public class Ex3_10 {
	public static void main(String[] args) {
		String str1 = "abc"; //String Ŭ������ new�� ������� �ʰ� ������ ��Ÿ�� �� �ִ�.
		String str2 = new String("abc"); // ���� �̷������� ��ü�� �����ؾ� �Ѵ�.
		
		System.out.println("\"abc\" == \"abc\" ? " +("abc"=="abc"));
		System.out.println("str1 == \"abc\" ? " +(str1=="abc"));
		System.out.println("str2 == \"abc\" ? " +(str2=="abc"));
		System.out.println("str1.equals(\"abc\") ? " +str1.equals("abc"));
		System.out.println("str2.equals(\"abc\") ? " +str2.equals("abc"));
		System.out.println("str1.equals(\"ABC\") ? " +str1.equals("ABC"));
		System.out.println("str1.equalsIgnoreCase(\"ABC\") ? " +str1.equalsIgnoreCase("ABC"));
	}

}
