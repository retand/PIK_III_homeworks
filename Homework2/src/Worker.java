
public abstract class Worker {
	public String name;
	public double hourSalary;
	
	public Worker( String name, double hourSalary){
		this.name = name;
		this.hourSalary = hourSalary;
	}
	
	abstract double getWeeklySalary(double hours, double hourSalary);
}
