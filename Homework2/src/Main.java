public class Main {


	public static void main(String[] args) {

		Worker[] worker = {new HourlyWorker("Mitko", 2, "Builder", 50), new SalariedWorker("Stoyan", 2, "Builder", 50), new SalariedWorker("Pesho", 3, "Builder", 45) };
		

		System.out.printf("Salary: %f\n", worker[0].getWeeklySalary(50 , worker[0].hourSalary));
		System.out.printf("Salary: %f\n", worker[1].getWeeklySalary(50, worker[1].hourSalary));
	}

}
