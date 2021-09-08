import org.json.JSONObject;
import study.java.helper.FileHelper;

public class Main01 {
	public static void main(String[] args) {
		/** 원래 JSON은 문자열 값~!! */
		// String source = "{\"message\" : \"Hello JSON\"}";

		/** 구조를 표현하는 데이터이므로, 외부 파일로 존재할 수 있다. */
		String source = FileHelper.getInstance().readString(
				"res/01.json", "utf-8");
		// 문자열을 파라미터로 한 JSONObject 객체 생성
		JSONObject json = new JSONObject(source);

		// message라는 키에 대한 값 추출
		String message = json.getString("message");

		// 결과 출력
		System.out.println(message);

	}

}
