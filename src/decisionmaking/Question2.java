package decisionmaking;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println("vowel");
		}
		else if(ch>='A'&& ch<='Z') {
			System.out.println("consonant");
		}
		else {
			System.out.println("not a alphabet");
		}
			
				
			}

	}
