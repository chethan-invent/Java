package PMSPackage;

public class AccessModifiers {

	public static void main(String[] args) {
		InfyTV b1=new InfyTV();
		b1.setCorrespondent("Kimberely");
		b1.setNewsReporter("Hudson");
		b1.setPhotographer("Joshua");
        b1.documentaryFilm();
		System.out.println("by Correspondent: "+b1.getCorrespondent());
		System.out.println("Photographer: "+b1.getPhotographer());
		System.out.println("newsReporter: "+b1.getNewsReporter());
	}
}
class InfyTV
{
	private String photographer;
	private String newsReporter;
	private String correspondent;
	public String getPhotographer() {
		return photographer;
	}
	public String getNewsReporter() {
		return newsReporter;
	}
	public String getCorrespondent() {
		return correspondent;
	}
	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}
	public void setNewsReporter(String newsReporter) {
		this.newsReporter = newsReporter;
	}
	public void setCorrespondent(String correspondent) {
		this.correspondent = correspondent;
	}
	public void documentaryFilm() {
		System.out.println("A hundred years ago there were 100,000 tigers in the world.Today there are as few as 3,200. Why are tigers\n "
				+"disappearing?...... ");
	}
}