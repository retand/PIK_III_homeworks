
public class HourlyWorker extends Worker {
	private String work;
	private double hours;
	
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

	public HourlyWorker(String name, double hourSalary, String work, double hours) {
		super(name, hourSalary);
		setWork(work);
		setHours(hours);
	}

	double getWeeklySalary(double hours, double hourSalary) {
		double sum = 0;
		if(hours>40){
			hourSalary=hourSalary*1.5;
			hours=hours-40;
			sum = hours*hourSalary;
			hourSalary = hourSalary/1.5;
			hours=40;
		}
		sum=sum+(hours*hourSalary);
		return sum;
	}
}
