import java.util.List;

import study.java.dao.EnvRoadDao;
import study.java.dao.impl.EnvRoadDaoImpl;
import study.java.helper.FileHelper;
import study.java.model.EnvRoadItem;

public class TeamProject {
	public static void main(String[] args) {

		EnvRoadDao dao = new EnvRoadDaoImpl();
		List<EnvRoadItem> list = dao.getSearchList();
		StringBuilder sb = new StringBuilder();
		String contents = null;
		String encType = "euc-kr";
		String filePath = "TeamProject.CSV";

		if (list == null) {
			System.out.println("데이터 수신 실패");
			return;
			
		}
		sb.append("순번," + "자치구," + "코스명," + "거리," + "소요시간," + "코스레벨," + "상세코스,\n");
		for (int i = 0; i < list.size(); i++) {
			EnvRoadItem item = list.get(i);
			
			
			String rnum = "" + item.getRnum();
			String area_gu = replaceTag(item.getArea_gu());
			String course_name = replaceTag(item.getCourse_name());
			String distance = replaceTag(item.getDistance());
			String lead_time = replaceTag(item.getLead_time());
			String course_level = replaceTag(item.getCourse_level());
			String detail_course = replaceTag(item.getDetail_course());
			;

			sb.append(rnum + "," + area_gu + "," + course_name + "," + distance + "," + lead_time + "," + course_level + ","
					+ detail_course + "," + "\n");

			System.out.print(rnum + "," + area_gu + "," + course_name + "," + distance + "," + lead_time + ","
					+ distance + "," + course_level + "," + detail_course );
			System.out.println();

		}

		contents = sb.toString();

		System.out.println(contents);

		boolean result = FileHelper.getInstance().writeString(filePath,contents, encType);
		
	}

	public static String replaceTag(String str) {
		return str.replace("<b>", "").replace("</b>", "").replace("&amp;", "&").replace(",", " ");

	}
}