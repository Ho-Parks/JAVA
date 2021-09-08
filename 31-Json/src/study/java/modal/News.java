package study.java.modal;

public class News {
	private String title;
	private String description;
	private String pubDate;
	public News(String title, String description, String pubDate) {
		super();
		this.title = title;
		this.description = description;
		this.pubDate = pubDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	@Override
	public String toString() {
		return "News [title=" + title + ", description=" + description + ", pubDate=" + pubDate + "]";
	}
	
	
}
