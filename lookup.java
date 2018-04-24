package Project;

import hw6.LookupTable;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lookup {
		   public static void main(String[] args) throws IOException
		   {
		      Scanner in = new Scanner(System.in);
		      System.out.println("Enter the name of the file: ");
		      String fileName = in.nextLine();
		 
		      lookupTable table = new lookupTable();
		      FileReader reader = new FileReader(fileName);
		      table.read(new Scanner(reader));
		      
		      boolean more = true;
		      while (more)
		    	  
		      {  
		  		double reportD = 205.1;
				double charge = 470;
				int popLocation = 5;//Prompts user to see how to proceed.
		         System.out.println("Lookup D)river, R)ider, RE)port Q)uit?");
		         String cmd = in.nextLine();
		         //All of the below 'searches' for names from the IDs given  
		         if (cmd.equalsIgnoreCase("Q")) 
		            more = false;
		         else if (cmd.equalsIgnoreCase("D"))
		         { 
		            System.out.println("Enter Driver ID:");
		            String n = in.nextLine();
		            System.out.println("Driver name: " + table.lookup(n) + "\n");
		         }
		         else if (cmd.equalsIgnoreCase("R"))
		         { 
		            System.out.println("Enter Rider ID:");
		            String n = in.nextLine();
		            System.out.println("Rider name: " + table.lookup(n)+ "\n");
		         }
		         else if (cmd.equalsIgnoreCase("RE"))
		         { 
		            System.out.println("Here is the report for (02/02/2018)");
		            System.out.println("Total amount of miles today " + reportD);
			System.out.println("Total amount charged today " + charge);
			System.out.println("Most popular location today was location #" + popLocation);
			System.exit(0);
		      }
		     }
		   }
}
	

