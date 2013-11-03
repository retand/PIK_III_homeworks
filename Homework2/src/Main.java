public class Main {

	public static void main(String[] args) {
		double sum,minutes=0;
		Worker[] workers = {new HourlyWorker("Mitko", 2, "Builder", 50), new SalariedWorker("Stoyan", 2, "Builder", 50), new SalariedWorker("Pesho", 3, "Builder", 45) };
		
		System.out.println(workers.length);
		System.out.printf("Salary for worker first: %.2f lv.\n", workers[0].getWeeklySalary(workers[0].getHours() , workers[0].getHourSalary() ));
		System.out.printf("Salary for worker second: %.2f lv.\n", workers[1].getWeeklySalary(workers[1].getHours(), workers[1].getHourSalary() ));
		System.out.printf("Salary for worker third: %.2f lv.\n", workers[2].getWeeklySalary(workers[2].getHours(), workers[2].getHourSalary() ));
		sum=0;
		for(int i=0;i<3;i++){
			sum=sum+workers[i].getHours();
		}
		System.out.printf("Total hours for week: %.2f h\n",sum );
		sum=sum/3;
		if (sum%1<1){
			minutes = (sum%1)*60;
		}
		System.out.printf("Average hours for week: %.0f h %.0f minutes\n",sum,minutes);
		sum=0;
		for(int i=0;i<3;i++){
			sum=sum+workers[i].getWeeklySalary(workers[i].getHours(), workers[i].getHourSalary());
		}
		System.out.printf("Total money: %.2f lv.\n", sum);
		System.out.printf("Average money: %.2f lv.\n", sum/3);
	}
}