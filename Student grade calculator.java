
import java.util.Scanner;

public class Gradewww
{
	public static void main(String[] args)
   
   {
		float sum = 0,Average;
	   float[] marksof6subjects = new float[8]; 
	   try (Scanner sc = new Scanner(System.in))
	   {
		System.out.println("Enter 6 subject marks/");
		   for (int i = 1; i <=6; i++) {
			   System.out.println("Enter "+i+" subject marks:");
			   marksof6subjects[i]=sc.nextFloat();
			
			  }
	}
	   for (int i = 0; i < marksof6subjects.length; i++) {
		sum =sum+marksof6subjects[i];
		
	}
	  
	
	   Average=sum/6;
	
	   System.out.println("Total marks: "+sum+" out of 600");
     System.out.println("Average percentage: "+Average+"%");
	
     
     if (Average>90&&Average<100) {
    	 System.out.println("Grade:A1");		
	}
     else if (Average>80&&Average<90) {
		System.out.println("Grade:A2");
	}
     else if (Average>70&&Average<80) {
 		System.out.println("Grade:B1");
 	}
     else if (Average>60&&Average<70) {
 		System.out.println("Grade:B2");
 	}
     else if (Average>50&&Average<60) {
 		System.out.println("Grade:C1");
 	}
     else if (Average>40&&Average<50) {
 		System.out.println("Grade:C2");
 	}
     else if (Average>33&&Average<40) {
 		System.out.println("Grade:D");
 	}
     else if (Average<32) {
 		System.out.println("Grade:F(Failed)");
 	}
     else {
		System.out.println("⚠︎Enter the marks under 100 to get grade correctly");
	}
    
     
   }
}
