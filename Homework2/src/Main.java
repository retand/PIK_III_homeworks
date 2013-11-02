public class Main {

	public static void main(String[] args) {
		double sum;
		Worker[] workers = {new HourlyWorker("Mitko", 2, "Builder", 50), new SalariedWorker("Stoyan", 2, "Builder", 50), new SalariedWorker("Pesho", 3, "Builder", 45) };
		
		System.out.printf("Salary: %f\n", workers[0].getWeeklySalary(workers[0].getHours() , workers[0].getHourSalary() ));
		System.out.printf("Salary: %f\n", workers[1].getWeeklySalary(workers[1].getHours(), workers[1].getHourSalary() ));

	}
}