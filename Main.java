// Task 17; Iliyan Petrov, F.N.:121212123 ,Group 55 ,KST
import java.util.Scanner;

public class Main {
	public static int[][] table = new int[101][101];
	public static Scanner sc = new Scanner(System.in);
	public static int ships,br=0,iCoord=0,check;
	
	public static void buildShip(int x1, int x2, int y1, int y2){
		outerfor:
			  for(int f1 = x1; f1 <= x2 ; f1++){
			   for(int z1=y1; z1 <= y2 ; z1++){
			    if( table[f1][z1] == 1 ) { 
			     System.out.println("There is a ship. Please enter new coordinates.");
			     System.out.printf("Enter first x: ");
			     x1 = sc.nextInt();
			     System.out.printf("Enter second x: ");
			     x2 = sc.nextInt();
			     System.out.printf("Enter first y: ");
			     y1 = sc.nextInt();
			     System.out.printf("Enter second y: ");
			     y2 = sc.nextInt();
			     buildShip(x1, x2, y1, y2);
			     break outerfor;
			    }
			   }
			  }
		for(int f1 = x1; f1 <= x2 ; f1++){
			for(int z1=y1; z1 <= y2 ; z1++){
			table[f1][z1]=1;
			}
		}
	}
	public static void main(String[] args) {
		int x1,x2,y1,y2,temp;
		if(iCoord==0){
		System.out.println("How many ships do you like to build ?");
		ships = sc.nextInt();
		}
		while(br<ships){
			System.out.printf("Enter first x: ");
			x1 = sc.nextInt();
			System.out.printf("Enter second x: ");
			x2 = sc.nextInt();
			System.out.printf("Enter first y: ");
			y1 = sc.nextInt();
			System.out.printf("Enter second y: ");
			y2 = sc.nextInt();
			if (x1>x2){ 
				iCoord=1; 
				System.out.println("Invalid coordinate. They will be inverted."); 
				temp=x1;
				x1=x2;
				x2=temp;
			}
			if (y1>y2){
				iCoord=1;
				System.out.println("Invalid coordinate. They will be inverted.");
				temp=y1;
				y1=y2;
				y2=temp;
		}
			buildShip(x1, x2, y1, y2);
			br++;
			System.out.println("Ship built successful.");
		}
	}
};