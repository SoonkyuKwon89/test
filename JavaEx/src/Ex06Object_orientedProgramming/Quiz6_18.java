package Ex06Object_orientedProgramming;
/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�
 * �޼���� : isNumber
 * ��� : �־��� ���ڿ��� ��� ���ڷθ� �̷���� �ִ��� Ȯ���Ѵ�.
 * ��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ�Ѵ�.
 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ�""�̶�� false�� ��ȯ�ؾ� �Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� String str - �˻� �� ���ڿ�
 */

public class Quiz6_18 {
	
	public static boolean isNumber(String str) {
		char tmp;
		boolean output = true;
		
		for (int i = 0; i < str.length(); i++) {
			tmp = str.charAt(i);
			
			if(!('0'<= tmp && tmp <= '9')) {
				output = false;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
	}

}
