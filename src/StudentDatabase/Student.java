package StudentDatabase;

public class Student {
	public String name;
	public String SSN;
	public String emailId;
	private static int Id=1;
	private long phone;
	private String city;
	private String state;
	public String userId;
	public double balance=1000;
	public String[] course= {"Maths","Science","Social Studies"};
	 Student(String name, String SSN) {
		this.name=name;
		this.SSN=SSN;
		userId();genEmailID();
		Id++;
		System.out.println(userId);
		System.out.println(emailId);
	}
	public void userId() {
		String random = Integer.toString((int)(Math.random()*(9000-1000)+1000));
		this.userId=Id+random+SSN.substring(SSN.length()-4);
	}
	public void enroll(int fee) {
		pay(fee);
		showCourses();
		System.out.println("Balance is "+checkBalance());
	}
	public void pay(int amt) {
		this.balance-=amt;
		System.out.println("Student "+name+" paid : "+ amt);
	}
	public double checkBalance() {
		return balance;
	}
	public String toString() {
		return "[Student name = "+name+"]\n[user ID = "+userId+"]\n[email ID = "+emailId+"]\n[city = "+city+"]\n[state = "+state+"]\n[phone number = "+phone+"]\n";
	}
	public void showCourses() {
		int i=0;
		while(i<course.length) {
			System.out.print(course[i]);
			System.out.print("\t");
			i++;
		}
		System.out.println("");
	}
	public void genEmailID() {
		this.emailId=name.toLowerCase().replace(" ", "_").concat("@edu.com");
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Jane Smith","9090934sdk");
		s.setCity("NYC");
		s.setPhone(9090023);
		s.setState("NY");
		s.checkBalance();
		s.enroll(300);
		System.out.println(s.toString());
		Student s1=new Student("Joe Smith","9546584dkd");
		s1.setCity("Albany");
		s1.setPhone(9562783);
		s1.setState("NY");
		s1.checkBalance();
		s1.enroll(300);
		System.out.println(s1.toString());
	}

}
