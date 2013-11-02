
public class SalariedWorker extends Worker {
	public String work;
	public double hours;
	
	public SalariedWorker(String name, double hourSalary, String work, double hours) {
		super(name, hourSalary);
		this.work = work;
		this.hours = hours;
	}

	@Override
	double getWeeklySalary(double hours, double hourSalary) {
		double sum;
		sum = hours * hourSalary;
		return sum;
	}
	
}
