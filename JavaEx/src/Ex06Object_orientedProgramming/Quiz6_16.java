package Ex06Object_orientedProgramming;

public class Quiz6_16 {
	
	public static void change(String str) {
		str += "456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str); //���ϰ��� ���� ������ ���� ������� �ʰ� �״�� �Ҹ��Ѵ�.
		System.out.println("After change:"+ str);
	}

}

//���� ����
//ABC123
//After change : ABC123
