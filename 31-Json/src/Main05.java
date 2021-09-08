import org.json.JSONObject;
import org.json.JSONArray;
import study.java.helper.FileHelper;
import study.java.modal.News;

public class Main05 {
	public static void main(String[] args) {
		// 파일로부터 JSONObject 객체 생성
		String source = FileHelper.getInstance().readString(
				"res/05.json", "utf-8");

		JSONObject json = new JSONObject(source);
		JSONObject rss = json.getJSONObject("rss");
		JSONArray item = rss.getJSONArray("item");

		// 배열 데이터이므로 반복문 안에서 처리해야 한다.
		for (int i = 0; i < item.length(); i++) {
			JSONObject temp = item.getJSONObject(i);
 
			// 데이터 추출
			String title = temp.getString("title");
			String description = temp.getString("description");
			String pubDate = temp.getString("pubDate");

			News news = new News(title, description, pubDate);
			System.out.println(news.toString());
		}
	}
}