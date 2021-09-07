import study.java.helper.Util;

public class Main04 {
	public static void main(String[] args) {
		/** 6자리의 인증번호 생성하기 */
		String authNum = "";
		
		for(int i = 0; i < 6; i++) {
			authNum += Util.getInstance().random(0, 9);
		}
		
		System.out.println("인증번호=" + authNum);
	}

}
