public class Main03 {

	public static void main(String[] args) {
		
		try {
			
			String year2 = "뭘까요?";
			
			int age2 = 2014 - Integer.parseInt(year2) + 1;
			
			System.out.println(age2);
			
		}catch (NumberFormatException e) {
			
			System.out.println("에러가 발생했습니다.");
			System.out.println("원인: " + e.getMessage());
			
		}
		
		System.out.println("---- 프로그램을 종료합니다.----");
	}
}