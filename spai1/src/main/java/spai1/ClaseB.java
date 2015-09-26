package spai1;

public class ClaseB {
	private String name;

	public ClaseB(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClaseB [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
