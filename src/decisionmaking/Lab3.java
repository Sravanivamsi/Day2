package decisionmaking;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER X");
		int x = sc.nextInt();
		System.out.println("ENTER y");
		int y = sc.nextInt();
		System.out.println("ENTER z");
		int z = sc.nextInt();
        System.out.println("Enter n");
        int n= sc.nextInt();
        if((n>x)||(n>y) ){
        	System.out.println("1 lab  is accomadated for"+n+"students");
        }
        else if((n>x)||(n>y)||(n>z)) {
        	System.out.println("2 labs are accomadated for "+n+"students");
        }
        else {
        	System.out.println("no labs are accomadated for"+n+"students");
        }
	}

}
