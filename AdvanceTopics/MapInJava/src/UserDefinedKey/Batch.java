package UserDefinedKey;

public class Batch {
	private int id;
	private String batchName;
	
	public Batch(int id, String batchName) {
		this.id = id;
		this.batchName = batchName;
	}

	public int getId() {
		return id;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Batch batch = (Batch) obj;
		return (this.id == batch.id) && (this.batchName.equals(batch.batchName));
	}

	@Override
	public String toString() {
		return "Batch [" + batchName + "]";
	}
	
}
