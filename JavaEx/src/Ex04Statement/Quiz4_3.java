package Ex04Statement;
//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오
public class Quiz4_3 {
	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		int sum = 0;
		
		while(sum <= 100) {
			++odd;
			--even;
			
			if(!(odd%2 == 0)) {
				sum += odd;
			} else if(odd%2 == 0) {
				sum += even;
			}
			System.out.println(odd + "번 sum : " + sum);
		}
	}

}
