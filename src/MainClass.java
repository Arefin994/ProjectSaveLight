import Admin.*;
import Admin.AdminPanelStatistics.Kidnap;
import Admin.AdminPanelStatistics.Murder;
import Admin.AdminPanelStatistics.Rape;
import Admin.AdminPanelStatistics.WomenAbuse;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainClass {
	
	static int counter=0;
	static int counter2=0;
	
	
	int Passchecker(String a , String b) {
		if (a.equals(b)) {
			return 1;
		}
		else return 0;
		
	}
	
	public static void Rapistlist() {
		Scanner inputer = null;
		try {
			inputer = new Scanner(new File("Rapists.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ArrayList<String> list = new ArrayList<>();
           while (inputer.hasNextLine()) {
           
               String name = inputer.nextLine();
               String obj = new String(name);
               list.add(obj);
           }

           // Convert list to array
           String[] criminals = new String[list.size()];
           criminals= list.toArray(criminals);
           System.out.println("List of the popular criminals in this category:");
			for (int i=0;i<criminals.length;i++) {
				System.out.println(criminals[i]);
			}
	}
		
	public static void Kidnaplist() {
		Scanner inputer = null;
		try {
			inputer = new Scanner(new File("Kidnappers.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ArrayList<String> list = new ArrayList<>();
           while (inputer.hasNextLine()) {
           
               String name = inputer.nextLine();
               String obj = new String(name);
               list.add(obj);
           }

           // Convert list to array
           String[] criminals = new String[list.size()];
           criminals= list.toArray(criminals);
           System.out.println("List of the popular criminals in this category:");
			for (int i=0;i<criminals.length;i++) {
				System.out.println(criminals[i]);
			}
	}
	
	
	public static void Murderlist() {
		Scanner inputer = null;
		try {
			inputer = new Scanner(new File("Murderers.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ArrayList<String> list = new ArrayList<>();
           while (inputer.hasNextLine()) {
           
               String name = inputer.nextLine();
               String obj = new String(name);
               list.add(obj);
           }

           // Convert list to array
           String[] criminals = new String[list.size()];
           criminals= list.toArray(criminals);
           System.out.println("List of the popular criminals in this category:");
			for (int i=0;i<criminals.length;i++) {
				System.out.println(criminals[i]);
			}
	}
	
	public static void Abuselist() {
		Scanner inputer = null;
		try {
			inputer = new Scanner(new File("WomenAbuse.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ArrayList<String> list = new ArrayList<>();
           while (inputer.hasNextLine()) {
           
               String name = inputer.nextLine();
               String obj = new String(name);
               list.add(obj);
           }

           // Convert list to array
           String[] criminals = new String[list.size()];
           criminals= list.toArray(criminals);
           System.out.println("List of the popular criminals in this category:");
			for (int i=0;i<criminals.length;i++) {
				System.out.println(criminals[i]);
			}
	}
	private static void welcomeGUI() {
//	    MyFrame frm = new MyFrame();
//	    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	    JLabel welcomeLabel = new JLabel("Welcome to the Project Safelight");
//	    welcomeLabel.setBounds(50, 20, 200, 30);
//	    frm.getContentPane().add(welcomeLabel);
//
//	    JButton button1 = new JButton("RUN");
//	    button1.setBounds(100, 50, 100, 30);
//	    frm.getContentPane().setLayout(null);
//	    frm.getContentPane().add(button1);
//
//	    JButton quitButton = new JButton("QUIT");
//	    quitButton.setBounds(100, 100, 100, 30);
//	    frm.getContentPane().add(quitButton);
//	    
//	    welcomeLabel.setVerticalAlignment(JLabel.CENTER);
//	    welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
//	    Dimension frameSize = frm.getSize();
//	    Dimension labelSize = welcomeLabel.getPreferredSize();
//	    Dimension buttonSize = button1.getPreferredSize();
//	    Dimension quitButtonSize = quitButton.getPreferredSize();
//
//	    welcomeLabel.setBounds(
//	            (frameSize.width - labelSize.width) / 2,
//	            20,
//	            labelSize.width,
//	            labelSize.height
//	    );
//	    button1.setBounds(
//	            (frameSize.width - buttonSize.width) / 2,
//	            50,
//	            buttonSize.width,
//	            buttonSize.height
//	    );
//	    quitButton.setBounds(
//	            (frameSize.width - quitButtonSize.width) / 2,
//	            100,
//	            quitButtonSize.width,
//	            quitButtonSize.height
//	    );
//
//	    button1.addActionListener(new ActionListener() {
//	        public void actionPerformed(ActionEvent e) {
//	            frm.dispose(); // Close Frame 1
//
//	            MyFrame frm2 = new MyFrame();
//	            frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//	            JButton button2 = new JButton("Go back");
//	            button2.setBounds(100, 50, 120, 30);
//	            frm2.getContentPane().setLayout(null);
//	            frm2.getContentPane().add(button2);
//
//	            button2.addActionListener(new ActionListener() {
//	                public void actionPerformed(ActionEvent e) {
//	                    frm2.dispose(); // Close Frame 2
//	                    frm.setVisible(true); // Reopen Frame 1
//	                }
//	            });
//
//	            frm2.setVisible(true); // Show Frame 2
//	        }
//	    });
//
//	    quitButton.addActionListener(new ActionListener() {
//	        public void actionPerformed(ActionEvent e) {
//	            frm.dispose(); // Close Frame 1
//	        }
//	    });
//
//	    frm.setVisible(true); // Show Frame 1
	}



	public static void main(String[] args){
		
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                welcomeGUI();
	            }
	        });
		
//		MyFrame projectFrame = new MyFrame();
//        JLabel titleLabel = new JLabel("Welcome to Project Safelight");
//        titleLabel.setBounds(50, 20, 200, 30);
//        projectFrame.getContentPane().add(titleLabel);
		
		//We shall inherit function1 class for rape , abuse , child marriage and different victims
		System.out.println("Files are getting read from the input file system");
		//File system created
		try {
			Scanner input1 = new Scanner(System.in);
			 Functionshuru[] arrayboss = new Functionshuru[500];
			 Scanner input = new Scanner(new File("input.txt"));
			 ArrayList<Functionshuru> list = new ArrayList<>();
	            while (input.hasNextLine()) {
	            	input.nextLine();
	                String name = input.nextLine();
	                String contact = input.nextLine();
	                String location = input.nextLine();
	                String issue = input.nextLine();
	                String password=input.nextLine();	                
	                int age = input.nextInt();
	                int id = input.nextInt();
	                counter++;
	                
	                Functionshuru obj = new Functionshuru(name, contact, location, issue,password, age, id);
	                list.add(obj);
	            }
	            // Convert arraylist to array
	            Functionshuru[] array = new Functionshuru[list.size()];
	            array = list.toArray(array);    
	                
            // Write output to file
	            System.out.println("No of accounts obtained from input file: "+counter);
	            System.out.println("\n\n");
	            FileWriter output = new FileWriter("output.txt");
            for (int i=0;i<counter;i++) {
            	output.write("Name: " + array[i].getName() + "\n");
                output.write("Contact: " + array[i].getContact() + "\n");
                output.write("Location: " + array[i].getLocation() + "\n");
                output.write("Issue: " + array[i].getIssue() + "\n");
                output.write("Password: "+array[i].getPass()+"\n");
                output.write("Age: " + array[i].getAge() + "\n");
                output.write("ID: " + array[i].getId() + "\n");
                output.write("\n");

            }
            
            output.close();
            
            
            for (int k=0;k<counter;k++) {
            	arrayboss[k] = new Functionshuru(array[k].getName(),array[k].getContact(),array[k].getLocation(),array[k].getIssue(), array[k].getPass(),array[k].getAge(),array[k].getId());
            	counter2++;
            } 

    		//real project starts here---------------------------------------------->
           Main:
           for (int i=1;i>=1;i++) {
        	    System.out.println("Welcome to the Project Safelight");
       			System.out.println("Your journey to safety begins today");
       			System.out.println("-----------------------------------");
       			System.out.println("Type \"Quit\" to exit or \"Run\" to continue");
       			String mn;
       			
       			mn=input1.nextLine();
       			if (mn.equals("Quit")) break Main;
       			
       			System.out.println("Are you an \"user\" or \"admin?\"");
       			String a;
       			a=input1.nextLine();
       			
       			
       		User:
       			if (a.equalsIgnoreCase("user"))
       			for (int j=1;j>=1;j++) {
       				 
        				System.out.println("Welcome user , are you \"new\" or \"existing\" user?");
        				String b;
        				b=input1.nextLine();
        			
        				//---This starts an entire new System-----
        				if (b.equalsIgnoreCase("new")) {
        					System.out.println("Welcome new user , we shall start the registration then");
        					System.out.println("Enter your name:");
        					String name1=input1.nextLine();
        					System.out.println("Enter your contact info: ");
        					String contact1=input1.nextLine();
        					System.out.println("Enter your location: ");
        	                String location1 = input1.nextLine();
        	                System.out.println("Enter your issue: ");
        	                System.out.println("Make sure to give the issue in \"Rape\" or \"Kidnap\" or \"Murder\" or \"Women Abuse\"");
        	                String issue1= input1.nextLine();
        	                System.out.println("Enter a strong password: ");
        	                String pass1 = input1.nextLine();
        	                System.out.println("Enter your age: ");
        	                int age1= input1.nextInt();
        	                System.out.println("Enter an ID");
        	                int id1= input1.nextInt();
        	                IDMAKER:
        	                	for (int tul=0;tul>=0;tul++) {
        	                		
        	                		int nounter=0;
        	           
                	                for (int mhl=0;mhl<counter2;mhl++) {
                	                	if (arrayboss[mhl].getId()==id1) {
                	                		nounter=1;
                	                		break;
                	                	}
                	                }
                	                if (nounter==1) {
                	                	System.out.println("ID previously exist. Enter the ID Again");
                	                	id1=input1.nextInt();
                	                }
                	                else break IDMAKER;

        	                	}  

        	                //new work shall begin from here
        	                
        	                
        	                arrayboss[counter2]=new Functionshuru(name1,contact1,location1,issue1,pass1,age1,id1);
        	                counter2++;
        	                System.out.println("New account has been created");
        	                System.out.println("Dear "+arrayboss[counter2-1].getName()+" ,your account has been created. Press 0 to return to the main menu");
        	               
        	                FileWriter output1 = new FileWriter("output.txt");
        	                for (int m=0;m<counter2;m++) {
        	                	output1.write("Name: " + arrayboss[m].getName() + "\n");
        	                    output1.write("Contact: " + arrayboss[m].getContact() + "\n");
        	                    output1.write("Location: " + arrayboss[m].getLocation() + "\n");
        	                    output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
        	                    output1.write("Password: "+arrayboss[m].getPass()+"\n");
        	                    output1.write("Age: " + arrayboss[m].getAge() + "\n");
        	                    output1.write("ID: " + arrayboss[m].getId() + "\n");
        	                    output1.write("\n");

        	                }
        	                
        	                output1.close();
        	                
        	                int m;
        	                System.out.println("Enter the number:");
        	                m=input1.nextInt();
        	                input1.nextLine();
        	                if (m==0) break User;
        	            
       			}
        				//New ended here

        		//Existing starts here 
        				else if (b.equalsIgnoreCase("existing")) {
        					for (int l=1;l>=1;l++) {

        					
        					if (l==4) {
        						System.out.println("Password failed 3 times , returning to main menu");
        						break User;
        					}
        					System.out.println("Enter the ID and password to continue");
        					System.out.println("-------------------------------------");
        					int id;
        					String pass;
        					System.out.println("Enter the ID:");
        					id=input1.nextInt();
        					input1.nextLine();
        					System.out.println("Enter the password: ");
        					pass=input1.nextLine();
        					
        					for (int tree=0;tree<counter2;tree++) {
        						if (arrayboss[tree].getId()==id && pass.equals(arrayboss[tree].getPass())) {
        							for (int f=0;f>=0;f++) {
        							System.out.println("\n\nWelcome to the panel dear "+arrayboss[tree].getName());
        							System.out.println("What would you like to do?");
        							System.out.println("Press A to lodge a new complaint\nB to withdraw complaint\nC to return to the main menu\nD to activate SuggestLight\nE to chat with TailorWinder");
        							String abo = input1.nextLine();
        							if (abo.equalsIgnoreCase("A")) {
        								System.out.println("Enter the new complaint");
        								String issuer = input1.nextLine();
        								arrayboss[tree].setIssue(issuer);
        								System.out.println("The issue has been lodged successfully");
        								 
        		        	                
        								FileWriter output1 = new FileWriter("output.txt");

        		        	                for (int m=0;m<counter2;m++) {
        		        	                	output1.write("Name: " + arrayboss[m].getName() + "\n");
        		        	                    output1.write("Contact: " + arrayboss[m].getContact() + "\n");
        		        	                    output1.write("Location: " + arrayboss[m].getLocation() + "\n");
        		        	                    output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
        		        	                    output1.write("Password: "+arrayboss[m].getPass()+"\n");
        		        	                    output1.write("Age: " + arrayboss[m].getAge() + "\n");
        		        	                    output1.write("ID: " + arrayboss[m].getId() + "\n");
        		        	                    output1.write("\n");

        		        	                }
        		        	                
        		        	                output1.close();
        		        	              
        								
        							}
        							else if (abo.equalsIgnoreCase("B")) {
        								arrayboss[tree].setIssue("NULL");
        								System.out.println("The complaint has been withdrawn.");
        							
        		        	                
        								FileWriter output1 = new FileWriter("output.txt");

        		        	                for (int m=0;m<counter2;m++) {
        		        	                	output1.write("Name: " + arrayboss[m].getName() + "\n");
        		        	                    output1.write("Contact: " + arrayboss[m].getContact() + "\n");
        		        	                    output1.write("Location: " + arrayboss[m].getLocation() + "\n");
        		        	                    output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
        		        	                    output1.write("Password: "+arrayboss[m].getPass()+"\n");
        		        	                    output1.write("Age: " + arrayboss[m].getAge() + "\n");
        		        	                    output1.write("ID: " + arrayboss[m].getId() + "\n");
        		        	                    output1.write("\n");

        		        	                }
        		        	                
        		        	                output1.close();
        		        	               
        							}
        							
        							else if (abo.equalsIgnoreCase("C")) {
        								System.out.println("Logging out\n\n");
        								break User;
        							}
        							//----do work here at night
        							else if (abo.equalsIgnoreCase("D")) {
        					
        								System.out.println("SuggestLight Activated for "+arrayboss[tree].getName());
        								if (arrayboss[tree].getIssue().equalsIgnoreCase("Rape")) {
        									Rape r1 = new Rape(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
        									System.out.println("Everything will get healed out!!");
        									System.out.println("---------------------------------");
        									System.out.println("\n\nPenal code for the crime: "+Rape.Law);
        									System.out.println("Punishment for the crime: "+r1.toString());
        									System.out.println("How are you related to the person? Wife or Else?");
        									input1.nextLine();
        									String sop=input1.nextLine();
        									r1.displaysolution(sop);
        									System.out.println("Only wife will receive a compensation of "+r1.calculate());
        									System.out.println("Press 2 to know whom to contact:");
        									int trap = input1.nextInt();
        									if (trap==2) {
        										r1.ContactService();
        									}
        									else {
        										System.out.println("Exception Caught: Returning back");
        									}
        									
        								}//Rape ends here
        								
        								else if (arrayboss[tree].getIssue().equalsIgnoreCase("Kidnap")) {
        									
        									Kidnap k1 = new Kidnap(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
        									System.out.println("You shall find it soon!!");
        									System.out.println("------------------------");
        									System.out.println("Penal code for the crime: "+k1.Law);
        									System.out.println("Punishment for the crime: "+k1.toString());
        									System.out.println("How old is the person who is kidnapped?");
        									int bob=input1.nextInt();
        									k1.displaysolution(bob);
        									System.out.println("\n");
        									System.out.println("Others receive a compensation of "+k1.calculate()+" taka");
        									System.out.println("Press 2 to know whom to contact:");
        									int trap = input1.nextInt();
        									if (trap==2) {
        										k1.ContactService();
        									}
        									else {
        										System.out.println("Exception Caught: Returning back");
        									}

        								}//Kidnap ends here
        								
        								else if (arrayboss[tree].getIssue().equalsIgnoreCase("Murder")) {
        									
        									Murder m1 = new Murder(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
        									System.out.println("Justice will be served!!");
        									System.out.println("---------------------------------");
        									System.out.println("\n\nPenal code for the crime: "+m1.law);
        									System.out.println("Punishment for the crime: "+m1.toString());
        									System.out.println("Is the person murdered a minor or not?");
        									
        									String sop=input1.nextLine();
        									m1.displaysolution(sop);
        									System.out.println("Others will receive a compensation of "+m1.calculate());
        									System.out.println("Press 2 to know whom to contact:");
        									int trap = input1.nextInt();
        									if (trap==2) {
        										m1.ContactService();
        									}
        									else {
        										System.out.println("Exception Caught: Returning back");
        									}

        								}//Murder ends here
        								
        								
        								else if (arrayboss[tree].getIssue().equalsIgnoreCase("abuse")) {
        									WomenAbuse m1 = new WomenAbuse(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
        									System.out.println("Justice will be served!!");
        									System.out.println("---------------------------------");
        									System.out.println("\n\nPenal code for the crime: "+m1.law);
        									System.out.println("Punishment for the crime: "+m1.toString());
        									System.out.println("Is the violence related to dowry?");
        									
        									String sop=input1.nextLine();
        									m1.displaysolution(sop);
        									m1.calculate(arrayboss[tree].getName());
        									System.out.println("Press 2 to know whom to contact:");
        									int trap = input1.nextInt();
        									if (trap==2) {
        										m1.ContactService();
        									}
        									else {
        										System.out.println("Exception Caught: Returning back");
        									}
        									
        								}//abuse ends here

        							}//SuggestLight ends here
        							
        							else if (abo.equalsIgnoreCase("E")) {
        								String d="Raped";
        								String d1="Abused";
        								String d2 = "Murdered";
        								String d3 = "Kidnapped"	;
        								String d4="sad";
        								String d5="need motivation";
        								String d6="help";
        								String d7="Contact";
        								String d8="Solution";
        								
        								System.out.println("Starting up the TailorChat");
        								System.out.println("Hello "+ arrayboss[tree].getName()+" I am TailorChat , ready to assist you in your problem , tell me unless you choose to \"quit\"!");
        								String emp=input1.nextLine();
        								String bdm = emp.toLowerCase();
        		while (!bdm.equalsIgnoreCase("quit")) {
        			if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("rape")|| bdm.contains("molest")|| bdm.contains("forced"))) {
        		    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
        		    	 System.out.println("Visit CWFD or National Helpline Center for gender violence and also file a report to the police . Do not be afraid , truth wins");
        		    	 System.out.println("Contact of CWFD is 55123806");
        		    	 System.out.println("Contact of NHC is 01728-159779");
        		    	 System.out.println("Under penal code of 386 , the person trying against you shall be arrested and be trialed heavily , so don't be scared");
        		     }
        		      
        		     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("kidnap")|| bdm.contains("abducted")|| bdm.contains("missing"))) {
        		    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
        		    	 System.out.println("Visit the nearest Thana from your location and report to the police . Do not be afraid , we shall find the person");
        		    	 System.out.println("Make sure to keep your mobile on , in case an kidnapper gives a call");
        		    	 System.out.println("Contact of OPC is 55134526");
        		    	 System.out.println("Contact of Police OMF Headquarter is 01713-159745");
        		    	 System.out.println("Under penal code of 302 , the person trying against you shall be arrested, so don't be scared");
        		     }
        			
        		     else if (bdm.contains("thank you")|| bdm.contains("thanks")|| bdm.contains("amazing")||bdm.contains("helpful")) {
        		    	 System.out.println("I am glad I could help . Is there anything else you need me to do?");
        		     }
	
        		     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("murder")|| bdm.contains("kill")|| bdm.contains("mutilate"))) {
        		    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
        		    	 System.out.println("Do not panic and give an immediate call to the medical centre followed by local police");
        		    	 System.out.println("Make sure not to touch the murder weapon");
        		    	 System.out.println("Contact 999 if you are in immediate threat");
        		    	 System.out.println("Contact of Dhaka Medical College Legal unit is 89115675");
        		    	 System.out.println("Contact of Shahrawardy Medical College Legal Unit is 23345617");
        		    	 System.out.println("Contact of Police supervisor of Dhaka Division is 01778283855");
        		    	 System.out.println("Contact of OCM protection service and CID is 55134556");
        		    	 System.out.println("Under penal code of 319 , the person who commited the act shall be punished severely including sentence to death");
        		     }
        		        		
        		     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("abuse")|| bdm.contains("torture")|| bdm.contains("beat"))) {
        		    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
        		    	 System.out.println("Do not panic and give an immediate call to W.CAN Bangladesh , NHC for women and file a complaint");
        		    	 System.out.println("Do not inform anyone until they arrive");
        		    	 System.out.println("Contact of W.CAN Bangladesh is 86112345");
        		    	 System.out.println("Contact of NHC for Women Violence is 01728-159779");
        		    	 System.out.println("Contact of Police supervisor of Dhaka Division is 01778283855");
        		    	 System.out.println("Under penal code of 386 , the person who commited the act will be imprisoned for a certain time period");
        		     }
        		     else if (bdm.contains("rape") || emp.contains("raped") || bdm.contains("molested")|| bdm.contains("violated")||( bdm.contains("forcefully") && bdm.contains("rape"))) {
        						System.out.println("\n\nThis is such a terrible news to hear . Life is not always better because of cruel people");	
        						System.out.println("Dont worry I am here , tell me if you need anything for me to support you in this state.");
        		}
        		
        		else if (bdm.contains("abused")|| bdm.contains("groped")||bdm.contains("domestic violence")|| (bdm.contains("housewife") && bdm.contains("husband")&& bdm.contains("abusive")) ) {
        			System.out.println("\n\nBeing dominated in such a pathetic state is truly bad . Everyone has the right to live, violence creates inhuman acts.");
        			System.out.println("Dont worry "+arrayboss[tree].getName()+"I am here , if you need any help , tell me , I am listening.");
        			
        		}
        		
        		else if (bdm.contains("murder")|| bdm.contains("killed")||bdm.contains("passed away")|| (bdm.contains("beat") && bdm.contains("death"))|| bdm.contains("died") ) {
        			System.out.println("\n\nLoved ones passing away surely puts a lot of pain especially if it is in such a manner");
        			System.out.println("Justice has to be served no matter what , don't give up on the shadow for light is here");
        			System.out.println("Tell me how can I support you");
        		}
        		
        		else if (bdm.contains("missing")|| bdm.contains("kidnapped") || bdm.contains("kidnap") || bdm.contains("abducted")) {
        			System.out.println("\n\nTerrifying time indeed . I wonder where that person disappeared . Whoever abducted that person needs to be find soon");
        			System.out.println("Tell me how can I help you in finding the person?");
        		}
        		
        		else if (bdm.contains("sad")|| bdm.contains("crying")|| bdm.contains("cry") || bdm.contains("feeling lost")|| bdm.contains("depressed")||bdm.contains("teary")) {
        			System.out.println("\n\nI know the time is really hard but don't cry "+arrayboss[tree].getName()+" , you are brave , you will get passed it trust me.");
        			System.out.println("Life has so much more meaning , trouble has came , it shall fade and light shall come.");
        			System.out.println("Here I am , tell me how can I make you feel better?");
        		}
        		
     else if (bdm.contains("motivate")||bdm.contains("hope")||bdm.contains("feeling suicidal") || bdm.contains("suicidal")|| bdm.contains("motivation")) {
    	 System.out.println("\n\nWith every struggles , comes ease . With Every cloud comes its silver shining.");
    	 System.out.println("God does not burden a soul for more than it can take , Quran 2:286");
    	 System.out.println("Look above , the clouds are fading and the new horizon is coming up");
    	 System.out.println("Soon everything shall pass away and a new life will come");
     }
        		
     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("rape")|| bdm.contains("molest")|| bdm.contains("forced"))) {
    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
    	 System.out.println("Visit CWFD or National Helpline Center for gender violence and also file a report to the police . Do not be afraid , truth wins");
    	 System.out.println("Contact of CWFD is 55123806");
    	 System.out.println("Contact of NHC is 01728-159779");
    	 System.out.println("Under penal code of 386 , the person trying against you shall be arrested and be trialed heavily , so don't be scared");
     }
      
     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("kidnap")|| bdm.contains("abducted")|| bdm.contains("missing"))) {
    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
    	 System.out.println("Visit the nearest Thana from your location and report to the police . Do not be afraid , we shall find the person");
    	 System.out.println("Make sure to keep your mobile on , in case an kidnapper gives a call");
    	 System.out.println("Contact of OPC is 55134526");
    	 System.out.println("Contact of Police OMF Headquarter is 01713-159745");
    	 System.out.println("Under penal code of 302 , the person trying against you shall be arrested, so don't be scared");
     }
        		
     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("murder")|| bdm.contains("kill")|| bdm.contains("mutilate"))) {
    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
    	 System.out.println("Do not panic and give an immediate call to the medical centre followed by local police");
    	 System.out.println("Make sure not to touch the murder weapon");
    	 System.out.println("Contact 999 if you are in immediate threat");
    	 System.out.println("Contact of Dhaka Medical College Legal unit is 89115675");
    	 System.out.println("Contact of Shahrawardy Medical College Legal Unit is 23345617");
    	 System.out.println("Contact of Police supervisor of Dhaka Division is 01778283855");
    	 System.out.println("Contact of OCM protection service and CID is 55134556");
    	 System.out.println("Under penal code of 319 , the person who commited the act shall be punished severely including sentence to death");
     }
        		
     else if ((bdm.contains("solution")|| bdm.contains("help")|| bdm.contains("support") || bdm.contains("save me"))&&(bdm.contains("abuse")|| bdm.contains("torture")|| bdm.contains("beat"))) {
    	 System.out.println("\n\nThe best solution right now is to quickly take legal action.");
    	 System.out.println("Do not panic and give an immediate call to W.CAN Bangladesh , NHC for women and file a complaint");
    	 System.out.println("Do not inform anyone until they arrive");
    	 System.out.println("Contact of W.CAN Bangladesh is 86112345");
    	 System.out.println("Contact of NHC for Women Violence is 01728-159779");
    	 System.out.println("Contact of Police supervisor of Dhaka Division is 01778283855");
    	 System.out.println("Under penal code of 386 , the person who commited the act will be imprisoned for a certain time period");
     }
        		
        		bdm=input1.nextLine();
        		bdm=bdm.toLowerCase();
        	
        									
        								}//end of the chatbot
        		System.out.println("--------------------------------");
        								System.out.println("\nTake care dear , Tailorchat flew to the sky.");
       			
        							} //Tailorchat ends here
        							

        							}//End of panel user
        						
        						}
        					}
        					System.out.println("Password did not matched try again.");
        					
        				}
        					
        				}
        		

           }  //User system ends here
       		
       		//Admin system begins here
       		
       		if (a.equalsIgnoreCase("Admin")){
       			System.out.println("Enter the password code authorized for the admins:");
       			//The pass is selected to be 8321026
       			int counter=0;
       			for (int mk=1;mk>=1;mk++) {
       				if (mk==4) {
       					System.out.println("System compromised , breaking the system.");
       					break Main;
       				}
       				int bob;
           			bob=input1.nextInt();
           			if (bob==1) {
           				counter=1;
           				break;
           			}
           			else System.out.println("Wrong password"+" "+(3-mk)+" tries remaining");
       			}
       			
       			System.out.println("Password matched, login into the system....");
      				System.out.println("\n\n---------------------------------");
       			
       			admin:
       				for (int ml=1;ml>=1;ml++) {
       					if (counter>=1) {
       	       				
       	       				System.out.println("Welcome Admin to the panel, what would you like to do today?");
       	       				System.out.println("Press 1 to check all accounts");
       	       				System.out.println("Press 2 to change password of an account given ID.");
       	       				System.out.println("Press 3 to check a particular account.");
       	       				System.out.println("Press 4 to check statistics");
       	       				System.out.println("Press 5 to clear issue");
       	       				System.out.println("Press 0 to exit");
       	       				
       	       			System.out.println("\nAdmin panel working. Enter the number: ");//for now test work
       	       			
       	       			Labeler:
       	       			for (int top=0;top>=0;top++) {
       	       			int buttoner;
   	       				buttoner=input1.nextInt();     				
   	       				if (buttoner==0) {
   	       					break admin;
   	       				}
   	       				
   	       				else if (buttoner==1) { //we may include sort funcxtion here

   	       					for (int kamar = 0;kamar<counter2;kamar++) {
   	       					System.out.println("Name: " + arrayboss[kamar].getName());
    	                    System.out.println("Contact: " + arrayboss[kamar].getContact());
    	                    System.out.println("Location: " + arrayboss[kamar].getLocation());
    	                    System.out.println("Issue: " + arrayboss[kamar].getIssue());
    	                    System.out.println("Password: "+arrayboss[kamar].getPass());
    	                    System.out.println("Age: " + arrayboss[kamar].getAge() );
    	                    System.out.println("ID: " + arrayboss[kamar].getId() );
    	                    System.out.println("\n\n");	
   	       					}
   	       					
   	       					System.out.println("Press 8 to view the information in sorted name order");
   	       					System.out.println("Press 7 to view the information in sorted age order");
   	       					System.out.println("Press 0 to return");
   	       					
   	       					
   	       					int table;
   	       					table=input1.nextInt();
   	       					if (table==0) {
   	       						break Labeler;
   	       					}
   	       					
   	       					SORT:
   	       						for (int ilo=1;ilo>=1;ilo++) {
   	       							
   	       							Functionshuru sortinputer[] = new Functionshuru[5000];
   	       							for (int jobble=0;jobble<counter2;jobble++) {
   	       							sortinputer[jobble] = new Functionshuru(arrayboss[jobble].getName(),arrayboss[jobble].getContact(),arrayboss[jobble].getLocation(),arrayboss[jobble].getIssue(), arrayboss[jobble].getPass(),arrayboss[jobble].getAge(),arrayboss[jobble].getId());
   	       							}
   	       							
   	       							if (table==8) {
   	       								for (int jumer=0;jumer<counter2-1;jumer++) {
   	       								for (int kumer = jumer+1;kumer<counter2;kumer++) {
   	       									if (sortinputer[kumer].getName().compareToIgnoreCase(sortinputer[jumer].getName())<1) {
   	       										Functionshuru temp = new Functionshuru(sortinputer[jumer].getName(),sortinputer[jumer].getContact(),sortinputer[jumer].getLocation(),sortinputer[jumer].getIssue(), sortinputer[jumer].getPass(),sortinputer[jumer].getAge(),sortinputer[jumer].getId());
   	       										temp.setName(sortinputer[jumer].getName());
   	       										temp.setContact(sortinputer[jumer].getContact());
   	       										temp.setLocation(sortinputer[jumer].getLocation());
   	       										temp.setIssue(sortinputer[jumer].getIssue());
   	       										temp.setPass(sortinputer[jumer].getPass());
   	       										temp.setAge(sortinputer[jumer].getAge());
   	       										temp.setId(sortinputer[jumer].getId());
   	       										
   	       										sortinputer[jumer].setName(sortinputer[kumer].getName());
	       										sortinputer[jumer].setContact(sortinputer[kumer].getContact());
	       										sortinputer[jumer].setLocation(sortinputer[kumer].getLocation());
	       										sortinputer[jumer].setIssue(sortinputer[kumer].getIssue());
	       										sortinputer[jumer].setPass(sortinputer[kumer].getPass());
	       										sortinputer[jumer].setAge(sortinputer[kumer].getAge());
	       										sortinputer[jumer].setId(sortinputer[kumer].getId());
	       										
	       										sortinputer[kumer].setName(temp.getName());
	       										sortinputer[kumer].setContact(temp.getContact());
	       										sortinputer[kumer].setLocation(temp.getLocation());
	       										sortinputer[kumer].setIssue(temp.getIssue());
	       										sortinputer[kumer].setPass(temp.getPass());
	       										sortinputer[kumer].setAge(temp.getAge());
	       										sortinputer[kumer].setId(temp.getId());

   	       									}
   	       									
   	       								}
   	       									
   	       								
   	       							}
   	       								
   	       								for (int lop=0;lop<counter2;lop++) {
   	       								System.out.println("\n\nName: " + sortinputer[lop].getName());
   	       								System.out.println("Contact: " + sortinputer[lop].getContact());
   	       								System.out.println("Location: " + sortinputer[lop].getLocation());
   	       								System.out.println("Issue: " + sortinputer[lop].getIssue());
   	       								System.out.println("Password: "+sortinputer[lop].getPass());
   	       								System.out.println("Age: " + sortinputer[lop].getAge() );
   	       								System.out.println("ID: " + sortinputer[lop].getId() );
   	       								System.out.println("\n\n");	
   	       								}
   	       						
   	       							}
   	       							
   	       							if (table==7) {
	       								for (int jumer=0;jumer<counter2-1;jumer++) {
	       								for (int kumer = jumer+1;kumer<counter2;kumer++) {
	       									if (sortinputer[kumer].getAge()<sortinputer[jumer].getAge()) {
	       										Functionshuru temp = new Functionshuru(sortinputer[jumer].getName(),sortinputer[jumer].getContact(),sortinputer[jumer].getLocation(),sortinputer[jumer].getIssue(), sortinputer[jumer].getPass(),sortinputer[jumer].getAge(),sortinputer[jumer].getId());
	       										temp.setName(sortinputer[jumer].getName());
	       										temp.setContact(sortinputer[jumer].getContact());
	       										temp.setLocation(sortinputer[jumer].getLocation());
	       										temp.setIssue(sortinputer[jumer].getIssue());
	       										temp.setPass(sortinputer[jumer].getPass());
	       										temp.setAge(sortinputer[jumer].getAge());
	       										temp.setId(sortinputer[jumer].getId());
	       										
	       										sortinputer[jumer].setName(sortinputer[kumer].getName());
       										sortinputer[jumer].setContact(sortinputer[kumer].getContact());
       										sortinputer[jumer].setLocation(sortinputer[kumer].getLocation());
       										sortinputer[jumer].setIssue(sortinputer[kumer].getIssue());
       										sortinputer[jumer].setPass(sortinputer[kumer].getPass());
       										sortinputer[jumer].setAge(sortinputer[kumer].getAge());
       										sortinputer[jumer].setId(sortinputer[kumer].getId());
       										
       										sortinputer[kumer].setName(temp.getName());
       										sortinputer[kumer].setContact(temp.getContact());
       										sortinputer[kumer].setLocation(temp.getLocation());
       										sortinputer[kumer].setIssue(temp.getIssue());
       										sortinputer[kumer].setPass(temp.getPass());
       										sortinputer[kumer].setAge(temp.getAge());
       										sortinputer[kumer].setId(temp.getId());
	       										

	       									}
	       									
	       								}
	       									
	       								
	       							}
	       								
	       								for (int lop=0;lop<counter2;lop++) {
	       								System.out.println("Name: " + sortinputer[lop].getName());
	       								System.out.println("Contact: " + sortinputer[lop].getContact());
	       								System.out.println("Location: " + sortinputer[lop].getLocation());
	       								System.out.println("Issue: " + sortinputer[lop].getIssue());
	       								System.out.println("Password: "+sortinputer[lop].getPass());
	       								System.out.println("Age: " + sortinputer[lop].getAge() );
	       								System.out.println("ID: " + sortinputer[lop].getId() );
	       								System.out.println("\n\n");	
	       								}
	       				
	       							}
   	       							
   	       							int tubbol;
   	       							System.out.println("Press 0 to return");
   	       							tubbol=input1.nextInt();
   	       							if (tubbol==0)break Labeler;

   	       						}//sort ends here

   	       					System.out.println("Press 12 to return");
   	       					int back=input1.nextInt();
   	       					if (back==12) {
   	       					input1.nextLine();
   	       						break Labeler;
   	       					}
   	       					
   	       				}
   	       				
   	       				else if (buttoner==2) {
   	       					System.out.println("Enter the account ID whose password you want to change:");
   	       					int dmp = input1.nextInt();
   	       					for (int imp=0;imp<counter2;imp++) {
   	       						if (arrayboss[imp].getId()==dmp) {
   	       							System.out.println("Enter the new password for the account "+arrayboss[imp].getName());
   	       							input1.nextLine();
   	       							String dom = input1.nextLine();
   	       							arrayboss[imp].setPass(dom);
   	       							System.out.println("Password has been set");
   	       						}

   	       					}
   	       					
   	       				
    	                
   	       				FileWriter output1 = new FileWriter("output.txt");

    	                for (int m=0;m<counter2;m++) {
    	                	output1.write("Name: " + arrayboss[m].getName() + "\n");
    	                    output1.write("Contact: " + arrayboss[m].getContact() + "\n");
    	                    output1.write("Location: " + arrayboss[m].getLocation() + "\n");
    	                    output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
    	                    output1.write("Password: "+arrayboss[m].getPass()+"\n");
    	                    output1.write("Age: " + arrayboss[m].getAge() + "\n");
    	                    output1.write("ID: " + arrayboss[m].getId() + "\n");
    	                    output1.write("\n");

    	                }
    	                output1.close();
   	       					
   	       					System.out.println("Press 12 to return");
   	       					int button34;
      						button34=input1.nextInt();
      						if (button34==12) {
      							input1.nextLine();
      							break Labeler;
      						}
   	       			
   	       				}//button 2 ends here
   	       				
   	       				else if (buttoner==3) {
   	       					input1.nextLine();
   	       					System.out.println("Enter the name of the account: ");
   	       					String d1= input1.nextLine();
   	       					System.out.println("Enter the ID: ");
   	       					int m12 = input1.nextInt();
   	       					for (int kml = 0; kml<counter2;kml++) {
   	       						if (arrayboss[kml].getName().equalsIgnoreCase(d1) && arrayboss[kml].getId()==m12) {
   	       							System.out.println("\nInformation of the inputed client:");
   	       							System.out.println("Name: " + arrayboss[kml].getName());
   	       							System.out.println("Contact: " + arrayboss[kml].getContact());
   	       							System.out.println("Location: " + arrayboss[kml].getLocation());
   	       							System.out.println("Issue: " + arrayboss[kml].getIssue());
   	       							System.out.println("Password: "+arrayboss[kml].getPass());
   	       							System.out.println("Age: " + arrayboss[kml].getAge() );
   	       							System.out.println("ID: " + arrayboss[kml].getId() );
   	       							System.out.println("\n\n");	
   	       							
   	       						}
   	       					}
   	       					System.out.println("Press 12 to return");
   	       					int button35;
   	       					button35=input1.nextInt();
   	       					if (button35==12) {
   	       						input1.nextLine();
   	       						break Labeler;
   	       					}
   	       				}
   	       				
   	       				else if (buttoner==5) {
   	       					System.out.println("Which account do you want to clear?");
   	       					input1.nextLine();
	       					System.out.println("Enter the name of the account: ");
	       					String d12= input1.nextLine();
	       					System.out.println("Enter the ID: ");
	       					int m12 = input1.nextInt();
	       					
	       					for (int mop=0;mop<counter2;mop++) {
	       						if (arrayboss[mop].getName().equalsIgnoreCase(d12) && arrayboss[mop].getId()==m12) {
	       							System.out.println("The issue is cleared for that person.");
	       							arrayboss[mop].setIssue("NULL");
	       						}
	       					}
	       					
	       					
	    	                
	       					FileWriter output1 = new FileWriter("output.txt");

	    	                for (int m=0;m<counter2;m++) {
	    	                	output1.write("Name: " + arrayboss[m].getName() + "\n");
	    	                    output1.write("Contact: " + arrayboss[m].getContact() + "\n");
	    	                    output1.write("Location: " + arrayboss[m].getLocation() + "\n");
	    	                    output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
	    	                    output1.write("Password: "+arrayboss[m].getPass()+"\n");
	    	                    output1.write("Age: " + arrayboss[m].getAge() + "\n");
	    	                    output1.write("ID: " + arrayboss[m].getId() + "\n");
	    	                    output1.write("\n");

	    	                }
	    	                
	    	                output1.close();
	    	                
	    	                System.out.println("Press 12 to return");
   	       					int button35;
   	       					button35=input1.nextInt();
   	       					if (button35==12) {
   	       						input1.nextLine();
   	       						break Labeler;
   	       					}
	    	           	
   	       					
   	       				} //buttonner=5 ending
   	       				
   	       				//Massive part of admin program starts here---->
   	       				else if (buttoner==4) {
   	       					
   	       					System.out.println("\n\nPress 1 to check rape Statistics");
   	       					System.out.println("Press 2 to check kidnapping Statistics");
   	       					System.out.println("Press 3 to check Murder Statistics");
   	       					System.out.println("Press 4 to check Women Abuse Statistics");
   	       					
   	       					int tobener;
   	       				
   	       					
   	       					tobener=input1.nextInt();
   	       					if (tobener==1) {
   	       						
   	       						int measurer[] = new int[500];
   	       						int rapemeasure=0;
   	       						for (int mol=0;mol<counter2;mol++) {
   	       							if (arrayboss[mol].getIssue().equalsIgnoreCase("Rape")) {
   	       								
   	       								measurer[rapemeasure]=mol;
   	       								rapemeasure++;
   	       							}
   	       						}
   	       						
   	       						Rape r1[] = new Rape[rapemeasure];
   	       						
   	       						for (int tom=0;tom<rapemeasure;tom++) {
   	       							String name=arrayboss[measurer[tom]].getName();
   	       							String emergency="999";
   	       							int id=arrayboss[measurer[tom]].getId();
   	       							r1[tom]= new Rape(name,emergency,id);

   	       							
   	       						}
   	       						
   	       						System.out.println("Number of rape case detected is: "+rapemeasure);
   	       						
   	       						System.out.println("\n\nList of the people who reported:");
   	       						
   	       						for (int iom=0;iom<rapemeasure;iom++) {
   	       							System.out.println((iom+1)+") "+r1[iom].UserName);
   	       						}
   	       						
   	       						System.out.println("Press 1 to show solution for the people involved or 2 for details of account");
   	       						
   	       						
   	       						int dumper;
   	       						dumper=input1.nextInt();
   	       						
   	       						if (dumper==1) {
   	       							System.out.println("The services that they can communicate: ");
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
   	       						
   	       						else if (dumper==2) {
   	       						for (int moler=0;moler<counter2;moler++) {
   	       							if (arrayboss[moler].getIssue().equalsIgnoreCase("Rape")) {
   	       								
   	       							System.out.println("\nName: " + arrayboss[moler].getName());
   	       							System.out.println("Contact: " + arrayboss[moler].getContact());
   	       							System.out.println("Location: " + arrayboss[moler].getLocation());
   	       							System.out.println("Issue: " + arrayboss[moler].getIssue());
   	       							System.out.println("Password: "+arrayboss[moler].getPass());
   	       							System.out.println("Age: " + arrayboss[moler].getAge() );
   	       							System.out.println("ID: " + arrayboss[moler].getId() );
   	       							System.out.println("\n");	
   	       								
   	       								
   	       							}
   	       						}
   	       						
   	       						} //end of dumper
   	       						
   	       						System.out.println("Details of top criminals in the sector initiating:");
   	       						Rapistlist();
   	       						System.out.println("\n\n");
   	       						
   	       	//---------------------------------------------------------					
   	       					}//End of rape statistics
   	       					
   	       					
   	       					else if (tobener==2) {
   	       					int measurer[] = new int[500];
	       						int kidnapmeasure=0;
	       						for (int mol=0;mol<counter2;mol++) {
	       							if (arrayboss[mol].getIssue().equalsIgnoreCase("Kidnap")) {
	       								
	       								measurer[kidnapmeasure]=mol;
	       								kidnapmeasure++;
	       							}
	       						}
	       						
	       						Kidnap r1[] = new Kidnap[kidnapmeasure];
	       						
	       						for (int tom=0;tom<kidnapmeasure;tom++) {
	       							String name=arrayboss[measurer[tom]].getName();
	       							String emergency="999";
	       							int id=arrayboss[measurer[tom]].getId();
	       							r1[tom]= new Kidnap(name,emergency,id);

	       							
	       						}
	       						
	       						System.out.println("Number of Kidnap case detected is: "+kidnapmeasure);
	       						
	       						System.out.println("\n\nList of the people who reported:");
	       						
	       						for (int iom=0;iom<kidnapmeasure;iom++) {
	       							System.out.println((iom+1)+") "+r1[iom].UserName);
	       						}
	       						
   	       						System.out.println("Press 1 to show solution for the people involved or 2 for details of account");

	       						
	       						int dumper;
	       						dumper=input1.nextInt();
	       						if (dumper==1) {
	       							System.out.println("The services that they can communicate: ");
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
	       						
	       						else if (dumper==2) {
	       						for (int moler=0;moler<counter2;moler++) {
	       							if (arrayboss[moler].getIssue().equalsIgnoreCase("Kidnap")) {
	       								
	       							System.out.println("\nName: " + arrayboss[moler].getName());
	       							System.out.println("Contact: " + arrayboss[moler].getContact());
	       							System.out.println("Location: " + arrayboss[moler].getLocation());
	       							System.out.println("Issue: " + arrayboss[moler].getIssue());
	       							System.out.println("Password: "+arrayboss[moler].getPass());
	       							System.out.println("Age: " + arrayboss[moler].getAge() );
	       							System.out.println("ID: " + arrayboss[moler].getId() );
	       							System.out.println("\n");	
	       								
	       								
	       							}
	       						}
	       						
	
	       						} //end of dumper
	       						
	       						System.out.println("Details of top criminals in the sector initiating:");
	       						Kidnaplist();
	       						System.out.println("\n\n");

   	       					} //Kidnap ends here
   	       					

   	       					else if (tobener==3) {
   	       						
   	       					int measurer[] = new int[500];
       						int murdermeasure=0;
       						for (int mol=0;mol<counter2;mol++) {
       							if (arrayboss[mol].getIssue().equalsIgnoreCase("Murder")) {
       								
       								measurer[murdermeasure]=mol;
       								murdermeasure++;
       							}
       						}
       						
       						Murder r1[] = new Murder[murdermeasure];
       						
       						for (int tom=0;tom<murdermeasure;tom++) {
       							String name=arrayboss[measurer[tom]].getName();
       							String emergency="999";
       							int id=arrayboss[measurer[tom]].getId();
       							r1[tom]= new Murder(name,emergency,id);

       							
       						}
       						
       						System.out.println("Number of Murder case detected is: "+murdermeasure);
       						
       						System.out.println("\n\nList of the people who reported:");
       						
       						for (int iom=0;iom<murdermeasure;iom++) {
       							System.out.println((iom+1)+") "+r1[iom].UserName);
       						}
       						
       						System.out.println("Press 1 to show solution for the people involved or 2 for details of account");
       						
       						int dumper;
       						dumper=input1.nextInt();
       						
       						if (dumper==1) {
       							System.out.println("The services that they can communicate: ");
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
       						else if (dumper==2) {
       						for (int moler=0;moler<counter2;moler++) {
       							if (arrayboss[moler].getIssue().equalsIgnoreCase("Murder")) {
       								
       							System.out.println("\nName: " + arrayboss[moler].getName());
       							System.out.println("Contact: " + arrayboss[moler].getContact());
       							System.out.println("Location: " + arrayboss[moler].getLocation());
       							System.out.println("Issue: " + arrayboss[moler].getIssue());
       							System.out.println("Password: "+arrayboss[moler].getPass());
       							System.out.println("Age: " + arrayboss[moler].getAge() );
       							System.out.println("ID: " + arrayboss[moler].getId() );
       							System.out.println("\n");	
       								
       								
       							}
       						}
       						
     
       						} //end of dumper
       						
       						System.out.println("Details of top criminals in the sector initiating:");
       						Murderlist();
       						System.out.println("\n\n");
   	       						
 
   	       				//----------->Murder Statistics ends here
   	       						
   	       						
   	       					}
   	       					
   	       					
   	       					else if (tobener==4) {
   	       					int measurer[] = new int[500];
       						int abusemeasure=0;
       						for (int mol=0;mol<counter2;mol++) {
       							if (arrayboss[mol].getIssue().equalsIgnoreCase("abuse")) {
       								
       								measurer[abusemeasure]=mol;
       								abusemeasure++;
       							}
       						}
       						
       						WomenAbuse r1[] = new WomenAbuse[abusemeasure];
       						
       						for (int tom=0;tom<abusemeasure;tom++) {
       							String name=arrayboss[measurer[tom]].getName();
       							String emergency="999";
       							int id=arrayboss[measurer[tom]].getId();
       							r1[tom]= new WomenAbuse(name,emergency,id);

       							
       						}
       						
       						System.out.println("Number of Abuse case detected is: "+abusemeasure);
       						
       						System.out.println("\n\nList of the people who reported:");
       						
       						for (int iom=0;iom<abusemeasure;iom++) {
       							System.out.println((iom+1)+") "+r1[iom].UserName);
       						}
       						
       						System.out.println("Press 1 to show solution for the people involved or 2 for details of account");
       						
       						int dumper;
       						dumper=input1.nextInt();
       						
       						if (dumper==1) {
       							System.out.println("The services that they can communicate: ");
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
       						else if (dumper==2) {
       						for (int moler=0;moler<counter2;moler++) {
       							if (arrayboss[moler].getIssue().equalsIgnoreCase("abuse")) {
       								
       							System.out.println("\nName: " + arrayboss[moler].getName());
       							System.out.println("Contact: " + arrayboss[moler].getContact());
       							System.out.println("Location: " + arrayboss[moler].getLocation());
       							System.out.println("Issue: " + arrayboss[moler].getIssue());
       							System.out.println("Password: "+arrayboss[moler].getPass());
       							System.out.println("Age: " + arrayboss[moler].getAge() );
       							System.out.println("ID: " + arrayboss[moler].getId() );
       							System.out.println("\n");	
       								
       								
       							}
       						}
       						

       						} //end of dumper
       						
       						System.out.println("Details of top criminals in the sector initiating:");
       						Abuselist();
       						System.out.println("\n\n");
   	       						

   	       						//Abuse statistics ends here
   	       					}
  
   	       					
   	       					
   	       					//----------------------------------------------> ends here
   	       					
   	       					System.out.println("Press 0 to return");
   	       					int molep;
   	       					molep=input1.nextInt();
   	       					if (molep==0) {
   	       						input1.nextLine();
   	       						break Labeler;
   	       					}
   	       				}//statistics main panel ends here

       	       			}//Labeler ending

       	       				//Ending the counter admin panel
       	       				}

       				}
       			
       		}//End of admin
	
    				} //End of menu

        FileWriter output2 = new FileWriter("input.txt"); 
        
        for (int m=0;m<counter2;m++) {
        	output2.write("\n"+arrayboss[m].getName() + "\n");
            output2.write(arrayboss[m].getContact() + "\n");
            output2.write(arrayboss[m].getLocation() + "\n");
            output2.write(arrayboss[m].getIssue() + "\n");
            output2.write(arrayboss[m].getPass()+"\n");
           
            output2.write(Integer.toString(arrayboss[m].getAge()) + "\n");
            output2.write(Integer.toString(arrayboss[m].getId()));

        }
        
        output2.close();
 
        
//----------------entire project ends here--------------
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//this brace is of the new or existing part
		
		System.out.println("System ended successfully , JazakAllahu Khairan");
		
	}

}