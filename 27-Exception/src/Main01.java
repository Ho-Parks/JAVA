public class Main01 {
	public static void main(String[] args) {

		// 문자열의 숫자 변환에 아무런 문제가 없다.
		String year1 = "1980";
		int age1 = 2014 - Integer.parseInt(year1) + 1;
		System.out.println(age1);

		// 숫자로 변환할 수 없으므로, 에러가 발생한다.
		String year2 = "뭘까요?";
		int age2 = 2014 + Integer.parseInt(year2) + 1;
		System.out.println(age2);

		System.out.println("---- 프로그램을 종료합나디.----");

	}
}
