package UserDefinedKey;

public class Subject {
	private int id;
	private String subjectName;
	
	public Subject(int id, String subjectName) {
		super();
		this.id = id;
		this.subjectName = subjectName;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Subject sub = (Subject) obj;
		return (this.id == sub.id) && (this.subjectName.equals(sub.subjectName));
	}
	

	@Override
	public String toString() {
		return "Subject [" + subjectName + "]";
	}

	public int getId() {
		return id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}	
}
