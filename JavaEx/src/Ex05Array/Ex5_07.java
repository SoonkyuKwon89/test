package Ex05Array;
/*
 * 커맨드 라인을 통해 입력받기
 * Run > Run Configuration... > Arguments탭 클릭 > Program arguments에 값 입력
 */
public class Ex5_07 {
	public static void main(String[] args) {
		System.out.println("매개변수의 갯수 : " + args.length);
		for (int i = 0; i < args.length ; i++) {
			System.out.println("args["+i+"] = \""+ args[i]+ "\"");
		}
	}
}
