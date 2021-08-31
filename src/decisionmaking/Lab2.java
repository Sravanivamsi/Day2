package decisionmaking;
import java.util.Scanner;
public class Lab2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter lab allocated for ace training");
	String name = "studenttype";
	name = sc.nextLine();
	System.out.println("ENTER X");
	int x = sc.nextInt();
	System.out.println("ENTER y");
	int y = sc.nextInt();
	System.out.println("ENTER z");
	int z = sc.nextInt();
	//System.out.println("enter lab allocated for ace training");
	//String name = "studenttype";
	//name = sc.nextLine();
	switch(name)
	{
	case "L1":
		if(y<z)
		{
			System.out.println("L2 has minimal seating capacity");
		}
		else {
			System.out.println("L3 has minimum seating capacity");
		}
		break;
	case "L2":
		if(z<x)
		{
			System.out.println("L3 has minimal seating capacity");
		}
		else {
			System.out.println("L1 has minimum seating capacity");
		}
		break;
	case "L3":
		if(x<y)
		{
			System.out.println("L1 has minimum seating capacity");
		}
		else
		{
			System.out.println("L2 has minimum seating capacity");
		}
		break;
	}
	}
}
	
