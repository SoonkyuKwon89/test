package Ex05Array;
/*
 * Ŀ�ǵ� ������ ���� �Է¹ޱ�
 * Run > Run Configuration... > Arguments�� Ŭ�� > Program arguments�� �� �Է�
 */
public class Ex5_07 {
	public static void main(String[] args) {
		System.out.println("�Ű������� ���� : " + args.length);
		for (int i = 0; i < args.length ; i++) {
			System.out.println("args["+i+"] = \""+ args[i]+ "\"");
		}
	}
}
