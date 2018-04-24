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
		  //The code below reads the appdata file and creates writers for two files
		   try (Scanner in = new Scanner(new File("appdata.txt"));
	           PrintWriter driverOut = new PrintWriter("drivers.txt");
	           PrintWriter riderOut = new PrintWriter("riders.txt"))
	      {
			   ArrayList<String> drivers = new ArrayList();
			   ArrayList<String> riders = new ArrayList();
		 double totalDistance = 0;
			   while (in.hasNextLine())
			      {
				   //This puts the data onto the driver.txt
				   String driverID = in.next();
				   String driverName = in.next();
				   double distance = in.nextDouble();
				   driverOut.println("ID: " + driverID + " Name: " 
				   +  driverName + " Location: " + distance);
				   double reportD = totalDistance + distance;
				   
				   

				   /* DRIVER AND RIDER ARE ONSAME LINE ON TEXT FILE
				   // each variable is separated by one space and there
				   // is 1 driver and 1 rider per line*/
				   
				   
				   //This writes the data to the rider.txt
				   
				   int riderID = in.nextInt();
				   String riderName = in.next();
				   int riderStart = in.nextInt();
				   int riderEnd = in.nextInt();
				   double charge = in.nextDouble();
				   String date = in.next();
				   riderOut.println("Rider ID: " + riderID + " Name: " +  riderName + " Start Location: " 
				   + riderStart + " End Location:" + riderEnd + " charge: " + charge + " Date: " + date);

			      } 
			  
			   driverOut.close();
			   riderOut.close();
			   
	      }
		  
	      catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	   


	}

}
