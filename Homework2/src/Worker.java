
public abstract class Worker {
	private String name;
	private double hourSalary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	public Worker( String name, double hourSalary){
		setName(name);
		setHourSalary(hourSalary);
	}
	
	abstract double getWeeklySalary();
	abstract double getHours();
}
