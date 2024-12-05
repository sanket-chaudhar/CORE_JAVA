package ToStringMethod;

public class Mydate {
	private int Day;
	private int Month;
	private int year;

	public Mydate() {
		Day = 22;
		Month = 05;
		year = 2007;

	}

	public Mydate(int day, int month, int year) {
		super();

		Day = day;
		Month = month;
		this.year = year;

	}

	@Override
	public String toString() {
		return "Mydate Day=" + Day + ", Month=" + Month + ", year=" + year + "";
	}
}
