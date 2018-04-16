package cycloneShare;
import java.io.*;
import java.sql.*;

public class DriverDB {
	
	private String First_Name;
	private String Last_Name;
	private int DriverID;
	
	

	public void createDatabase(String[] args) throws IOException, SQLException, ClassNotFoundException, FileNotFoundException {
		
		if (args.length == 0) {
			System.out.println("Usage: Java Driver propertiesFile");
			System.exit(0);
		}
		SimpleDataSource.init(args[0]);
		
		try (Connection conn = SimpleDataSource.getConnection()) {
			Statement driver_db = conn.createStatement();
			
			driver_db.execute("CREATE TABLE Driver (First_Name VARCHAR(30)) (Last_Name VARCHAR(30)) DriverID VARCHAR(10)) ");
		}
	
			
	}
	public void addDriver(String F, String L, int ID) {
		First_Name = F;
		Last_Name = L;
		DriverID = ID;
		

		
	}
}
