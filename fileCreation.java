package Project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class fileCreation {


	

	  
	   public static void main(String[] args)
	   {
		  
		   try (Scanner in = new Scanner(new File("appdata.txt"));
	           PrintWriter driverOut = new PrintWriter("drivers.txt");
	           PrintWriter riderOut = new PrintWriter("riders.txt");
	           PrintWriter driverInfoOut = new PrintWriter("driverInfo.txt"))
	      {
			   ArrayList<String> drivers = new ArrayList();
			   ArrayList<String> riders = new ArrayList();
		 
			   while (in.hasNextLine())
			      {
				   
				   int driverID = in.nextInt();
				   String driverName = in.next();
				   int driverStart = in.nextInt();
				   driverOut.println("ID: " + driverID + " Name: " 
				   +  driverName + " Location: " + driverStart);
				   driverInfoOut.println(" " + driverID + " " + driverStart);

				   //SAME LINE ON TEXT FILE
				   
				   int riderID = in.nextInt();
				   String riderName = in.next();
				   int riderStart = in.nextInt();
				   int riderEnd = in.nextInt();
				   double charge = in.nextDouble();
				   String date = in.next();
				   riderOut.println("Rider ID: " + riderID + " Name: " +  riderName + " Start Location: " 
				   + riderStart + " End Location:" + riderEnd + " charge: " + charge + " Date: " + date);

			      } 
			   driverInfoOut.close();
			   driverOut.close();
			   riderOut.close();
			   
	      }
	      catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	   


	}

}
