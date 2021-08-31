package decisionmaking;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b=  sc.nextInt();
		if(a==b) {
			System.out.printf("%d equals to %d:", a,b);
		}
		if(a>b) {
			System.out.printf("%d is greater then %d:",a,b);
		}
		if (a<b) {
			System.out.printf("%d is less than %d:",a,b);
		}
	}

}
