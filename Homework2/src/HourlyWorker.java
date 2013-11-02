
public class HourlyWorker extends Worker {
	public String work;
	public double hours;
	
	public HourlyWorker(String name, double hourSalary, String work, double hours) {
		super(name, hourSalary);
		this.work = work;
		this.hours = hours;
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
