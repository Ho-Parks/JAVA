package study.java.model;

public class ImageItem {
	private String collection = null;
	private String thumbnailUrl = null;
	private String imageUrl = null;
	private int width = 0;
	private int height = 0;
	private String displaySitename = null;
	private String doc_url = null;
	private String datatime = null;
	
	public ImageItem(String collection, String thumbnailUrl, String imageUrl, int width, int height,
			String displaySitename, String doc_url, String datatime) {
		super();
		this.collection = collection;
		this.thumbnailUrl = thumbnailUrl;
		this.imageUrl = imageUrl;
		this.width = width;
		this.height = height;
		this.displaySitename = displaySitename;
		this.doc_url = doc_url;
		this.datatime = datatime;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getDisplaySitename() {
		return displaySitename;
	}

	public void setDisplaySitename(String displaySitename) {
		this.displaySitename = displaySitename;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}

	public String getDatatime() {
		return datatime;
	}

	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}

	@Override
	public String toString() {
		return "ImageItem [collection=" + collection + ", thumbnailUrl=" + thumbnailUrl + ", imageUrl=" + imageUrl
				+ ", width=" + width + ", height=" + height + ", displaySitename=" + displaySitename + ", doc_url="
				+ doc_url + ", datatime=" + datatime + "]";
	}
	
	
}
