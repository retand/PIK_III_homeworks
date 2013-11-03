
public class SalariedWorker extends Worker {
	private String work;
	private double hours;
	
	public SalariedWorker(String name, double hourSalary, String work, double hours) {
		super(name, hourSalary);
		setWork(work);
		setHours(hours);
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	double getWeeklySalary() {
		return getHours() * getHourSalary();
	}
	
}
