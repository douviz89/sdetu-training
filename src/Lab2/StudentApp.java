package Lab2;

public class StudentApp {
	public static void main(String[] args) {

		Student s1 = new Student("Douv", "123456789");
		System.out.println(s1.toString());
		System.out.println("Adding code from github");
	}
}

class Student {

	private static int iD = 1000;
	private String userId;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	private double balance;

	public Student(String name, String sSN) {
		iD++;
		this.name = name;
		SSN = sSN;
		email = name + "@java.com";
		setUserId();
	}

	private void setUserId() {
		int upper = 9000;
		int lower = 1000;
		int r = (int) (Math.random() * (upper - lower)) + lower;
		System.out.println("random: " + r);
		userId = iD + "" + r + SSN.substring(SSN.length() - 4);

	}

	@Override
	public String toString() {
		return "Name : " + name + ",\nUserId : " + userId + ",\nEmail : " + email;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
