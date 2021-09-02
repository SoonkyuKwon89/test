package Ex06Object_orientedProgramming;

public class Quiz6_16 {
	
	public static void change(String str) {
		str += "456";
	}
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str); //리턴값이 없기 때문에 값이 저장되지 않고 그대로 소멸한다.
		System.out.println("After change:"+ str);
	}

}

//나의 예상
//ABC123
//After change : ABC123
