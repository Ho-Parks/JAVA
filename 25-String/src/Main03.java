public class Main03 {
	public static void main(String[] args) {
		/** 주민등록번호에서 생년월일을 추출하기 */
		// ex) 8005011234567 --> 1980년 05월 01일 남자
		String jumin = "8005011234567";

		// 주민번호를 년, 월, 일 단위로 각 두 글자씩 자르기
		String yy = jumin.substring(0, 2);
		String mm = jumin.substring(2, 4);
		String dd = jumin.substring(4, 6);

		// 뒷 부분의 첫 번째 글자는 성별코드이므로 별도로 추출한다.
		String gender_code = jumin.substring(6, 7);

		// 태어난 년도의 판별
		if (gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}

		// 기본 성별은 남자
		String gender = "남자";
		// 뒷 부분 첫 글자가 2, 4인 경우 여자
		if (gender_code.equals("2") || gender_code.equals("4")) {
			gender = "여지";
		}
		// 형식에 맞춘 내용 출력 (String.formet + System.out.println)
		System.out.printf("%s년 %s월 %s일 %s", yy, mm, dd, gender);
	}
}
