package Admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

interface Finecalculator{
	double calculate();

	void displaysolution(String s);
	
}


abstract public class AdminPanelStatistics implements Finecalculator{
	
	public String UserName;
	
	public String contactEmergency;
	public int ID;
	
	
	public AdminPanelStatistics() {
		
	}
	
	public double calculate() {
		return 0;
	}
		
	
	
	public abstract void displaysolution(String s);
	
	public abstract void ContactService();
	
	//child class
	static public class Rape extends AdminPanelStatistics implements Finecalculator{
		public static String Law = "Penal Code Section 376";
		public Rape(String a , String b , int c){
			UserName=a;
			contactEmergency=b;
			ID=c;
 
	           
		}
		
		public double calculate() {
			return 300000.56;
		}
		@Override
		public void displaysolution(String s) {
			
			if (s.equalsIgnoreCase("wife")){
				System.out.println("You would receive compensation for the abuse and your partner shall be expiled in jail for 2-3 YEARS");
			}
			
			else {
				System.out.println("The person who raped you will be sent for a term of 10 Yrs in Jail");
			}
			
			
			
		}
		
		public String toString() {
			return "According to Penal Code Section 376 , the punishment could be from 2 YEARS to 10 YEARS in jail.";
		}

		@Override
		public void ContactService() {
			Scanner inputer = null;
			try {
				inputer = new Scanner(new File("ContactService.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(inputer.hasNextLine()) {
				String namer=inputer.nextLine();
				String contacter=inputer.nextLine();
				System.out.println("Organisation: "+namer);
				System.out.println("Contact: "+contacter);
				System.out.println("\n");
			}
			
			
			
		}
		
		

		
		
		
		
		
	}
	
	static public class Kidnap extends AdminPanelStatistics implements Finecalculator{
		public static String Law="Penal Code 362 of 1860";
		public Kidnap(String a , String b , int c){
			UserName=a;
			contactEmergency=b;
			ID=c;
			
			
			 
	           
		}
		
		public double calculate() {
			return 45000;
		}
		
		
		

		
		public void displaysolution(int s) {
			if (s<=12) {
				System.out.println("Minor has been Kidnapped. Severe punishment of 10 years and amount of 120000 taka as fine.");
			}
			
			else {
				System.out.println("Punishment ranging from 3 to 7 yrs and may include fine");
			}
			
		}
		
		public String toString() {
			return "The Punishment according to the penal code is 7 YRS in prison and a fine as well.";
		}

		@Override
		public void ContactService() {
			Scanner inputer = null;
			try {
				inputer = new Scanner(new File("ContactKidnapMurder.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(inputer.hasNextLine()) {
				String namer=inputer.nextLine();
				String contacter=inputer.nextLine();
				System.out.println("Organisation: "+namer);
				System.out.println("Contact: "+contacter);
				System.out.println("\n");
			}
			
			
			
		}

		@Override
		public void displaysolution(String s) {
			// TODO Auto-generated method stub
			
		}
	}
	
	static public class Murder extends AdminPanelStatistics implements Finecalculator{
		public static String law="Penal Code 302 of 1860";
		public Murder(String a , String b , int c){
			UserName=a;
			contactEmergency=b;
			ID=c;
			
			
			
	           
	         
	          
		}
		
		public double calculate() {
			return 100000;
		}
		
		
		
		public String toString() {
			return "The punishment for the crime includes from 10 years to LIFETIME IMPRISONMENT and also DEATH BY HANGING";
		}
		
		  





		@Override
		public void displaysolution(String s) {
			if (s.equalsIgnoreCase("minor")) {
				System.out.println("The punishment would be Death By Hanging and a fine of 700000 taka to the family");
			}
			else {
				System.out.println("The punishment may range from imprisonment for lifetime to death by hanging.");
			}
			
		}

		@Override
		public void ContactService() {
			Scanner inputer = null;
			try {
				inputer = new Scanner(new File("ContactKidnapMurder.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(inputer.hasNextLine()) {
				String namer=inputer.nextLine();
				String contacter=inputer.nextLine();
				System.out.println("Organisation: "+namer);
				System.out.println("Contact: "+contacter);
				System.out.println("\n");
			}
			
			
			
		}
		
		
		
	}
	
	static public class WomenAbuse extends AdminPanelStatistics implements Finecalculator{
		public static String law="Domestic Violence Act 2010";
		public WomenAbuse(String a , String b , int c){
		 UserName=a;
			contactEmergency=b;
			ID=c;

	           
		}
		
		public String toString() {
			return "The punishment includes providing FINE and 1-2 YRS in prison.";
		}
		
		public void calculate(String s) {
			System.out.println("Dear "+s+" , unfortunately you cannot get compensation at the moment. You would receive amount sued upon the severity");
		}

		@Override
		public void displaysolution(String s) {
			if (s.equalsIgnoreCase("dowry")) {
				System.out.println("Prisonment of the partner followed by Fine of 80,000 taka");
			}
			
			else {
				System.out.println("Apply for Section 11 , punishment will be from 6 months to 1 yr in prison for the partner");
			}
		}

		@Override
		public void ContactService() {
			Scanner inputer = null;
			try {
				inputer = new Scanner(new File("ContactService.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(inputer.hasNextLine()) {
				String namer=inputer.nextLine();
				String contacter=inputer.nextLine();
				System.out.println("Organisation: "+namer);
				System.out.println("Contact: "+contacter);
				System.out.println("\n");
			}
			
			
			
		}
		
		
		
	}
	
	


}//end of main class parent




	
	
	





