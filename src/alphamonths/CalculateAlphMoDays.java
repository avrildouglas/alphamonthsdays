package alphamonths;

import java.util.Scanner;
//import java.text.Format;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class CalculateAlphMoDays {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
    String Month;
	int numDays=0;
	boolean valid;
	String yes; 

		do{
			do{
				System.out.println("Please enter the first three letters of a month (e.g. May or Aug): ");
				
				Month = sc.next();
				//System.out.println(Month.length());
				//Format formatter = new SimpleDateFormat("MMM");
			//	Month = formatter.format(new Date());
			//	System.out.println(Month);
			//	valid = (Month.length() == 3) && (Month.matches("[a-zA-Z]+"));
				valid = false;
			//	System.out.println(valid);
			    if (Month.equalsIgnoreCase("Feb")){
	        	 numDays = 28;
			    valid = true;
				}else if (Month.equalsIgnoreCase("Jan") || Month.equalsIgnoreCase("Mar")
	        		|| Month.equalsIgnoreCase("May") || Month.equalsIgnoreCase("Jul")
	        		|| Month.equalsIgnoreCase("Aug") || Month.equalsIgnoreCase("Oct")
	        		|| Month.equalsIgnoreCase("Dec")){
			    	numDays = 31;
			    	valid = true;
	  			}else if(Month.equalsIgnoreCase("Apr") || Month.equalsIgnoreCase("Jun")
	  				|| Month.equalsIgnoreCase("Sep") || Month.equalsIgnoreCase("Nov")){
	  				numDays = 30; 
			    	valid = true;
	  			}else{
					System.out.println("ERROR!!! This is not valid month!!!.");
	  			}
			}while (!valid);
		  System.out.println("The number of days in " + Month + " are: " +  numDays + ".");
		  System.out.println("Want to enter another month? (Y/N)");
		  yes = sc.next();
	    }while (yes.equalsIgnoreCase("y"));	
  }
}	