import java.util.List;
import java.util.ArrayList;

public class Forum {

	private long id;

	private boolean activated;

	private List<Entry> entries;

	public Forum(){}

	public Forum(boolean activated) {
		this.activated = activated;
		this.entries = new ArrayList<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	@Override
	public String toString() {
		int numberOfComments = 0;
		for (Entry entry: this.entries) {
			numberOfComments += entry.getComments().size();
		}
		return "Forum[activated: \"" + this.activated + "\", #entries: \"" + this.entries.size() + "\", #comments: \"" + numberOfComments + "\"]";
	}

}
