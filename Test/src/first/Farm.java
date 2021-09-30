package first;

public abstract class Farm {
	private String kind;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public Farm(String kind) {
		this.kind = kind;
	}

	public abstract void feed();
}
