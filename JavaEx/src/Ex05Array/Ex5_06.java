package Ex05Array;
/*
 * String�迭�� ����� ����
 * �迭�� Ÿ���� String�� ��쿡�� int�迭�� ����� ��������� �ٸ��� �ʴ�.
 * 
 * String[] name = new String[3];
 * 
 * String�迭�� �������� ��� �ʱⰪ�� null���� ����.
 * 
 * �ʱ�ȭ ��� ���� int���� �ٸ��� �ʴ�.
 * String[] name = new String[3];
 * String[0] = "kim";
 * String[1] = "park";
 * String[2] = "yi";
 * 
 * �Ǵ�
 * 
 * String[] name = {"kim" , "park" , "yi"};
 *
 * String Ŭ����
 * String Ŭ������ char�迭�� ����� �߰��� ���̴�.
 * String Ŭ������ char�迭�� ���� ū �������� StringŬ������ ���ڿ��� ���� ���� ���� �� ������ ������ �� ���ٴ�
 * ���̴�.
 * ex) String str = "Java";
 * 	   str = str + "8";
 *     System.out.println(str);
 *���� ���忡�� ���ڿ� str�� ������ ����Ǵ°� ������, ��� ���ο� ������ ���ڿ��� �����Ǵ� ���̴�.
 *
 * String Ŭ������ �ֿ� �޼���
 * char charAt(int index) - ���ڿ����� �ش� ��ġ�� �ִ� ���ڸ� ��ȯ�Ѵ�.
 * int length() - ���ڿ��� ���̸� ��ȯ�Ѵ�.
 * String substring(int from , int to) - ���ڿ����� �ش� ����(from~ to-1)�� ���ڿ��� ��ȯ�Ѵ�.
 * booLean equals(Object obj) - ���ڿ��� ������ ������ Ȯ���Ѵ�. ������ true , Ʋ���� false
 * char[] toCharArray() - ���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ�Ѵ�.
 * 
 */
public class Ex5_06 {
	public static void main(String[] args) {
		String[] names = {"kim" , "park" , "yi"};
		
		for(int i = 0; i < names.length ; i++) {
			System.out.println("names["+i+"] : "+names[i]); //������� �ϳ��� ���
		}
		
		String tmp = names[2]; //�迭�� 3��° ��Ҹ� tmp�� ����
		System.out.println("tmp : " + tmp);
		
		names[0] = "yu"; //�迭�� ù��° ��Ҹ� yu�� ����
		for(int i = 0; i < names.length ; i++) {
			System.out.println("names["+i+"] : "+names[i]); //������� �ϳ��� ���
		}
		
	}

}
