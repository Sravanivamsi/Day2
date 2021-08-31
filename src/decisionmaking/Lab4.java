package decisionmaking;
import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER X");
		int x = sc.nextInt();
		System.out.println("ENTER y");
		int y = sc.nextInt();
		System.out.println("ENTER z");
		int z = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		if(x<n) {
			System.out.println("L1 is allocated to this class");
		}
		else if(y<n) {
			System.out.println("L2 is allocated to this class");
		}
		else if(n>z) {
			System.out.println("L3 is allocated to this class");
		}
		else {
			System.out.println("NONE of the labs can be allocated ");
		}
	}

}
