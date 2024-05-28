package lab5;

public class Student {

	private int id;
	private String name;
	private boolean active;

	public Student(int id, String name, boolean active) {
		this.id = id;
		this.name = name;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", active=" + active + '}';
	}

	public static void main(String[] args) {
		// Example usage
		Student student = new Student(123, "vicky", true);
		System.out.println(student);

		student.setId(1122);
		student.setActive(false);
		System.out.println(student);
	}
}
