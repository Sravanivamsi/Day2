package decisionmaking;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of birth");
		int birth = sc.nextInt();
		System.out.println("ENTEr Year of current");
		int current = sc.nextInt();
		if(current<birth)
		{
			birth=100-birth;
			int age = birth+current;
			System.out.println("your age is:"+age);
		}
		else
		{
			System.out.println("your age is:" +(current-birth));
		}

	}

}
