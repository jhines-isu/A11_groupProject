package cycloneShare;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class Manager {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException, SQLException {
		
		DriverDB Driver_System = new DriverDB();
		//RiderDB Rider_System = new RiderDB();
		Driver_System.createDatabase(args);
		//Rider_System.CreateDatabase(args);
		
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do?");
		
		if (in.next().equals("Add")) {
			System.out.println("First Name? ");
			System.out.println("> ");
			String First_Name = in.next();
			
			System.out.println("Last Name? ");
			System.out.println("> ");
			String Last_Name = in.next();
			
			System.out.println("Driver ID? ");
			System.out.println("> ");
			int DriverID = in.nextInt();
			
			Driver_System.addDriver(First_Name, Last_Name, DriverID);
		}
	}

}
