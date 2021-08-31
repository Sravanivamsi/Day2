package decisionmaking;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER X");
		int x = sc.nextInt();
		System.out.println("ENTER y");
		int y = sc.nextInt();
		System.out.println("ENTER z");
		int z = sc.nextInt();
		if((x<y)&&(x<z)){
			System.out.println("L1 has minimal seating capacity");
		}
		else if((y<x)&&(y<z)){
			System.out.println("L2 has minimal seating capacity");
		}
		else {
			System.out.println("L3 has minimal seating capacity");
		}
		
		

	}

}
