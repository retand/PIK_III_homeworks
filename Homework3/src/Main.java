import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int[] arr = new int[7]; // Ot 1-vi do 3-ti element sa izborite na igrachite; Ot 4 do 7 element sa rezultatite im.
		int brIgri, brRezults ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Колко игри искате да се изгираят?");
		brIgri = sc.nextInt();
		
		for (int z=0; z<brIgri ;z++){ // for cikyl za kolko pyti da se izigrae igrata
		int g=0;
			while (true){ // cikyl koito zanulqva izborite na igrachite
			arr[g] = 0;
				g++;
				if(g==3) break;
			}
		
		Thread a = new Thread (new Game(arr,1)); // Syzdava igrach 1
		Thread b = new Thread (new Game(arr,2)); // Syzdava igrach 2
		Thread c = new Thread (new Game(arr,3)); // Syzdava igrach 3
		a.start();
		b.start();
		c.start();
		a.join();
		b.join();
		c.join();
		System.out.println("Резултати.");
		brRezults=4;
		while (true){ // Printi rezultatite
			System.out.println(arr[brRezults]);
			brRezults++;
			if(brRezults == 7) break;
			}
		}
	}
}