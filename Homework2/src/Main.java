public class Main {

	public static void main(String[] args) {
		Worker[] workers = {new HourlyWorker("Mitko", 2, "Builder", 50), new SalariedWorker("Stoyan", 2, "Builder", 50), new SalariedWorker("Pesho", 3, "Builder", 45) };
		
		System.out.printf("Salary for worker first: %.2f lv.\n", workers[0].getWeeklySalary());
		System.out.printf("Salary for worker second: %.2f lv.\n", workers[1].getWeeklySalary());
		System.out.printf("Salary for worker third: %.2f lv.\n", workers[2].getWeeklySalary());
		System.out.printf("Total hours for week: %.2f h\n",totalHours(workers) );
		System.out.printf("Average hours for week: %.0fh %.0f minutes\n",averageHours(workers)[0],averageHours(workers)[1]);
		System.out.printf("Total money: %.2f lv.\n", totalMoney(workers));
		System.out.printf("Average money: %.2f lv.\n", totalMoney(workers)/3);
	}
	
	public static double totalHours(Worker[] workers){
		double sum=0;

		for(int i=0; i < workers.length ;i++){
			sum=sum+workers[i].getHours();
		}

		return sum;
	}
	
	public static double[] averageHours(Worker[] workers){
		double[] sum={totalHours(workers), 0}; //sum[0] -> hours; sum[1] -> minutes 
		sum[0]=sum[0]/3;
		if (sum[0]%1<1){
			sum[1] = (sum[0]%1)*60;
		}
		else sum[1]=0;
		return sum;
	}
	
	public static double totalMoney(Worker[] workers){
		double sum=0;
		for(int i=0;i<3;i++){
			sum=sum+workers[i].getWeeklySalary();
		}
		return sum;
	}
	
}