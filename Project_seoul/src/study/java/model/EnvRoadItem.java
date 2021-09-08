package study.java.model;

public class EnvRoadItem {
	private int rnum = 0;
	private String area_gu = null;
	private String course_name = null;
	private String distance = null;
	private String lead_time = null;
	private String course_level = null;
	private String detail_course = null;
	
	public EnvRoadItem(int rnum, String area_gu, String course_name, String distance, String lead_time,
			String course_level, String detail_course) {
		super();
		this.rnum = rnum;
		this.area_gu = area_gu;
		this.course_name = course_name;
		this.distance = distance;
		this.lead_time = lead_time;
		this.course_level = course_level;
		this.detail_course = detail_course;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public String getArea_gu() {
		return area_gu;
	}

	public void setArea_gu(String area_gu) {
		this.area_gu = area_gu;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getLead_time() {
		return lead_time;
	}

	public void setLead_time(String lead_time) {
		this.lead_time = lead_time;
	}

	public String getCourse_level() {
		return course_level;
	}

	public void setCourse_level(String course_level) {
		this.course_level = course_level;
	}

	public String getDetail_course() {
		return detail_course;
	}

	public void setDetail_course(String detail_course) {
		this.detail_course = detail_course;
	}

	@Override
	public String toString() {
		return "EnvRoadItem [rnum=" + rnum + ", area_gu=" + area_gu + ", course_name=" + course_name + ", distance="
				+ distance + ", lead_time=" + lead_time + ", course_level=" + course_level + ", detail_course="
				+ detail_course + "]";
	}
	
	
}