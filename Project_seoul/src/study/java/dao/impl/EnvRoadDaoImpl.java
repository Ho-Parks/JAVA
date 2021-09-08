package study.java.dao.impl;

import java.io.InputStream;

import java.util.ArrayList;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import study.java.dao.EnvRoadDao;
import study.java.helper.HttpHelper;
import study.java.helper.JsonHelper;
import study.java.model.EnvRoadItem;

public class EnvRoadDaoImpl implements EnvRoadDao {

	@Override
	public List<EnvRoadItem> getSearchList() {
		List<EnvRoadItem> list = null;

		// 검색어
//		String search = null;

		/** 한글일 경우 URLEncoding 처리가 되어야 한다 */
//		try {
//			search = URLEncoder.encode(keyword, "utf-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Seoul Data OpenAPI 주소
		String url = "http://openapi.seoul.go.kr:8088/4c44776d6865627536307779706273/json/walkSaengtaeInfo/1/88/";

		// 발급받은 REST API 키를 "KakaoAK REST_API_키"형식으로 정의한다.(공백주의)
//		Map<String, String> header = new HashMap<String, String>();
//		header.put("Authorization", "KakaoAK f33ab70ad91e962365f69144269f6839");

		// JSON파일을 읽어서 객체로 변환
		// --> URL과 HTTP Header 데이터를 함께 전달한다.
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", null);

		// 통신결과가 없다면 처리 중단
		if (is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		// 통신에 성공하였으므로, 리턴할 List 할당
		list = new ArrayList<EnvRoadItem>();

		// 통신 결과를 JSON으로 변환
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		// 원하는 데이터에 접근하기
		JSONObject documents = json.getJSONObject("walkSaengtaeInfo");
		JSONArray arr = documents.getJSONArray("row");

		// 배열의학목 수 만큼 반복
		for (int i = 0; i < arr.length(); i++) {
			// 배열의 각 요소 추출
			JSONObject item = arr.getJSONObject(i);

			// 값 추출
			int rnum = item.getInt("RNUM");
			String area_gu = item.getString("AREA_GU");
			String course_name = item.getString("COURSE_NAME");
			String distance = item.getString("DISTANCE");
			String lead_time = item.getString("LEAD_TIME");
			String course_level = item.getString("COURSE_LEVEL");
			String detail_course = item.getString("DETAIL_COURSE");
		

			// 추출한 값을 객체화 하여 List에 추가
			list.add(new EnvRoadItem(rnum, area_gu, course_name, distance, lead_time, course_level, detail_course));
			
		}
		return list;

	}

}
