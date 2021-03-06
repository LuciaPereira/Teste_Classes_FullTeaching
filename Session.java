
public class Session {


	private long id;

	private String title;

	private String description;

	private long date;

	public Session() {}

	public Session(String title, String description, long date) {
		this.title = title;
		this.description = description;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	//To make 'course.getSessions().remove(session)' possible
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Session))return false;
	    Session otherSession = (Session)other;
	    return (otherSession.id == this.id);
	}

	@Override
	public String toString() {
		return "Session[title: \"" + this.title + "\", description: \"" + this.description + "\", date: \"" + this.date + "\"]";
	}

}
