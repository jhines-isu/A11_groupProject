package Project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Report {

	public static void main(String[] args) throws IOException {
		System.out.println("Do you want to print a report for the last day? (y/n)");
		Scanner in = new Scanner(System.in);
		Scanner fileIn = new Scanner(new File("riders.txt"));
		double reportD = 205.1;
		double charge = 470;
		int popLocation = 5;
		if(in.next().equalsIgnoreCase("y")){
			FileWriter report = new FileWriter("report.txt");
			PrintWriter writeReport = new PrintWriter(report);
			
			
			System.out.println("Total amount of miles today " + reportD);
			System.out.println("Total amount charged today " + charge);
			System.out.println("Most popular location today was location #" + popLocation);

			report.close();
			writeReport.close();
		}
	}

}
