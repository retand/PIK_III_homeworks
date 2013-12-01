import java.math.*;

public class Game implements Runnable{
	private int min = 1, max = 4 ,random;
	private int[] arr;
	private int nomer;
	public int tochki;

	public Game(int[] arr, int nomerNaIgracha ) {
		this.arr = arr;
		this.nomer = nomerNaIgracha;
		randomChoice();
	}

	public void run() {
		check();
	}
	
	public synchronized void randomChoice(){ //Metod koito opredeleq na proizvolen princip izbora na igracha i go zapisva v masiva.
		this.random = (int)(Math.random() * (max - min) + min);
		arr[this.nomer] = this.random;
		if(this.random == 1) {
			System.out.println("Izbora na igrach "+this.nomer+" e kamyk.");
		}else if (this.random == 2){
			System.out.println("Izbora na igrach "+this.nomer+" e nojica.");
		}else {
			System.out.println("Izbora na igrach "+this.nomer+" e hartiq.");
		}
	}
	
	public synchronized void check(){ // Metod koito reshava sydbata ot igrata i zapisva rezultatite v masiva
		int player1, player2, player3 ;
		// 1 - kamyk , 2 - nojica , 3 - hartiq
		player1 = arr[1];
		player2 = arr[2];
		player3 = arr[3];
		if ( player1 == player2 && player2 == player3 ){
		return;
		}
		
		switch(this.nomer){
		case 1:
			if ( player1 == 1 && player2 == 2 && player3 == 2){
				arr[4] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 2 && player2 == 3 && player3 == 3){
				arr[4] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 3 && player2 == 1 && player3 == 1){
				arr[4] += 2 ;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 1 && player2 == 1 && player3 == 2){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			if ( player1 == 1 && player2 == 2 && player3 == 1 ){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			if ( player1 == 2 && player2 == 2 && player3 == 3){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			if ( player1 == 2 && player2 == 3 && player3 == 2 ){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 3 && player3 == 1){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 1 && player3 == 3 ){
				this.tochki = 1;
				arr[4]+=this.tochki;
				break;
			}
			break;
		case 2:
			if ( player1 == 3 && player2 == 2 && player3 == 3){
				arr[5] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 1 && player2 == 3 && player3 == 1){
				arr[5] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 2 && player2 == 1 && player3 == 2){
				arr[5] += 2 ;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 1 && player2 == 1 && player3 == 2){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			if ( player1 == 2 && player2 == 1 && player3 == 1){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			if ( player1 == 2 && player2 == 2 && player3 == 3){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 2 && player3 == 2){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 3 && player3 == 1){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			if ( player1 == 1 && player2 == 3 && player3 == 3){
				this.tochki = 1;
				arr[5]+=this.tochki;
				break;
			}
			break;
		case 3:
			if ( player1 == 1 && player2 == 1 && player3 == 3){
				arr[6] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 2 && player2 == 2 && player3 == 1){
				arr[6] += 2;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 3 && player2 == 3 && player3 == 2){
				arr[6] += 2 ;
				//System.out.println("Играч "+this.nomer+" бие другите 2-ма играчи.");
				break;
			}
			if ( player1 == 2 && player2 == 3 && player3 == 2){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
			if ( player1 == 2 && player2 == 1 && player3 == 1){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 1 && player3 == 3){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
			if ( player1 == 3 && player2 == 2 && player3 == 2){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
			if ( player1 == 1 && player2 == 2 && player3 == 1){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
			if ( player1 == 1 && player2 == 3 && player3 == 3){
				this.tochki = 1;
				arr[6]+=this.tochki;
				break;
			}
		}
	}
}
