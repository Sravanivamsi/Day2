package decisionmaking;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of a dozen mangoes");
		float cp = sc.nextFloat();
		System.out.println("Enter the price at which 1 mango is being sold");
		float sp = sc.nextFloat();
		if((sp*12)>cp) {
			 float result = (sp*12)-cp;
		  System.out.printf(" PROFIT: %.2f",result);
		}
		else if((sp*12)<cp) {
			float value = cp-(sp*12);
			System.out.printf(" LOSS: %.2f", value);
		}
		else {
			System.out.println("NO PROFIT NO LOSS");
		}

	}

}
