package SchoolManagmentSystem;

public class Student {
	private String name;
	private int id;
	private int grade;
	private int feesTotal;
	private int feesPaid;
	
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	public int getid() {
		return id;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getRemainFees() {
		return feesTotal - feesPaid;
	}
	}