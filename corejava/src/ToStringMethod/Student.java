package ToStringMethod;

public class Student {
	private int studId;
	private String studName;
	private double studAge;

	public Student() {
		super();
	}

	public Student(int studId, String studName, double studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
	}

	@Override
	public String toString() {
//		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + "]";

		return "Student studId=" + studId + "\n studName=" + studName + "\n studAge=" + studAge + "";
	}

}
