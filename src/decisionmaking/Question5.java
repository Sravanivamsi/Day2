package decisionmaking;
   import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TYPE");
		String name = "studenttype";
		name = sc.nextLine();
		System.out.println("ENTER tution fee");
		float tutionfee = sc.nextFloat();
		System.out.println("ENTER bus fee");
	    float busfee = sc.nextFloat();
	    System.out.println("ENTER hostel fee");
	    float hostelfee = sc.nextFloat();
	    float total=0;
	    switch(name)
	    {
	    case "MSDS":
	    	System.out.println(tutionfee+busfee);
	    	break;
	    case "MSH":
	    	System.out.println(tutionfee+hostelfee);
	    	break;
	    case "MGSDS":
	    	System.out.println(150/100*tutionfee+busfee);
	    	break;
	    case "MGSG":
	    	System.out.println(150/100*tutionfee+hostelfee);
	    	break;
	    	
	    }
	    
		
		
		
	  

	}

}
