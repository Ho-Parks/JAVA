public class Main02 {

	public static void main(String[] args) {

		int point = 99;

		// AND(&&) --> 두 조건이 모두 참이여야 전체가 참
		if (point > 95 && point <= 100) {
			System.out.println("A+학점 입니다.");
		}

		// OR(||) --> 두 조건중 하나라도 참이면 전체가 참
		if (point <= 95 || point > 100) {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
