
import java.util.*;


import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.*;
import java.net.http.*;
import java.util.*;

import javax.swing.*;
import javax.swing.text.*;


interface Finecalculator{
	double calculate();

	void displaysolution(String s);
	
}

class MakeCalls {
	//using tuilio
	  private static final String key = "32590174-69a3-4a8c-8c55-663fd53b2555";
	  private static final String secret = "TopI7uVbeki7K8BZX6xn5w==";
	  private static final String fromNumber = "+447520651290";
	  private static final String to = "+8801779892546";
	  private static final String locale = "en-US";
	  
	  public static void Worker() throws Exception {
		  var httpClient = HttpClient.newBuilder().build();

		    var payload = String.join("\n"
		      , "{"
		      , " \"method\": \"ttsCallout\","
		      , " \"ttsCallout\": {"
		      , "  \"cli\": \"" + fromNumber + "\","
		      , "  \"destination\": {"
		      , "   \"type\": \"number\","
		      , "   \"endpoint\": \"" + to + "\""
		      , "  },"
		      , "  \"locale\": \"" + locale + "\","
		      , "  \"text\": \"Hello, this is Project Savelight Assistant bot speaking , have an amazing day.\""
		      , " }"
		      , "}"
		    );

		    var host = "https://calling.api.sinch.com";
		    var pathname = "/calling/v1/callouts";
		    var request = HttpRequest.newBuilder()
		      .POST(HttpRequest.BodyPublishers.ofString(payload))
		      .uri(URI.create(host + pathname ))
		      .header("Content-Type", "application/json")
		      .header("Authorization", "Basic " + Base64.getEncoder().encodeToString((key + ":" + secret).getBytes()))
		      .build();

		    var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

		    System.out.println(response.body());
	  }
}


abstract class AdminPanelStatistics implements Finecalculator{
	
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
	
	


}


public class GUI {
	
	static int counter = 0; 
	static int counter2 = 0;
	static JFrame mainFrame = null; 
	public static Functionshuru[] arrayboss = new Functionshuru[500];
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
	
	public static void main(String[] args) {
		
		System.out.println("Files are getting read from the input file system");
		//File system created
		try {
			Scanner input1 = new Scanner(System.in);
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
				
			
            progressBar();
		}
		catch(Exception e) {
			System.err.println(e);
		}	
	}
	 private static void startProgressBar(JProgressBar progressBar, JFrame frame) {
	        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
	            @Override
	            protected Void doInBackground() throws Exception {
	                for (int progress = 0; progress <= 100; progress++) {
	                    publish(progress); // Publish the progress
	                    Thread.sleep(30); // Simulate some work
	                }
	                return null;
	            }

	            @Override
	            protected void process(java.util.List<Integer> chunks) {
	                for (int progress : chunks) {
	                    progressBar.setValue(progress); // Update the progress bar
	                }
	            }

	            @Override
	            protected void done() {
	                frame.dispose(); // Close the progress bar frame
	                first(); // Go to the first() method
	            }
	        };

	        worker.execute();
	    }
	
	public static void progressBar() {
		 JFrame frame = new JFrame("Progress Bar Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        frame.setSize(400, 400);
	        frame.setLayout(new FlowLayout());
	        frame.setLocationRelativeTo(null);
	        ImageIcon logo = new ImageIcon("SaveLight.PNG");
		    Image image = logo.getImage();
		    Image resizedImage = image.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
		    ImageIcon resizedLogo = new ImageIcon(resizedImage);
		    
		    
		    JLabel lbl = new JLabel();
		    lbl.setText("Project SaveLight is Loading...");
		    lbl.setIcon(resizedLogo);
		    lbl.setHorizontalTextPosition(JLabel.CENTER);
		    lbl.setVerticalTextPosition(JLabel.TOP);
		    lbl.setForeground(new Color(10, 10, 10));
		    lbl.setFont(new Font("MV Boli", Font.PLAIN, 24));
		    
		    JPanel mainPanel = new JPanel(new GridBagLayout());
		    mainPanel.setBackground(Color.WHITE);
		    GridBagConstraints gbc = new GridBagConstraints();
		    gbc.gridx = 0;
		    gbc.gridy = 0;
		    gbc.anchor = GridBagConstraints.CENTER;
		    mainPanel.add(lbl, gbc);
		    
		    
		    
		    
	        JProgressBar progressBar = new JProgressBar(0, 100);
	        progressBar.setPreferredSize(new Dimension(250, 30));

	        frame.add(progressBar); // Add the progress bar to the frame
	        frame.add(mainPanel, BorderLayout.CENTER);
	        // Start the progress bar automatically
	        startProgressBar(progressBar, frame);

	        frame.setVisible(true);
	}
	
	public static void first() {
		
		ImageIcon logo = new ImageIcon("SaveLight.PNG");
	    Image image = logo.getImage();
	    Image resizedImage = image.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
	    ImageIcon resizedLogo = new ImageIcon(resizedImage);
	    
	    
	    JLabel lbl = new JLabel();
	    lbl.setText("Welcome to Project SaveLight");
	    lbl.setIcon(resizedLogo);
	    lbl.setHorizontalTextPosition(JLabel.CENTER);
	    lbl.setVerticalTextPosition(JLabel.TOP);
	    lbl.setForeground(new Color(10, 10, 10));
	    lbl.setFont(new Font("MV Boli", Font.PLAIN, 24));

	    JPanel buttonPanel = new JPanel();
	    buttonPanel.setLayout(new FlowLayout());
	    buttonPanel.setBackground(Color.WHITE);

	    JButton runButton = new JButton("Run");
	    JButton quitButton = new JButton("Quit");

	    // ActionListener for the Run button
	    runButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            openNewFrame();
	            mainFrame.dispose(); // Close the main frame
	        }
	    });

	    // ActionListener for the Quit button
	    quitButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            System.exit(0);
	        }
	    });

	    buttonPanel.add(runButton);
	    buttonPanel.add(quitButton);

	    JPanel mainPanel = new JPanel(new GridBagLayout());
	    mainPanel.setBackground(Color.WHITE);
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.anchor = GridBagConstraints.CENTER;
	    mainPanel.add(lbl, gbc);

	    gbc.gridy = 1;
	    mainPanel.add(buttonPanel, gbc);


	    mainFrame = new JFrame();
	    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    mainFrame.setSize(750, 750);
	    mainFrame.setResizable(false);
	    mainFrame.getContentPane().setBackground(Color.WHITE);
	    mainFrame.setLayout(new BorderLayout());
	    mainFrame.add(mainPanel, BorderLayout.CENTER);
	    mainFrame.setLocationRelativeTo(null);
	    mainFrame.setVisible(true);
	}
	public static void openNewFrame() {
		 JFrame newFrame = new JFrame("New Frame");
	        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        newFrame.setSize(350, 125);
	        newFrame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new BorderLayout());

	        JLabel titleLabel = new JLabel("Choose login method");
	        titleLabel.setFont(new Font("MV Boli", Font.PLAIN, 24));
	        titleLabel.setHorizontalAlignment(JLabel.CENTER);

	        JPanel buttonPanel = new JPanel(new FlowLayout());
	        
	        JButton adminButton = new JButton("Admin");
	        JButton userButton = new JButton("User");

	        // Add ActionListener for Admin button
	        adminButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                openAdminLoginFrame();
	                newFrame.dispose(); // Close the current frame
	            }
	        });

	        // Add ActionListener for User button
	        userButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	openUserLoginFrame();
	                newFrame.dispose();
	            }
	        });

	        buttonPanel.add(adminButton);
	        buttonPanel.add(userButton);

	        panel.add(titleLabel, BorderLayout.NORTH);
	        panel.add(buttonPanel, BorderLayout.CENTER);

	        newFrame.getContentPane().add(panel);
	        newFrame.setVisible(true);
	}

	public static void openAdminLoginFrame() {
		 JFrame adminFrame = new JFrame("Admin Login");
	        adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        adminFrame.setSize(900, 550);
	        adminFrame.setLocationRelativeTo(null);
	        
	        // Create the left panel with the picture
	        JPanel picturePanel = new JPanel();
	        picturePanel.setBackground(Color.GREEN);
	        JLabel pictureLabel = new JLabel(new ImageIcon("admin.png")); // adding piture to the left frame
	        picturePanel.add(pictureLabel);

	        JPanel panel = new JPanel(new GridBagLayout());
	        panel.setBackground(Color.cyan);
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel passwordLabel = new JLabel("Password:");
	        JPasswordField passwordField = new JPasswordField(20);

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 0, 10, 0);
	        panel.add(passwordLabel, constraints);

	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        constraints.gridwidth = 2;
	        panel.add(passwordField, constraints);

	        JButton submitButton = new JButton("Submit");

	        constraints.gridx = 0;
	        constraints.gridy = 2;
	        constraints.gridwidth = 2;
	        panel.add(submitButton, constraints);

	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                char[] input = passwordField.getPassword();
	                String password = new String(input);

	                if (password.equals("1")) {
	                    openAdminPanelFrame(); // Open the admin panel frame
	                    adminFrame.dispose(); // Close the admin login frame
	                } else {
	                    JOptionPane.showMessageDialog(adminFrame, "Invalid password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, picturePanel, panel);
	        splitPane.setDividerLocation(0.5); // Set the divider location to achieve a 50/50 split

	        adminFrame.getContentPane().add(splitPane);
	        adminFrame.setVisible(true);
	}
	//////////
	static class BackgroundPanel extends JPanel {
        /**
		 * 
		 */
		private static final long serialVersionUID = 2544271309095163227L;
		private Image backgroundImage;

        public BackgroundPanel() {
            // Load the background image
            backgroundImage = new ImageIcon("bg.gif").getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the background image
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }

        @Override
        public Dimension getPreferredSize() {
            // Set the preferred size to match the size of the background image
            return new Dimension(backgroundImage.getWidth(this), backgroundImage.getHeight(this));
        }
    }
	/////////
	
	/////////
  

	/////////

	public static void openAdminPanelFrame() {
		
		JFrame adminPanelFrame = new JFrame("Admin Panel");
        adminPanelFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminPanelFrame.setSize(1020, 780);
        adminPanelFrame.setLocationRelativeTo(null);
        adminPanelFrame.setResizable(false);
 
        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        
        BackgroundPanel topPanel = new BackgroundPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.setPreferredSize(new Dimension(adminPanelFrame.getWidth(), 50));

        JPanel panel = new JPanel(new GridBagLayout()) {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Create a gradient paint for the background
                GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 250, 255), 0, getHeight(), new Color(230, 230, 230));

                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(gradient);
                g2d.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
            }
        };
        

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel welcomeLabel = new JLabel("Welcome Admin to the panel, what would you like to do today?");
        welcomeLabel.setForeground(Color.black);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(welcomeLabel, constraints);

        JButton button1 = new JButton("Check all accounts");
        JButton button2 = new JButton("Change password of an account given ID");
        JButton button3 = new JButton("Check a particular account");
        JButton button4 = new JButton("Check statistics");
        JButton button5 = new JButton("Clear issue");
        JButton button0 = new JButton("Exit");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(button1, constraints);

        constraints.gridy = 2;
        panel.add(button2, constraints);

        constraints.gridy = 3;
        panel.add(button3, constraints);

        constraints.gridy = 4;
        panel.add(button4, constraints);

        constraints.gridy = 5;
        panel.add(button5, constraints);

        constraints.gridy = 6;
        panel.add(button0, constraints);
        
        int availableHeight = adminPanelFrame.getHeight() - topPanel.getPreferredSize().height;
        int preferredHeight = (int) (availableHeight * 0.8); // 80% of the available height

        panel.setPreferredSize(new Dimension(panel.getPreferredSize().width, preferredHeight));
        
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);

        adminPanelFrame.getContentPane().add(mainPanel);

        adminPanelFrame.setVisible(true);

        // Button action listeners
        button1.addActionListener(e -> checkAllAccounts());
        button2.addActionListener(e -> changeAccountPassword());
        button3.addActionListener(e -> checkParticularAccount());
        button4.addActionListener(e -> checkStatistics());
        button5.addActionListener(e -> clearIssue());
        button0.addActionListener(e -> {
            adminPanelFrame.dispose(); // Close the current frame
            first(); // Go to the first() function
        });
	}
	
	
	private static void checkAllAccounts() {
		
//			System.out.println("Name: " + arrayboss[kamar].getName());
//            System.out.println("Contact: " + arrayboss[kamar].getContact());
//            System.out.println("Location: " + arrayboss[kamar].getLocation());
//            System.out.println("Issue: " + arrayboss[kamar].getIssue());
//            System.out.println("Password: "+arrayboss[kamar].getPass());
//            System.out.println("Age: " + arrayboss[kamar].getAge() );
//            System.out.println("ID: " + arrayboss[kamar].getId() );
//            System.out.println("\n\n");	

                // Display user info in a new frame
                JFrame userFrame = new JFrame("User Info");
                userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                userFrame.setSize(500, 300);
                userFrame.setLocationRelativeTo(null);

                JTextArea userInfoArea = new JTextArea();
                userInfoArea.setEditable(false);
                userInfoArea.setFont(new Font("Arial", Font.PLAIN, 14));

                // Build the user info string
                StringBuilder userInfoBuilder = new StringBuilder();
                for (int kamar =0; kamar<counter2; kamar++) {
                    userInfoBuilder.append("Name: ").append(arrayboss[kamar].getName()).append("\n");
                    userInfoBuilder.append("Contact: ").append(arrayboss[kamar].getContact()).append("\n");
                    userInfoBuilder.append("Location: ").append(arrayboss[kamar].getLocation()).append("\n");
                    userInfoBuilder.append("Issue: ").append(arrayboss[kamar].getIssue()).append("\n");
                    userInfoBuilder.append("Password: ").append(arrayboss[kamar].getPass()).append("\n");
                    userInfoBuilder.append("Age: ").append(arrayboss[kamar].getAge()).append("\n");
                    userInfoBuilder.append("ID: ").append(arrayboss[kamar].getId()).append("\n");
                    userInfoBuilder.append("--------------------\n");
                }

                userInfoArea.setText(userInfoBuilder.toString());

                JScrollPane scrollPane = new JScrollPane(userInfoArea);
                userFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
                
                JButton sortButton = new JButton("Sort by Age");
                sortButton.addActionListener(e -> sortByAge());
                 
                
                JButton backButton = new JButton("Back");
                backButton.addActionListener(e -> userFrame.dispose());

                userFrame.getContentPane().add(backButton, BorderLayout.SOUTH);
                userFrame.getContentPane().add(sortButton, BorderLayout.SOUTH);
                userFrame.setVisible(true);
		
					
			System.out.println("Press 8 to view the information in sorted name order");
			System.out.println("Press 7 to view the information in sorted age order");
			System.out.println("Press 0 to return");
		
	}
	
	public static void sortByAge() {
		Functionshuru sortinputer[] = new Functionshuru[5000];
		for (int jobble=0;jobble<counter2;jobble++) {
					sortinputer[jobble] = new Functionshuru(arrayboss[jobble].getName(),arrayboss[jobble].getContact(),arrayboss[jobble].getLocation(),arrayboss[jobble].getIssue(), arrayboss[jobble].getPass(),arrayboss[jobble].getAge(),arrayboss[jobble].getId());
					}
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
				
				JFrame userFrame = new JFrame("User Info");
                userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                userFrame.setSize(500, 300);
                userFrame.setLocationRelativeTo(null);

                JTextArea userInfoArea = new JTextArea();
                userInfoArea.setEditable(false);
                userInfoArea.setFont(new Font("Arial", Font.PLAIN, 14));

                // Build the user info string
                StringBuilder userInfoBuilder = new StringBuilder();
                for (int kamar =0; kamar<counter2; kamar++) {
                    userInfoBuilder.append("Name: ").append(sortinputer[kamar].getName()).append("\n");
                    userInfoBuilder.append("Contact: ").append(sortinputer[kamar].getContact()).append("\n");
                    userInfoBuilder.append("Location: ").append(sortinputer[kamar].getLocation()).append("\n");
                    userInfoBuilder.append("Issue: ").append(sortinputer[kamar].getIssue()).append("\n");
                    userInfoBuilder.append("Password: ").append(sortinputer[kamar].getPass()).append("\n");
                    userInfoBuilder.append("Age: ").append(sortinputer[kamar].getAge()).append("\n");
                    userInfoBuilder.append("ID: ").append(sortinputer[kamar].getId()).append("\n");
                    userInfoBuilder.append("--------------------\n");
                }

                userInfoArea.setText(userInfoBuilder.toString());

                JScrollPane scrollPane = new JScrollPane(userInfoArea);
                userFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
                
                JButton sortButton = new JButton("Sort by Age");
                sortButton.addActionListener(e -> sortByAge());
                 
                
                JButton backButton = new JButton("Back");
                backButton.addActionListener(e -> userFrame.dispose());

                userFrame.getContentPane().add(backButton, BorderLayout.SOUTH);
                userFrame.setVisible(true);
		
				
				
				
		}
	
	private static void changeAccountPassword() {
		 JFrame frame = new JFrame("Change Password");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel label = new JLabel("Enter the account ID whose password you want to change:");
	        JTextField idField = new JTextField(10);
	        JButton submitButton = new JButton("Submit");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(label, constraints);

	        constraints.gridy = 1;
	        panel.add(idField, constraints);

	        constraints.gridy = 2;
	        panel.add(submitButton, constraints);

	        frame.getContentPane().add(panel);
	        frame.setVisible(true);

	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int id = Integer.parseInt(idField.getText());
	                Functionshuru selectedUser = null;

	                for (int kamar = 0; kamar<counter2; kamar++) {
	                    if (arrayboss[kamar].getId() == id) {
	                        selectedUser = arrayboss[kamar];
	                        break;
	                    }
	                }

	                if (selectedUser != null) {
	                    frame.dispose();
	                    openNewPasswordFrame(selectedUser);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Account ID not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
    
	}
	
	public static void openNewPasswordFrame(Functionshuru user) {
		 JFrame frame = new JFrame("New Password");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel label = new JLabel("Enter the new password for the account: " + user.getName());
	        JPasswordField passwordField = new JPasswordField(20);
	        JButton submitButton = new JButton("Submit");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(label, constraints);

	        constraints.gridy = 1;
	        panel.add(passwordField, constraints);

	        constraints.gridy = 2;
	        panel.add(submitButton, constraints);

	        frame.getContentPane().add(panel);
	        frame.setVisible(true);
	        String newPass = "ABCD";
	        System.out.println(newPass);
	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	     	           user.setPass(newPass);
	     	           frame.dispose();
	     	           showSuccessFrame();
	     	        }

	        }) ;           
	        
	}
	
	public static void showSuccessFrame() {
        JFrame frame = new JFrame("Success");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Password changed successfully!");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(label, constraints);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        
        FileWriter output1;
		try {
			output1 = new FileWriter("output.txt");
		

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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	private static void checkParticularAccount() {
		 JFrame frame = new JFrame("Check Account");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.setSize(400, 200);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel label = new JLabel("Enter the account ID to check:");
	        JTextField idField = new JTextField(10);
	        JButton submitButton = new JButton("Submit");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(label, constraints);

	        constraints.gridy = 1;
	        panel.add(idField, constraints);

	        constraints.gridy = 2;
	        panel.add(submitButton, constraints);

	        frame.getContentPane().add(panel);
	        frame.setVisible(true);

	        submitButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int id = Integer.parseInt(idField.getText());
	                Functionshuru selectedUser = null;

	                for (int kamar = 0; kamar<counter2; kamar++) {
	                    if (arrayboss[kamar].getId() == id) {
	                        selectedUser = arrayboss[kamar];
	                        break;
	                    }
	                }

	                if (selectedUser != null) {
	                    frame.dispose();
	                    showAccountInfoFrame(selectedUser);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Account ID not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
	
	}
	
	public static void showAccountInfoFrame(Functionshuru user) {
		JFrame frame = new JFrame("Account Information");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Name: " + user.getName());
        JLabel contactLabel = new JLabel("Contact: " + user.getContact());
        JLabel locationLabel = new JLabel("Location: " + user.getLocation());
        JLabel issueLabel = new JLabel("Issue: " + user.getIssue());
        JLabel passwordLabel = new JLabel("Password: " + user.getPass());
        JLabel ageLabel = new JLabel("Age: " + user.getAge());
        JLabel idLabel = new JLabel("ID: " + user.getId());
        
        
//        JTextArea nameLabel = new JTextArea();
//        nameLabel.setText(user.getName());
//        JTextArea contactLabel = new JTextArea();
//        contactLabel.setText(user.getContact());
//        JTextArea locationLabel = new JTextArea();
//        locationLabel.setText(user.getLocation());
//        JTextArea issueLabel = new JTextArea();
//        issueLabel.setText(user.getIssue());
//        JTextArea name = new JTextArea();
//        name.setText(user.getPass());
//        JTextArea ageLabel = new JTextArea();
//        ageLabel.setText(String.valueOf(user.getAge()));
//        JTextArea idLabel = new JTextArea();
//        idLabel.setText(String.valueOf(user.getId()));

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10  , 10, 10, 10);
        panel.add(nameLabel, constraints);

        constraints.gridy = 1;
        panel.add(contactLabel, constraints);

        constraints.gridy = 2;
        panel.add(locationLabel, constraints);

        constraints.gridy = 3;
        panel.add(issueLabel, constraints);

        constraints.gridy = 4;
        panel.add(passwordLabel, constraints);

        constraints.gridy = 5;
        panel.add(ageLabel, constraints);

        constraints.gridy = 6;
        panel.add(idLabel, constraints);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
	}
	
	private static void clearIssue() {
		JFrame frame = new JFrame("Clear Issue");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Enter the name of the account:");
        JTextField nameField = new JTextField(10);
        JLabel idLabel = new JLabel("Enter the ID of the account:");
        JTextField idField = new JTextField(10);
        JButton submitButton = new JButton("Clear Issue");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(nameLabel, constraints);

        constraints.gridy = 1;
        panel.add(nameField, constraints);

        constraints.gridy = 2;
        panel.add(idLabel, constraints);

        constraints.gridy = 3;
        panel.add(idField, constraints);

        constraints.gridy = 4;
        panel.add(submitButton, constraints);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int id = Integer.parseInt(idField.getText());
                boolean issueCleared = false;

                for (int kamar = 0; kamar < counter2; kamar++) {
                    if (arrayboss[kamar].getName().equalsIgnoreCase(name) && arrayboss[kamar].getId() == id) {
                        issueCleared = true;
                        arrayboss[kamar].setIssue("NULL");
                        break;
                    }
                }

                if (issueCleared) {
                    try {
                        FileWriter output1 = new FileWriter("output.txt");

                        for (int m = 0; m < counter2; m++) {
                            output1.write("Name: " + arrayboss[m].getName() + "\n");
                            output1.write("Contact: " + arrayboss[m].getContact() + "\n");
                            output1.write("Location: " + arrayboss[m].getLocation() + "\n");
                            output1.write("Issue: " + arrayboss[m].getIssue() + "\n");
                            output1.write("Password: " + arrayboss[m].getPass() + "\n");
                            output1.write("Age: " + arrayboss[m].getAge() + "\n");
                            output1.write("ID: " + arrayboss[m].getId() + "\n");
                            output1.write("\n");
                        }

                        output1.close();

                        JOptionPane.showMessageDialog(null, "The issue is cleared for that person.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Account not found. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                frame.dispose();
                // Code to display the main menu or perform other desired actions
                // ...
            }
        });
	}

	 public static void checkStatistics() {
		 
		 
	        JFrame frame = new JFrame("Statistics");
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JButton rapeButton = new JButton("Check Rape Statistics");
	        JButton kidnappingButton = new JButton("Check Kidnapping Statistics");
	        JButton murderButton = new JButton("Check Murder Statistics");
	        JButton womenAbuseButton = new JButton("Check Women Abuse Statistics");
	        JButton backButton = new JButton("Back");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(rapeButton, constraints);

	        constraints.gridy = 1;
	        panel.add(kidnappingButton, constraints);

	        constraints.gridy = 2;
	        panel.add(murderButton, constraints);

	        constraints.gridy = 3;
	        panel.add(womenAbuseButton, constraints);

	        constraints.gridy = 4;
	        panel.add(backButton, constraints);

	        frame.getContentPane().add(panel);
	        frame.setVisible(true);

	        rapeButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	StringBuilder message = new StringBuilder();
        	        try {
        	            Scanner inputer = new Scanner(new File("Rapists.txt"));
        	            ArrayList<String> list = new ArrayList<>();
        	            while (inputer.hasNextLine()) {
        	                String name = inputer.nextLine();
        	                String obj = new String(name);
        	                list.add(obj);
        	            }
        	            inputer.close();

        	            // Convert list to array
        	            String[] rapists = list.toArray(new String[0]);

        	            message.append("List of known rapists:\n");
        	            for (String rapist : rapists) {
        	                message.append(rapist).append("\n");
        	            }
        	        } catch (FileNotFoundException ex) {
        	            ex.printStackTrace();
        	        }

        	        JOptionPane.showMessageDialog(null, message.toString(), "Rape Statistics", JOptionPane.INFORMATION_MESSAGE);
	                JFrame infoFrame = new JFrame("Contact Service");
	                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame.setSize(650, 650);
	                infoFrame.setLocationRelativeTo(null);

	                JPanel infoPanel = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints = new GridBagConstraints();
	                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea = new JTextArea();
	                JScrollPane scrollPane = new JScrollPane(infoArea);

	                try {
	                    Scanner inputer = new Scanner(new File("ContactService.txt"));
	                    StringBuilder infoMessage = new StringBuilder();
	                    infoMessage.append("The services that they can communicate:\n\n");

	                    while (inputer.hasNextLine()) {
	                        String namer = inputer.nextLine();
	                        String contacter = inputer.nextLine();
	                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                    }
	                    inputer.close();

	                    infoArea.setText(infoMessage.toString());
	                } catch (FileNotFoundException ex) {
	                    ex.printStackTrace();
	                }

	                infoConstraints.gridx = 0;
	                infoConstraints.gridy = 0;
	                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                infoPanel.add(scrollPane, infoConstraints);

	                infoFrame.getContentPane().add(infoPanel);
	                infoFrame.setVisible(true);
	                
	                
	                //hell no
	                
	                
	                JFrame infoFrame1 = new JFrame("Additional information");
	                infoFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame1.setSize(650, 650);
	                infoFrame1.setLocationRelativeTo(null);

	                JPanel infoPanel1 = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints1 = new GridBagConstraints();
	                infoConstraints1.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea1 = new JTextArea();
	                JScrollPane scrollPane1 = new JScrollPane(infoArea1);
	                
	                
	               
	                
	                
	                
	                int measurer[] = new int[500];
  						int rapemeasure=0;
  						for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Rape")) {
  								
  								measurer[rapemeasure]=mol;
  								rapemeasure++;
  							}
  						}
  							
  								AdminPanelStatistics.Rape r1[] = new AdminPanelStatistics.Rape[rapemeasure];
	       						
	       						for (int tom=0;tom<rapemeasure;tom++) {
	       							String name=arrayboss[measurer[tom]].getName();
	       							String emergency="999";
	       							int id=arrayboss[measurer[tom]].getId();
	       							r1[tom]= new AdminPanelStatistics.Rape(name,emergency,id);

	       							
	       						}
	       						
	       						
   	       						
   	       						
  							

	                
	                    
	                    StringBuilder infoMessage1 = new StringBuilder();
	                    infoMessage1.append("Number of rape cases detected: ").append(rapemeasure).append("\n");
	                    infoMessage1.append("\nList of the people who reported: \n");
	                    
	                    for (int iom=0;iom<rapemeasure;iom++) {
      							infoMessage1.append(r1[iom].UserName).append("\n");
      						}
	                    
	                    infoMessage1.append("\nAdditional details of the account reported: \n");
	                    infoMessage1.append("---------------------------------------------\n\n");

	                    
	                    for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Rape")) {
  								
  								infoMessage1.append("Name: ").append(arrayboss[mol].getName()).append("\n");
  								infoMessage1.append("Contact: ").append(arrayboss[mol].getContact()).append("\n");
  								infoMessage1.append("Location: ").append(arrayboss[mol].getLocation()).append("\n");
  								infoMessage1.append("Issue: ").append(arrayboss[mol].getIssue()).append("\n");
  								infoMessage1.append("Age: ").append(arrayboss[mol].getAge()).append("\n");
  								infoMessage1.append("ID: ").append(arrayboss[mol].getId()).append("\n\n");
  								
  							}
  						}
	                    
	                    

	                    
	                  

	                infoArea1.setText(infoMessage1.toString());
	               

	                infoConstraints1.gridx = 0;
	                infoConstraints1.gridy = 0;
	                infoConstraints1.insets = new Insets(10, 10, 10, 10);
	                infoPanel1.add(scrollPane1, infoConstraints1);

	                infoFrame1.getContentPane().add(infoPanel1);
	                infoFrame1.setVisible(true);
	                

	                
	                
	       //hell yeah         
	                
	                
	            }
	        });
  						
        	


          kidnappingButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        // Perform action when "Check Kidnapping Statistics" button is clicked
        	    	StringBuilder message = new StringBuilder();
        	        try {
        	            Scanner inputer = new Scanner(new File("Kidnappers.txt"));
        	            ArrayList<String> list = new ArrayList<>();
        	            while (inputer.hasNextLine()) {
        	                String name = inputer.nextLine();
        	                String obj = new String(name);
        	                list.add(obj);
        	            }
        	            inputer.close();

        	            // Convert list to array
        	            String[] rapists = list.toArray(new String[0]);

        	            message.append("List of known Kidnappers:\n");
        	            for (String rapist : rapists) {
        	                message.append(rapist).append("\n");
        	            }
        	        } catch (FileNotFoundException ex) {
        	            ex.printStackTrace();
        	        }

        	        JOptionPane.showMessageDialog(null, message.toString(), "Kidnapping Statistics", JOptionPane.INFORMATION_MESSAGE);
	                JFrame infoFrame = new JFrame("Contact Service");
	                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame.setSize(650, 650);
	                infoFrame.setLocationRelativeTo(null);

	                JPanel infoPanel = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints = new GridBagConstraints();
	                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea = new JTextArea();
	                JScrollPane scrollPane = new JScrollPane(infoArea);

	                try {
	                    Scanner inputer = new Scanner(new File("ContactKidnapMurder.txt"));
	                    StringBuilder infoMessage = new StringBuilder();
	                    infoMessage.append("The services that they can communicate:\n\n");

	                    while (inputer.hasNextLine()) {
	                        String namer = inputer.nextLine();
	                        String contacter = inputer.nextLine();
	                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                    }
	                    inputer.close();

	                    infoArea.setText(infoMessage.toString());
	                } catch (FileNotFoundException ex) {
	                    ex.printStackTrace();
	                }

	                infoConstraints.gridx = 0;
	                infoConstraints.gridy = 0;
	                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                infoPanel.add(scrollPane, infoConstraints);

	                infoFrame.getContentPane().add(infoPanel);
	                infoFrame.setVisible(true);
	                
	                JFrame infoFrame1 = new JFrame("Additional information");
	                infoFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame1.setSize(650, 650);
	                infoFrame1.setLocationRelativeTo(null);

	                JPanel infoPanel1 = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints1 = new GridBagConstraints();
	                infoConstraints1.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea1 = new JTextArea();
	                JScrollPane scrollPane1 = new JScrollPane(infoArea1);
	                

	                
	                
	                int measurer[] = new int[500];
  						int rapemeasure=0;
  						for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Kidnap")) {
  								
  								measurer[rapemeasure]=mol;
  								rapemeasure++;
  							}
  						}
  							
  								AdminPanelStatistics.Kidnap r1[] = new AdminPanelStatistics.Kidnap[rapemeasure];
	       						
	       						for (int tom=0;tom<rapemeasure;tom++) {
	       							String name=arrayboss[measurer[tom]].getName();
	       							String emergency="999";
	       							int id=arrayboss[measurer[tom]].getId();
	       							r1[tom]= new AdminPanelStatistics.Kidnap(name,emergency,id);

	       							
	       						}
	       						

	                    
	                    StringBuilder infoMessage1 = new StringBuilder();
	                    infoMessage1.append("Number of Kidnap cases detected: ").append(rapemeasure).append("\n");
	                    infoMessage1.append("\nList of the people who reported: \n");
	                    
	                    for (int iom=0;iom<rapemeasure;iom++) {
      							infoMessage1.append(r1[iom].UserName).append("\n");
      						}
	                    
	                    infoMessage1.append("\nAdditional details of the account reported: \n");
	                    infoMessage1.append("---------------------------------------------\n\n");

	                    
	                    for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Kidnap")) {
  								
  								infoMessage1.append("Name: ").append(arrayboss[mol].getName()).append("\n");
  								infoMessage1.append("Contact: ").append(arrayboss[mol].getContact()).append("\n");
  								infoMessage1.append("Location: ").append(arrayboss[mol].getLocation()).append("\n");
  								infoMessage1.append("Issue: ").append(arrayboss[mol].getIssue()).append("\n");
  								infoMessage1.append("Age: ").append(arrayboss[mol].getAge()).append("\n");
  								infoMessage1.append("ID: ").append(arrayboss[mol].getId()).append("\n\n");
  								
  							}
  						}
	                    
	                    

	                    
	                  

	                infoArea1.setText(infoMessage1.toString());
	               

	                infoConstraints1.gridx = 0;
	                infoConstraints1.gridy = 0;
	                infoConstraints1.insets = new Insets(10, 10, 10, 10);
	                infoPanel1.add(scrollPane1, infoConstraints1);

	                infoFrame1.getContentPane().add(infoPanel1);
	                infoFrame1.setVisible(true);
	                

	                
        	    }
        	});


          murderButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        // Perform action when "Check Murder Statistics" button is clicked
        	    	StringBuilder message = new StringBuilder();
        	        try {
        	            Scanner inputer = new Scanner(new File("Murderers.txt"));
        	            ArrayList<String> list = new ArrayList<>();
        	            while (inputer.hasNextLine()) {
        	                String name = inputer.nextLine();
        	                String obj = new String(name);
        	                list.add(obj);
        	            }
        	            inputer.close();

        	            // Convert list to array
        	            String[] rapists = list.toArray(new String[0]);

        	            message.append("List of known murders:\n");
        	            for (String rapist : rapists) {
        	                message.append(rapist).append("\n");
        	            }
        	        } catch (FileNotFoundException ex) {
        	            ex.printStackTrace();
        	        }

        	        JOptionPane.showMessageDialog(null, message.toString(), "Murder Statistics", JOptionPane.INFORMATION_MESSAGE);
	                JFrame infoFrame = new JFrame("Contact Service");
	                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame.setSize(650, 650);
	                infoFrame.setLocationRelativeTo(null);

	                JPanel infoPanel = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints = new GridBagConstraints();
	                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea = new JTextArea();
	                JScrollPane scrollPane = new JScrollPane(infoArea);

	                try {
	                    Scanner inputer = new Scanner(new File("ContactKidnapMurder.txt"));
	                    StringBuilder infoMessage = new StringBuilder();
	                    infoMessage.append("The services that they can communicate:\n\n");

	                    while (inputer.hasNextLine()) {
	                        String namer = inputer.nextLine();
	                        String contacter = inputer.nextLine();
	                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                    }
	                    inputer.close();

	                    infoArea.setText(infoMessage.toString());
	                } catch (FileNotFoundException ex) {
	                    ex.printStackTrace();
	                }

	                infoConstraints.gridx = 0;
	                infoConstraints.gridy = 0;
	                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                infoPanel.add(scrollPane, infoConstraints);

	                infoFrame.getContentPane().add(infoPanel);
	                infoFrame.setVisible(true);
	                
	                //-------------------------
	                JFrame infoFrame1 = new JFrame("Additional information");
	                infoFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame1.setSize(700, 700);
	                infoFrame1.setLocationRelativeTo(null);

	                JPanel infoPanel1 = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints1 = new GridBagConstraints();
	                infoConstraints1.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea1 = new JTextArea();
	                JScrollPane scrollPane1 = new JScrollPane(infoArea1);
	                

	                
	                
	                int measurer[] = new int[500];
  						int rapemeasure=0;
  						for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Murder")) {
  								
  								measurer[rapemeasure]=mol;
  								rapemeasure++;
  							}
  						}
  							
  								AdminPanelStatistics.Murder r1[] = new AdminPanelStatistics.Murder[rapemeasure];
	       						
	       						for (int tom=0;tom<rapemeasure;tom++) {
	       							String name=arrayboss[measurer[tom]].getName();
	       							String emergency="999";
	       							int id=arrayboss[measurer[tom]].getId();
	       							r1[tom]= new AdminPanelStatistics.Murder(name,emergency,id);

	       							
	       						}
	       						

	                    
	                    StringBuilder infoMessage1 = new StringBuilder();
	                    infoMessage1.append("Number of Murder cases detected: ").append(rapemeasure).append("\n");
	                    infoMessage1.append("\nList of the people who reported: \n");
	                    
	                    for (int iom=0;iom<rapemeasure;iom++) {
      							infoMessage1.append(r1[iom].UserName).append("\n");
      						}
	                    
	                    infoMessage1.append("\nAdditional details of the account reported: \n");
	                    infoMessage1.append("---------------------------------------------\n\n");

	                    
	                    for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Murder")) {
  								
  								infoMessage1.append("Name: ").append(arrayboss[mol].getName()).append("\n");
  								infoMessage1.append("Contact: ").append(arrayboss[mol].getContact()).append("\n");
  								infoMessage1.append("Location: ").append(arrayboss[mol].getLocation()).append("\n");
  								infoMessage1.append("Issue: ").append(arrayboss[mol].getIssue()).append("\n");
  								infoMessage1.append("Age: ").append(arrayboss[mol].getAge()).append("\n");
  								infoMessage1.append("ID: ").append(arrayboss[mol].getId()).append("\n\n");
  								
  							}
  						}
	                    if (rapemeasure==0) {
	                    	infoMessage1.append("No such informations found.");
	                    }
	                    
	                    

	                    
	                  

	                infoArea1.setText(infoMessage1.toString());
	               

	                infoConstraints1.gridx = 0;
	                infoConstraints1.gridy = 0;
	                infoConstraints1.insets = new Insets(10, 10, 10, 10);
	                infoPanel1.add(scrollPane1, infoConstraints1);

	                infoFrame1.getContentPane().add(infoPanel1);
	                infoFrame1.setVisible(true);
	                
	                
	                

	                
        	    }
        	});

        	womenAbuseButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        // Perform action when "Check Women Abuse Statistics" button is clicked
        	    	StringBuilder message = new StringBuilder();
        	        try {
        	            Scanner inputer = new Scanner(new File("WomenAbuse.txt"));
        	            ArrayList<String> list = new ArrayList<>();
        	            while (inputer.hasNextLine()) {
        	                String name = inputer.nextLine();
        	                String obj = new String(name);
        	                list.add(obj);
        	            }
        	            inputer.close();

        	            // Convert list to array
        	            String[] rapists = list.toArray(new String[0]);

        	            message.append("List of known Abusers:\n");
        	            for (String rapist : rapists) {
        	                message.append(rapist).append("\n");
        	            }
        	        } catch (FileNotFoundException ex) {
        	            ex.printStackTrace();
        	        }

        	        JOptionPane.showMessageDialog(null, message.toString(), "Abuse Statistics", JOptionPane.INFORMATION_MESSAGE);
	                JFrame infoFrame = new JFrame("Contact Service");
	                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame.setSize(650, 650);
	                infoFrame.setLocationRelativeTo(null);

	                JPanel infoPanel = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints = new GridBagConstraints();
	                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea = new JTextArea();
	                JScrollPane scrollPane = new JScrollPane(infoArea);

	                try {
	                    Scanner inputer = new Scanner(new File("ContactService.txt"));
	                    StringBuilder infoMessage = new StringBuilder();
	                    infoMessage.append("The services that they can communicate:\n\n");

	                    while (inputer.hasNextLine()) {
	                        String namer = inputer.nextLine();
	                        String contacter = inputer.nextLine();
	                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                    }
	                    inputer.close();

	                    infoArea.setText(infoMessage.toString());
	                } catch (FileNotFoundException ex) {
	                    ex.printStackTrace();
	                }

	                infoConstraints.gridx = 0;
	                infoConstraints.gridy = 0;
	                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                infoPanel.add(scrollPane, infoConstraints);

	                infoFrame.getContentPane().add(infoPanel);
	                infoFrame.setVisible(true);
	                
	                JFrame infoFrame1 = new JFrame("Additional information");
	                infoFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                infoFrame1.setSize(600, 600);
	                infoFrame1.setLocationRelativeTo(null);

	                JPanel infoPanel1 = new JPanel(new GridBagLayout());
	                GridBagConstraints infoConstraints1 = new GridBagConstraints();
	                infoConstraints1.fill = GridBagConstraints.HORIZONTAL;

	                JTextArea infoArea1 = new JTextArea();
	                JScrollPane scrollPane1 = new JScrollPane(infoArea1);
	                

	                
	                
	                int measurer[] = new int[500];
  						int rapemeasure=0;
  						for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Abuse")) {
  								
  								measurer[rapemeasure]=mol;
  								rapemeasure++;
  							}
  						}
  							
  								AdminPanelStatistics.WomenAbuse r1[] = new AdminPanelStatistics.WomenAbuse[rapemeasure];
	       						
	       						for (int tom=0;tom<rapemeasure;tom++) {
	       							String name=arrayboss[measurer[tom]].getName();
	       							String emergency="999";
	       							int id=arrayboss[measurer[tom]].getId();
	       							r1[tom]= new AdminPanelStatistics.WomenAbuse(name,emergency,id);

	       							
	       						}
	       						

	                    
	                    StringBuilder infoMessage1 = new StringBuilder();
	                    infoMessage1.append("Number of Abuse cases detected: ").append(rapemeasure).append("\n");
	                    infoMessage1.append("\nList of the people who reported: \n");
	                    
	                    for (int iom=0;iom<rapemeasure;iom++) {
      							infoMessage1.append(r1[iom].UserName).append("\n");
      						}
	                    
	                    infoMessage1.append("\nAdditional details of the account reported: \n");
	                    infoMessage1.append("---------------------------------------------\n\n");
	                    
	                    for (int mol=0;mol<counter2;mol++) {
  							if (arrayboss[mol].getIssue().equalsIgnoreCase("Abuse")) {
  								
  								infoMessage1.append("Name: ").append(arrayboss[mol].getName()).append("\n");
  								infoMessage1.append("Contact: ").append(arrayboss[mol].getContact()).append("\n");
  								infoMessage1.append("Location: ").append(arrayboss[mol].getLocation()).append("\n");
  								infoMessage1.append("Issue: ").append(arrayboss[mol].getIssue()).append("\n");
  								infoMessage1.append("Age: ").append(arrayboss[mol].getAge()).append("\n");
  								infoMessage1.append("ID: ").append(arrayboss[mol].getId()).append("\n\n");
  								
  							}
  						}
	                    
	                    

	                    
	                  

	                infoArea1.setText(infoMessage1.toString());
	               

	                infoConstraints1.gridx = 0;
	                infoConstraints1.gridy = 0;
	                infoConstraints1.insets = new Insets(10, 10, 10, 10);
	                infoPanel1.add(scrollPane1, infoConstraints1);

	                infoFrame1.getContentPane().add(infoPanel1);
	                infoFrame1.setVisible(true);
	                
	                

	                
	                
	                
        	    }
        	});

        	backButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        // Perform action when "Back" button is clicked
        	        frame.dispose();
        	        // Code to return to the admin panel or perform other desired actions
        	        // ...
        	    }
        	});
    }

	public static void openUserLoginFrame() {
		JFrame loginFrame = new JFrame("User Login");
    	loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	loginFrame.setSize(750, 400);
    	loginFrame.setLocationRelativeTo(null);
    	
    	
    	// Create the left panel with the picture
    	JPanel picturePanel = new JPanel();
        ImageIcon leftIcon = new ImageIcon("user.png");
   	    Image image = leftIcon.getImage();
   	    Image resizedImage = image.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
   	    ImageIcon resizedLogo = new ImageIcon(resizedImage); // adding picture to the left frame
   	    JLabel pictureLabel = new JLabel(resizedLogo);
        picturePanel.add(pictureLabel);

    	JPanel panel = new JPanel(new GridBagLayout());
    	GridBagConstraints constraints = new GridBagConstraints();
    	constraints.fill = GridBagConstraints.HORIZONTAL;

    	JButton oldUserButton = new JButton("Login as Existing User");
    	JButton newUserButton = new JButton("Sign up as New User");

    	constraints.gridx = 0;
    	constraints.gridy = 0;
    	constraints.gridwidth = 2;
    	constraints.insets = new Insets(10, 10, 10, 10);
    	panel.add(oldUserButton, constraints);

    	constraints.gridy = 1;
    	panel.add(newUserButton, constraints);

    	loginFrame.getContentPane().add(panel);
    	loginFrame.setVisible(true);

    	// Button action listeners
    	oldUserButton.addActionListener(e -> {
    		oldUser();
    		loginFrame.dispose(); // Dispose of the login frame
    	});

    	newUserButton.addActionListener(e -> {
    		newUser();
    	    loginFrame.dispose(); // Dispose of the login frame
    	});
    	
    	 JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, picturePanel, panel);
    	    splitPane.setDividerLocation(0.5); // Set the divider location to achieve a 50/50 split

        loginFrame.getContentPane().add(splitPane);
        loginFrame.setVisible(true);
    }
	
	
	//new user skipping for now
	public static void newUser() {
		JFrame frame = new JFrame();
        frame.setTitle("Input Form");
        frame.setSize(750, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame
        frame.setLocationRelativeTo(null);
        
        JPanel picturePanel = new JPanel();
        ImageIcon leftIcon = new ImageIcon("newUser.png");
	    Image image = leftIcon.getImage();
	    Image resizedImage = image.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
	    ImageIcon resizedLogo = new ImageIcon(resizedImage); // adding picture to the left frame
	    JLabel pictureLabel = new JLabel(resizedLogo);
        picturePanel.add(pictureLabel);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(8, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(20);

        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField(20);

        JLabel issueLabel = new JLabel("Issue:");
        JTextField issueField = new JTextField(20);

        JLabel locationLabel = new JLabel("Location:");
        JTextField locationField = new JTextField(20);
        
        JLabel contactLabel = new JLabel("Contact:");
        JTextField contactField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(20);

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(passLabel);
        mainPanel.add(passField);
        mainPanel.add(idLabel);
        mainPanel.add(idField);
        mainPanel.add(issueLabel);
        mainPanel.add(issueField);
        mainPanel.add(locationLabel);
        mainPanel.add(locationField);
        mainPanel.add(contactLabel);
        mainPanel.add(contactField);
        mainPanel.add(ageLabel);
        mainPanel.add(ageField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passField.getPassword());
                String id = idField.getText();
                String issue = issueField.getText();
                String location = locationField.getText();
                String contact = contactField.getText();
                String ager = ageField.getText();
                
                int ID = Integer.parseInt(id);
                int age = Integer.parseInt(ager);
                
                arrayboss[counter2] = new Functionshuru(name,contact,location,issue,password,age,ID);
                counter2++;
                

                try {
                	
                	FileWriter output1 = new FileWriter("output.txt");

	                for (int kamar = 0; kamar < counter2; kamar++) {
	                    output1.write("Name: " + arrayboss[kamar].getName() + "\n");
	                    output1.write("Contact: " + arrayboss[kamar].getContact() + "\n");
	                    output1.write("Location: " + arrayboss[kamar].getLocation() + "\n");
	                    output1.write("Issue: " + arrayboss[kamar].getIssue() + "\n");
	                    output1.write("Password: " + arrayboss[kamar].getPass() + "\n");
	                    output1.write("Age: " + arrayboss[kamar].getAge() + "\n");
	                    output1.write("ID: " + arrayboss[kamar].getId() + "\n");
	                    output1.write("\n");
	                }

	                output1.close();

                    
                    JOptionPane.showMessageDialog(frame, "Data saved successfully.");
                    frame.dispose(); // Close the current frame

                    openUserLoginFrame();
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Error saving data.");
                }
            }
        });

        mainPanel.add(submitButton);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, picturePanel, mainPanel);
        splitPane.setDividerLocation(0.5); // Set the divider location to achieve a 50/50 split

        frame.getContentPane().add(splitPane);
        frame.setVisible(true);
    }
	
	public static void oldUser() {
   	 JFrame userFrame = new JFrame("User Login");
        userFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        userFrame.setSize(750, 400);
        userFrame.setLocationRelativeTo(null);

        
        
        JPanel picturePanel = new JPanel();
        ImageIcon leftIcon = new ImageIcon("oldUser.png");
	    Image image = leftIcon.getImage();
	    Image resizedImage = image.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
	    ImageIcon resizedLogo = new ImageIcon(resizedImage); // adding picture to the left frame
	    JLabel pictureLabel = new JLabel(resizedLogo);
        picturePanel.add(pictureLabel);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel idLabel = new JLabel("User ID:");
        JTextField idField = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 0, 10, 0);
        panel.add(idLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(idField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(passwordLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        panel.add(passwordField, constraints);

        JButton submitButton = new JButton("Submit");

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(submitButton, constraints);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = idField.getText();
                int ID = Integer.parseInt(userId);
                char[] input = passwordField.getPassword();
                String password = new String(input);
                

                // Check if the user ID and password match
                if (checkUserCredentials(ID, password)) {
                    openUserPanelFrame(ID); // Open the user panel frame
                    userFrame.dispose(); // Close the user login frame
                } else {
                    JOptionPane.showMessageDialog(userFrame, "Invalid user ID or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, picturePanel, panel);
        splitPane.setDividerLocation(0.5); // Set the divider location to achieve a 50/50 split

        userFrame.getContentPane().add(splitPane);
        userFrame.setVisible(true);
   }
	
	
	private static boolean checkUserCredentials(int ID, String password) {
       

            for (int kamar=0;kamar<counter2;kamar++) {
                if (arrayboss[kamar].getId()==ID && arrayboss[kamar].getPass().equals(password)) {
                    return true; // User ID and password match
                }
            }
       

        return false; // User ID and password do not match
    }
    
    

    
    
    
//    BackgroundPanel panel1 = new BackgroundPanel();
//    
//    panel1.setLocation(100, 100);
//    userPanelFrame.add(panel1);
    
    
	 public static void openUserPanelFrame(int ID) {
		 	int m=0;
		 
		 	for (int kamar=0;kamar<counter2;kamar++) {
		 		if (arrayboss[kamar].getId()==ID) {
		 			m=kamar;
		 		}
		 	}
	    	
	        JFrame userPanelFrame = new JFrame("user Panel");
	        userPanelFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        userPanelFrame.setSize(1020, 780);
	        userPanelFrame.setLocationRelativeTo(null);
	        
	        JPanel mainPanel = new JPanel(new BorderLayout());
	        
	     // Top Panel
	        BackgroundPanel topPanel = new BackgroundPanel();
	        topPanel.setBackground(Color.WHITE);
	        topPanel.setPreferredSize(new Dimension(userPanelFrame.getWidth(), 50));
	        
	        
//	        // Bottom Panel
//	        BackgroundPanel bottomPanel = new BackgroundPanel();
//	        bottomPanel.setBackground(Color.WHITE);
//	        bottomPanel.setPreferredSize(new Dimension(userPanelFrame.getWidth(), 50));
	        
	        JPanel panel = new JPanel(new GridBagLayout()) {
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);

	                // Create a gradient paint for the background
	                GradientPaint gradient = new GradientPaint(0, 0, new Color(	245,245,245), 0, getHeight(), new Color(207, 204, 204));

	                Graphics2D g2d = (Graphics2D) g;
	                g2d.setPaint(gradient);
	                g2d.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
	            }
	        };
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel welcomeLabel = new JLabel("Welcome to the panel "+arrayboss[m].getName()+ ", what would you like to do today?");
	        welcomeLabel.setForeground(Color.black);
	        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(welcomeLabel, constraints);

	        JButton buttonA = new JButton("Lodge a new complaint");
	        JButton buttonB = new JButton("Withdraw complaint");
	        JButton buttonD = new JButton("Activate SuggestLight");
	        JButton buttonE = new JButton("Chat with TailorWinder");
	        JButton buttonF = new JButton("Make a Call");
	        JButton button0 = new JButton("Exit");

	        constraints.gridx = 0;
	        constraints.gridy = 1;
	        constraints.gridwidth = 2;
	        panel.add(buttonA, constraints);

	        constraints.gridy = 2;
	        panel.add(buttonB, constraints);

	        constraints.gridy = 4;
	        panel.add(buttonD, constraints);

	        constraints.gridy = 5;
	        panel.add(buttonE, constraints);
	        
	        constraints.gridy = 6;
	        panel.add(buttonF, constraints);

	        constraints.gridy = 7;
	        panel.add(button0, constraints);
	        
	        mainPanel.add(topPanel, BorderLayout.NORTH);
	        mainPanel.add(panel, BorderLayout.CENTER);
//	        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
	        
	        int availableHeight = userPanelFrame.getHeight() - topPanel.getPreferredSize().height;
	        int preferredHeight = (int) (availableHeight * 0.8); // 80% of the available height

	        panel.setPreferredSize(new Dimension(panel.getPreferredSize().width, preferredHeight));

	        userPanelFrame.getContentPane().add(mainPanel);
	        userPanelFrame.setVisible(true);
	     
			
	        

	        // Button action listeners
	        buttonA.addActionListener(e -> lodgeNewComplaint(ID));
	        buttonB.addActionListener(e -> withdrawComplaint(ID));
	        buttonD.addActionListener(e -> activateSuggestLight(ID));
	        buttonE.addActionListener(e -> chatWithTailorWinder());
	        buttonF.addActionListener(e -> {
				try {
					makeACall();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
	       button0.addActionListener(e ->{
	    	   userPanelFrame.dispose(); // Close the current frame
	            first(); // Go to the first() function
	        });
	      
	    }
	 public static void makeACall() throws Exception {
		 JFrame frame = new JFrame();
	        frame.setTitle("Connection Status");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the current frame

	        	JOptionPane.showMessageDialog(frame, "Dialup Connection established successfully. Connection proceeding..");
	        			MakeCalls.Worker();
	                    frame.dispose(); // Close the current frame
	                    
	                    

	         
	 }
	 
	 public static void lodgeNewComplaint(int k) {
		 	
	        JFrame complaintFrame = new JFrame("Lodge New Complaint");
	        complaintFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        complaintFrame.setSize(400, 300);
	        complaintFrame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel complaintLabel = new JLabel("Enter the new complaint:");
	        JTextField complaintField = new JTextField(20);
	        JButton lodgeButton = new JButton("Lodge Complaint");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(complaintLabel, constraints);

	        constraints.gridy = 1;
	        panel.add(complaintField, constraints);

	        constraints.gridy = 2;
	        panel.add(lodgeButton, constraints);

	        complaintFrame.getContentPane().add(panel);
	        complaintFrame.setVisible(true);

	        lodgeButton.addActionListener(e -> {
	        	int index=0;
			 	
			 	for (int kamar=0;kamar<2;kamar++) {
			 		if (arrayboss[kamar].getId()==k) {
			 			index=kamar;
			 			break;
			 		}
			 	}
	            String complaint = complaintField.getText();
	            arrayboss[index].setIssue(complaint);
	            System.out.println("The issue has been lodged successfully");

	            try {
	                FileWriter output1 = new FileWriter("output.txt");

	                for (int kamar = 0; kamar < counter2; kamar++) {
	                    output1.write("Name: " + arrayboss[kamar].getName() + "\n");
	                    output1.write("Contact: " + arrayboss[kamar].getContact() + "\n");
	                    output1.write("Location: " + arrayboss[kamar].getLocation() + "\n");
	                    output1.write("Issue: " + arrayboss[kamar].getIssue() + "\n");
	                    output1.write("Password: " + arrayboss[kamar].getPass() + "\n");
	                    output1.write("Age: " + arrayboss[kamar].getAge() + "\n");
	                    output1.write("ID: " + arrayboss[kamar].getId() + "\n");
	                    output1.write("\n");
	                }

	                output1.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }

	            complaintFrame.dispose(); // Dispose of the complaint frame
	        });
	    }
	 
	 public static void withdrawComplaint(int k) {
		 	
	        JFrame withdrawFrame = new JFrame("Withdraw Complaint");
	        withdrawFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        withdrawFrame.setSize(400, 200);
	        withdrawFrame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        JLabel confirmLabel = new JLabel("Are you sure you want to withdraw the complaint?");
	        JButton yesButton = new JButton("Yes");
	        JButton noButton = new JButton("No");

	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        panel.add(confirmLabel, constraints);

	        constraints.gridy = 1;
	        panel.add(yesButton, constraints);

	        constraints.gridx = 1;
	        panel.add(noButton, constraints);

	        withdrawFrame.getContentPane().add(panel);
	        withdrawFrame.setVisible(true);
	        
	        

	        yesButton.addActionListener(e -> {
	        	int m=0;
	        	for (int kamar=0;kamar<counter2;kamar++) {
		        	if (arrayboss[kamar].getId()==k) {
		        		m=kamar;
		        	}
		        }
	        	
	            arrayboss[m].setIssue("none");
	            

	            try {
	                FileWriter output1 = new FileWriter("output.txt");

	                for (int mol = 0; mol < counter2; mol++) {
	                    output1.write("Name: " + arrayboss[mol].getName() + "\n");
	                    output1.write("Contact: " + arrayboss[mol].getContact() + "\n");
	                    output1.write("Location: " + arrayboss[mol].getLocation() + "\n");
	                    output1.write("Issue: " + arrayboss[mol].getIssue() + "\n");
	                    output1.write("Password: " + arrayboss[mol].getPass() + "\n");
	                    output1.write("Age: " + arrayboss[mol].getAge() + "\n");
	                    output1.write("ID: " + arrayboss[mol].getId() + "\n");
	                    output1.write("\n");
	                }

	                output1.close();
	                JOptionPane.showMessageDialog(null, "The complaint has been withdrawn successfully.");
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }

	            withdrawFrame.dispose(); // Dispose of the withdraw frame
	        });

	        noButton.addActionListener(e -> withdrawFrame.dispose()); // Dispose of the withdraw frame

	        noButton.setVisible(true); // Set the "No" button visible
	    }
	
	 public static void activateSuggestLight(int ID) {
		 int tree=0;
	        for(int kamar = 0; kamar<counter2; kamar++) {
	        	if(arrayboss[kamar].getId() == ID) {
	        		tree = kamar;
	        	}
	        }
	        
	       
	        System.out.println("SuggestLight Activated for "+arrayboss[tree].getName());
	                								if (arrayboss[tree].getIssue().equalsIgnoreCase("Rape")) {
	                									AdminPanelStatistics.Rape r1 = new AdminPanelStatistics.Rape(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
	                									
	                									JFrame JFF = new JFrame("Suggest Light Activated");
	                									JFF.setSize(300,300);
	                									JPanel JPp = new JPanel();
	                									JPp.setLayout(new GridLayout(6, 2));
	                									
	                									
	                									JLabel j1 = new JLabel("Everything will get healed out!!");
	                									JLabel j2 = new JLabel("---------------------------------");
	                									JLabel j3 = new JLabel("\n\nPenal code for the crime: "+AdminPanelStatistics.Rape.Law);
	                									JLabel j4 = new JLabel("Punishment for the crime: "+r1.toString());
	                									
	                									JButton JBb = new JButton("OK");
	                									JPp.add(j1);
	                									JPp.add(j2);
	                									JPp.add(j3);
	                									JPp.add(j4);
	                									JPp.add(JBb);
	                									
	                									JFF.add(JPp);
	                									
	                									JFF.setVisible(true);
	                									
	                									JBb.addActionListener(new ActionListener() {
                								            public void actionPerformed(ActionEvent e) {
                								            	JFF.dispose();
                								            }
	                									});
	                									
	                									JFrame JF = new JFrame("Question");
	                									JF.setSize(500,500);
	                									JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									
	                									JPanel JP = new JPanel();
	                									JP.setLayout(new GridLayout(6, 2));
	                									JLabel jj = new JLabel("How are you related to the person? Wife or Else?");
	                									JTextField jj1 = new JTextField(20);
	                									JButton JB = new JButton("Submit");
	                									JP.add(jj);
	                									JP.add(jj1);
	                									JP.add(JB);
	                									
	                									JF.add(JP);
	                									JF.setVisible(true);
	                									
	                									
	                									JB.addActionListener(new ActionListener() {
	                								            public void actionPerformed(ActionEvent e) {
	                								               String text  = jj1.getText();
	                								               StringBuilder userInfoBuilder = new StringBuilder();
	                								               if(text.equalsIgnoreCase("Wife")) {
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); 
	                								            	   
	                								            	   JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("You would receive compensation for the abuse \nand your partner shall be expiled in jail for 2-3 YEARS");
	                									                userInfoBuilder.append("\nAccording to Penal Code Section 376 , \nthe punishment could be from 2 YEARS \nto 10 YEARS in jail.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               

		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);
		                								                
		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               else {
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                								            	   
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                
	                									               
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("The person who raped you will be sent for a term of 10 Yrs in Jail");
	                									                userInfoBuilder.append("\nAccording to Penal Code Section 376 , the punishment could be from 2 YEARS to 10 YEARS in jail.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               StringBuilder message = new StringBuilder();
	                								                JFrame infoFrame = new JFrame("Contact Service");
	                								                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                								                infoFrame.setSize(650, 650);
	                								                infoFrame.setLocationRelativeTo(null);

	                								                JPanel infoPanel = new JPanel(new GridBagLayout());
	                								                GridBagConstraints infoConstraints = new GridBagConstraints();
	                								                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                								                JTextArea infoArea = new JTextArea();
	                								                JScrollPane scrollPane = new JScrollPane(infoArea);

	                								                try {
	                								                    Scanner inputer = new Scanner(new File("ContactService.txt"));
	                								                    StringBuilder infoMessage = new StringBuilder();
	                								                    infoMessage.append("The services that they can communicate:\n\n");

	                								                    while (inputer.hasNextLine()) {
	                								                        String namer = inputer.nextLine();
	                								                        String contacter = inputer.nextLine();
	                								                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                								                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                								                    }
	                								                    inputer.close();

	                								                    infoArea.setText(infoMessage.toString());
	                								                } catch (FileNotFoundException ex) {
	                								                    ex.printStackTrace();
	                								                }

	                								                infoConstraints.gridx = 0;
	                								                infoConstraints.gridy = 0;
	                								                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                								                infoPanel.add(scrollPane, infoConstraints);

	                								                infoFrame.getContentPane().add(infoPanel);
	                								                infoFrame.setVisible(true);
	                								            }
	                								     });
	                									
//	                									
//	                									
//	                									
//	                									
//	                									
	                								}
	                								
	                								//Rape ends here
////	                								
	                								else if (arrayboss[tree].getIssue().equalsIgnoreCase("Kidnap")) {
	                									AdminPanelStatistics.Kidnap r1 = new AdminPanelStatistics.Kidnap(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
	                									System.out.println("Everything will get healed out!!");
	                									System.out.println("---------------------------------");
	                									System.out.println("\n\nPenal code for the crime: "+AdminPanelStatistics.Kidnap.Law);
	                									System.out.println("Punishment for the crime: "+r1.toString());
	                									
	                									JFrame JFF = new JFrame("Suggest Light Activated");
	                									JFF.setSize(300,300);
	                									JPanel JPp = new JPanel();
	                									JPp.setLayout(new GridLayout(6, 2));
	                									
	                									
	                									JLabel j1 = new JLabel("Everything will get healed out!!");
	                									JLabel j2 = new JLabel("---------------------------------");
	                									JLabel j3 = new JLabel("\n\nPenal code for the crime: "+AdminPanelStatistics.Kidnap.Law);
	                									JLabel j4 = new JLabel("Punishment for the crime: "+r1.toString());
	                									
	                									JButton JBb = new JButton("OK");
	                									JPp.add(j1);
	                									JPp.add(j2);
	                									JPp.add(j3);
	                									JPp.add(j4);
	                									JPp.add(JBb);
	                									
	                									JFF.add(JPp);
	                									
	                									JFF.setVisible(true);
	                									
	                									JBb.addActionListener(new ActionListener() {
                								            public void actionPerformed(ActionEvent e) {
                								            	JFF.dispose();
                								            }
	                									});
	                									
	                									JFrame JF = new JFrame("Question");
	                									JF.setSize(500,500);
	                									JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									
	                									JPanel JP = new JPanel();
	                									JP.setLayout(new GridLayout(6, 2));
	                									JLabel jj = new JLabel("Is the person a minor or not?");
	                									JTextField jj1 = new JTextField(20);
	                									JButton JB = new JButton("Submit");
	                									JP.add(jj);
	                									JP.add(jj1);
	                									JP.add(JB);
	                									
	                									JF.add(JP);
	                									JF.setVisible(true);
	                									
	                									
	                									JB.addActionListener(new ActionListener() {
	                								            public void actionPerformed(ActionEvent e) {
	                								               String text  = jj1.getText();
	                								               StringBuilder userInfoBuilder = new StringBuilder();
	                								               if(text.equalsIgnoreCase("Minor")){
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Minor has been Kidnapped. Severe punishment of 10 years and amount of 120000 taka as fine.");
	                									                userInfoBuilder.append("\nThe Punishment according to the penal code 75B is from 3 to 7 YRS in prison and a fine as well.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 50;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               else {
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Punishment ranging from 3 to 7 yrs and may include fine.");
	                									                userInfoBuilder.append("\nThe Punishment according to the penal code 75B is from 3 to 7 YRS in prison and a fine as well.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 50;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               StringBuilder message = new StringBuilder();
	                								                JFrame infoFrame = new JFrame("Contact Service");
	                								                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                								                infoFrame.setSize(650, 650);
	                								                infoFrame.setLocationRelativeTo(null);

	                								                JPanel infoPanel = new JPanel(new GridBagLayout());
	                								                GridBagConstraints infoConstraints = new GridBagConstraints();
	                								                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                								                JTextArea infoArea = new JTextArea();
	                								                JScrollPane scrollPane = new JScrollPane(infoArea);

	                								                try {
	                								                    Scanner inputer = new Scanner(new File("ContactKidnapMurder.txt"));
	                								                    StringBuilder infoMessage = new StringBuilder();
	                								                    infoMessage.append("The services that they can communicate:\n\n");

	                								                    while (inputer.hasNextLine()) {
	                								                        String namer = inputer.nextLine();
	                								                        String contacter = inputer.nextLine();
	                								                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                								                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                								                    }
	                								                    inputer.close();

	                								                    infoArea.setText(infoMessage.toString());
	                								                } catch (FileNotFoundException ex) {
	                								                    ex.printStackTrace();
	                								                }

	                								                
	                								                
	                								                infoConstraints.gridx = 0;
	                								                infoConstraints.gridy = 0;
	                								                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                								                infoPanel.add(scrollPane, infoConstraints);

	                								                infoFrame.getContentPane().add(infoPanel);
	                								                infoFrame.setVisible(true);
	                								            }
	                								     });
	                									
//	                									
//	                									
//	                									
	                									
	                									
	                								}
//	                								else{
//	                									
//	                								}//Kidnap ends here
//	                								
	                								else if (arrayboss[tree].getIssue().equalsIgnoreCase("Murder")) {
	                									
	                									AdminPanelStatistics.Kidnap r1 = new AdminPanelStatistics.Kidnap(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
	                									System.out.println("Everything will get healed out!!");
	                									System.out.println("---------------------------------");
	                									System.out.println("\n\nPenal code for the crime: "+AdminPanelStatistics.Kidnap.Law);
	                									System.out.println("Punishment for the crime: "+r1.toString());
	                									
	                									JFrame JFF = new JFrame("Suggest Light Activated");
	                									JFF.setSize(300,300);
	                									JPanel JPp = new JPanel();
	                									JPp.setLayout(new GridLayout(6, 2));
	                									
	                									
	                									JLabel j1 = new JLabel("Everything will get healed out!!");
	                									JLabel j2 = new JLabel("---------------------------------");
	                									JLabel j3 = new JLabel("\n\nPenal code for the crime: "+AdminPanelStatistics.Murder.law);
	                									JLabel j4 = new JLabel("Punishment for the crime: "+r1.toString());
	                									
	                									JButton JBb = new JButton("OK");
	                									JPp.add(j1);
	                									JPp.add(j2);
	                									JPp.add(j3);
	                									JPp.add(j4);
	                									JPp.add(JBb);
	                									
	                									JFF.add(JPp);
	                									
	                									JFF.setVisible(true);
	                									
	                									JBb.addActionListener(new ActionListener() {
                								            public void actionPerformed(ActionEvent e) {
                								            	JFF.dispose();
                								            }
	                									});
	                									
	                									JFrame JF = new JFrame("Question");
	                									JF.setSize(500,500);
	                									JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									
	                									JPanel JP = new JPanel();
	                									JP.setLayout(new GridLayout(6, 2));
	                									JLabel jj = new JLabel("Is it a minor or not?");
	                									JTextField jj1 = new JTextField(20);
	                									JButton JB = new JButton("Submit");
	                									JP.add(jj);
	                									JP.add(jj1);
	                									JP.add(JB);
	                									
	                									JF.add(JP);
	                									JF.setVisible(true);
	                									
	                									
	                									JB.addActionListener(new ActionListener() {
	                								            public void actionPerformed(ActionEvent e) {
	                								               String text  = jj1.getText();
	                								               StringBuilder userInfoBuilder = new StringBuilder();
	                								               if(text.equalsIgnoreCase("Minor")){
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Minor has been Kidnapped. Severe punishment of 10 years and amount of 120000 taka as fine.");
	                									                userInfoBuilder.append("\nThe Punishment according to the penal code 75B is from 3 to 7 YRS in prison and a fine as well.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               else {
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Punishment ranging from 3 to 7 yrs and may include fine");
	                									                userInfoBuilder.append("\nThe Punishment according to the penal code 75B is from 3 to 7 YRS in prison and a fine as well.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               

	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);
		                								                
		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               StringBuilder message = new StringBuilder();
	                								                JFrame infoFrame = new JFrame("Contact Service");
	                								                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                								                infoFrame.setSize(650, 650);
	                								                infoFrame.setLocationRelativeTo(null);

	                								                JPanel infoPanel = new JPanel(new GridBagLayout());
	                								                GridBagConstraints infoConstraints = new GridBagConstraints();
	                								                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                								                JTextArea infoArea = new JTextArea();
	                								                JScrollPane scrollPane = new JScrollPane(infoArea);

	                								                try {
	                								                    Scanner inputer = new Scanner(new File("ContactKidnapMurder.txt"));
	                								                    StringBuilder infoMessage = new StringBuilder();
	                								                    infoMessage.append("The services that they can communicate:\n\n");

	                								                    while (inputer.hasNextLine()) {
	                								                        String namer = inputer.nextLine();
	                								                        String contacter = inputer.nextLine();
	                								                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                								                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                								                    }
	                								                    inputer.close();

	                								                    infoArea.setText(infoMessage.toString());
	                								                } catch (FileNotFoundException ex) {
	                								                    ex.printStackTrace();
	                								                }

	                								                infoConstraints.gridx = 0;
	                								                infoConstraints.gridy = 0;
	                								                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                								                infoPanel.add(scrollPane, infoConstraints);

	                								                infoFrame.getContentPane().add(infoPanel);
	                								                infoFrame.setVisible(true);
	                								            }
	                								     });
	                									
	                									

	                									
	                									
	                									
	                									
	                								}//Murder ends here
//	                								
//	                								
	                								else if (arrayboss[tree].getIssue().equalsIgnoreCase("abuse")) {
	                									AdminPanelStatistics.WomenAbuse r1 = new AdminPanelStatistics.WomenAbuse(arrayboss[tree].getName(),"999",arrayboss[tree].getId());
	                									System.out.println("Everything will get healed out!!");
	                									System.out.println("---------------------------------");
	                									System.out.println("\n\nPenal code for the crime: "+AdminPanelStatistics.WomenAbuse.law);
	                									System.out.println("Punishment for the crime: "+r1.toString());
	                									
	                									JFrame JFF = new JFrame("Suggest Light Activated");
	                									JFF.setSize(300,300);
	                									JPanel JPp = new JPanel();
	                									JPp.setLayout(new GridLayout(6, 2));
	                									
	                									
	                									JLabel j1 = new JLabel("Everything will get healed out!!");
	                									JLabel j2 = new JLabel("---------------------------------");
	                									JLabel j3 = new JLabel("\n\nPenal code for the crime: "+AdminPanelStatistics.WomenAbuse.law);
	                									JLabel j4 = new JLabel("Punishment for the crime: "+r1.toString());
	                									
	                									JButton JBb = new JButton("OK");
	                									JPp.add(j1);
	                									JPp.add(j2);
	                									JPp.add(j3);
	                									JPp.add(j4);
	                									JPp.add(JBb);
	                									
	                									JFF.add(JPp);
	                									
	                									JFF.setVisible(true);
	                									
	                									JBb.addActionListener(new ActionListener() {
                								            public void actionPerformed(ActionEvent e) {
                								            	JFF.dispose();
                								            }
	                									});
	                									
	                									JFrame JF = new JFrame("Question");
	                									JF.setSize(500,500);
	                									JF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									
	                									JPanel JP = new JPanel();
	                									JP.setLayout(new GridLayout(6, 2));
	                									JLabel jj = new JLabel("Is it a severe molestation or not?");
	                									JTextField jj1 = new JTextField(20);
	                									JButton JB = new JButton("Submit");
	                									JP.add(jj);
	                									JP.add(jj1);
	                									JP.add(JB);
	                									
	                									JF.add(JP);
	                									JF.setVisible(true);
	                									
	                									
	                									JB.addActionListener(new ActionListener() {
	                								            public void actionPerformed(ActionEvent e) {
	                								               String text  = jj1.getText();
	                								               StringBuilder userInfoBuilder = new StringBuilder();
	                								               if(text.equalsIgnoreCase("Molestation")){
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("The punishment includes providing FINE and 1-2 YRS in prison.");
	                									                userInfoBuilder.append("According to Section 11AB , punishment will be from 6 months to 1 yr in prison for the partner.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               else if(text.equalsIgnoreCase("Dowry")){
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Prisonment of the partner followed by Fine of 80,000 taka.");
	                									                userInfoBuilder.append("Apply for Section 213 , punishment will be from 1 yrs to 3 yrs.");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               

	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);
		                								                
		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               else {
	                								            	   JFrame infoFrame12 = new JFrame("Solution"); JLabel JLL = new JLabel("Solution");
	                									                infoFrame12.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                									                infoFrame12.setSize(650, 650);
	                									                infoFrame12.setLocationRelativeTo(null);

	                									                JPanel infoPanel12 = new JPanel(new GridBagLayout());
	                									                GridBagConstraints infoConstraints12 = new GridBagConstraints();
	                									                infoConstraints12.fill = GridBagConstraints.HORIZONTAL;

//	                									                JLabel jjL = new JLabel("LAW INFORMATION");
//	                									                jjL.setSize(200,200);
//	                									                jjL.setHorizontalTextPosition(200);
//	                									                jjL.setVerticalTextPosition(200);
	                									                JTextArea infoArea12 = new JTextArea();
	                									                JScrollPane scrollPane12 = new JScrollPane(infoArea12);
	                									                userInfoBuilder.append("Unfortunately you cannot get compensation at the moment. You would receive amount sued upon the severity.");
	                									                userInfoBuilder.append("\nThe punishment according to Penal Code 225 for the crime includes from 10 years to LIFETIME IMPRISONMENT and also DEATH BY HANGING");
	                									                infoArea12.setText(userInfoBuilder.toString());
	 	                								               
	                									                
	                									                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 0;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(JLL);

		                								                infoConstraints12.gridx = 0;
		                								                infoConstraints12.gridy = 50;
		                								                infoConstraints12.insets = new Insets(10, 10, 10, 10);
//		                								                infoPanel12.add(jjL);
		                								                infoPanel12.add(scrollPane12, infoConstraints12);

		                								                infoFrame12.getContentPane().add(infoPanel12);
		                								                infoFrame12.setVisible(true);
	                								               }
	                								               StringBuilder message = new StringBuilder();
	                								                JFrame infoFrame = new JFrame("Contact Service");
	                								                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                								                infoFrame.setSize(650, 650);
	                								                infoFrame.setLocationRelativeTo(null);

	                								                JPanel infoPanel = new JPanel(new GridBagLayout());
	                								                GridBagConstraints infoConstraints = new GridBagConstraints();
	                								                infoConstraints.fill = GridBagConstraints.HORIZONTAL;

	                								                JTextArea infoArea = new JTextArea();
	                								                JScrollPane scrollPane = new JScrollPane(infoArea);

	                								                try {
	                								                    Scanner inputer = new Scanner(new File("ContactService.txt"));
	                								                    StringBuilder infoMessage = new StringBuilder();
	                								                    infoMessage.append("The services that they can communicate:\n\n");

	                								                    while (inputer.hasNextLine()) {
	                								                        String namer = inputer.nextLine();
	                								                        String contacter = inputer.nextLine();
	                								                        infoMessage.append("Organisation: ").append(namer).append("\n");
	                								                        infoMessage.append("Contact: ").append(contacter).append("\n\n");
	                								                    }
	                								                    inputer.close();

	                								                    infoArea.setText(infoMessage.toString());
	                								                } catch (FileNotFoundException ex) {
	                								                    ex.printStackTrace();
	                								                }

	                								                infoConstraints.gridx = 0;
	                								                infoConstraints.gridy = 0;
	                								                infoConstraints.insets = new Insets(10, 10, 10, 10);
	                								                infoPanel.add(scrollPane, infoConstraints);

	                								                infoFrame.getContentPane().add(infoPanel);
	                								                infoFrame.setVisible(true);
	                								            }
	                								     });
	                									
//	                									
//
//	                									
//	                									
//	                									
	                								}//abuse ends here
//	        if (user.getIssue().equalsIgnoreCase("rape")) {
//	            // Open a new frame and display "Hello" message
//	            JFrame frame = new JFrame("SuggestLight");
//	            JLabel label = new JLabel("Hello");
//	            frame.getContentPane().add(label);
//	            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//	            frame.setSize(200, 100);
//	            frame.setLocationRelativeTo(null);
//	            frame.setVisible(true);
////	        } else {
////	            // Open a new frame and display "No" message
////	            JFrame frame = new JFrame("SuggestLight");
////	            JLabel label = new JLabel("No");
////	            frame.getContentPane().add(label);
////	            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
////	            frame.setSize(200, 100);
////	            frame.setLocationRelativeTo(null);
////	            frame.setVisible(true);
//	        }
	    }
	 static JTextArea chatArea = new JTextArea();
	 static JScrollPane scrollPane = new JScrollPane(chatArea);
	 static int m =0;
	 public static void chatWithTailorWinder() {
	        JFrame chatFrame = new JFrame("Chat with TailorWinder");
	        chatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        chatFrame.setSize(800, 550);
	        chatFrame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.HORIZONTAL;

	        
	        chatArea.setEditable(false);
	        
//	        scrollPane.getViewport().getView().setBackground(Color.BLUE);
	        constraints.gridx = 0;
	        constraints.gridy = 0;
	        constraints.gridwidth = 2;
	        constraints.insets = new Insets(10, 10, 10, 10);
	        constraints.weightx = 1;
	        constraints.weighty = 1;
	        constraints.fill = GridBagConstraints.BOTH;
	        panel.add(scrollPane, constraints);

	        JTextField inputField = new JTextField(20);
	        
//	        Font f = new Font("Verdana", Font.PLAIN, 16);
//	        tf1.setFont(f);
//	        tf2.setFont(f);
//	        tf3.setFont(f);
//	        tf1.setForeground(Color.RED);
//	        tf2.setForeground(Color.GRAY);
//	        tf3.setForeground(Color.BLUE);
	        
	        Font font = new Font("Green",Font.PLAIN,14);
	        inputField.setFont(font);
	        inputField.setForeground(Color.BLUE);
	        constraints.gridy = 1;
	        constraints.weightx = 0;
	        constraints.weighty = 0;
	        panel.add(inputField, constraints);

	        JButton sendButton = new JButton("Send");
	        constraints.gridx = 1;
	        panel.add(sendButton, constraints);

	        chatFrame.getContentPane().add(panel);
	        chatFrame.setVisible(true);
	       
	        sendButton.addActionListener(e -> {
	        	
	        	scrollPane.getViewport().getView().setForeground(Color.BLUE);// no change
	            String input = inputField.getText();
	            scrollPane.getViewport().getView().setForeground(Color.blue);
	            chatArea.append("You: " + input + "\n");
	            scrollPane.getViewport().getView().setForeground(Color.BLUE);// no change
//	            m++;
	            
	            // Check user input and generate response
	            scrollPane.getViewport().getView().setForeground(Color.BLUE);//no change
	            String response = generateResponse(input);
	            scrollPane.getViewport().getView().setForeground(Color.blue);// no change

	            // Append response to the chat area
	          
	            chatArea.append("TailorWinder: " + response + "\n");
	            scrollPane.getViewport().getView().setForeground(Color.BLUE);// no change

	            // Clear the input field
	            
	         
	        	if(m%2==0) {
	        		inputField.setText("");//change
		            scrollPane.getViewport().getView().setForeground(Color.RED);
		            m++;
	        	}
	        	else {
	        		inputField.setText("");//change
		            scrollPane.getViewport().getView().setForeground(Color.BLUE);
		            m++;
	        	}
	            
	        });

	        inputField.addActionListener(e -> sendButton.doClick());
	    }
	
	

	    private static String generateResponse(String input) {
	        input = input.toLowerCase();
	        scrollPane.getViewport().getView().setForeground(Color.RED);
	        if (input.equals("hi") || input.equals("hello")) {
	            return "Hi! How can I assist you today?\n\n";
	        } else if (input.equals("bye") || input.contains("Quit")) {
	            return "Goodbye! Have a nice day!\n\n";
	        } else if (input.contains("solution") || input.contains("help") || input.contains("support") || input.contains("save me")) {
	            if (input.contains("rape") || input.contains("molest") || input.contains("forced")) {
	                return "The best solution right now is to quickly take legal action." +
	                        "\nVisit CWFD or National Helpline Center for gender violence and also file a report to the police. Do not be afraid, truth wins." +
	                        "\nContact CWFD at 55123806" +
	                        "\nContact NHC at 01728-159779" +
	                        "\nUnder penal code of 386, the person committing the offense can be arrested and heavily penalized.\n\n";
	            } else if (input.contains("kidnap") || input.contains("abducted") || input.contains("missing")) {
	                return "The best solution right now is to quickly take legal action." +
	                        "\nVisit the nearest police station (Thana) from your location and report the incident. Do not be afraid, we will help you." +
	                        "\nMake sure to keep your mobile phone on, in case the kidnapper contacts you." +
	                        "\nContact OPC at 55134526" +
	                        "\nContact Police OMF Headquarters at 01713-159745" +
	                        "\nUnder penal code of 302, the person committing the offense can be arrested and face severe consequences.\n\n";
	            } else if (input.contains("murder") || input.contains("kill") || input.contains("mutilate")) {
	                return "The best solution right now is to quickly take legal action." +
	                        "\nDo not panic and immediately call the emergency services (e.g., medical center, local police)." +
	                        "\nAvoid touching any potential evidence (e.g., murder weapon)." +
	                        "\nIf you are in immediate danger, contact emergency services at 999." +
	                        "\nContact Dhaka Medical College Legal Unit at 89115675" +
	                        "\nContact Shahrawardy Medical College Legal Unit at 23345617" +
	                        "\nContact the police supervisor of Dhaka Division at 01778283855" +
	                        "\nContact OCM Protection Service and CID at 55134556" +
	                        "\nUnder penal code of 319, the person committing the offense can face severe punishment, including the possibility of the death penalty.\n\n";
	            } else if (input.contains("abuse") || input.contains("torture") || input.contains("beat")) {
	                return "The best solution right now is to quickly take legal action." +
	                        "\nDo not panic and immediately call W.CAN Bangladesh and the National Helpline Center for Women Violence to report the abuse." +
	                        "\nDo not inform anyone until they arrive to handle the situation." +
	                        "\nContact W.CAN Bangladesh at 86112345" +
	                        "\nContact the National Helpline Center for Women Violence at 01728-159779" +
	                        "\nContact the police supervisor of Dhaka Division at 01778283855" +
	                        "\nUnder penal code of 386, the person committing the offense can be imprisoned for a certain period of time.\n\n";
	            }
	        } 
	        else if (input.contains("thank you")|| input.contains("thanks")|| input.contains("amazing")||input.contains("helpful")) {
		    	 return "I am glad I could help . Is there anything else you need me to do?";
		     }
	        
	        else if (input.contains("abused")|| input.contains("groped")||input.contains("domestic violence")|| (input.contains("housewife") && input.contains("husband")&& input.contains("abusive")) ) {
				return "Being dominated in such a pathetic state is truly bad . \nEveryone has the right to live, violence creates inhuman acts."
				+"Dont worry \nI am here , if you need any help , tell me , I am listening.\n\n";
				
			}

			else if (input.contains("murder")|| input.contains("killed")||input.contains("passed away")|| (input.contains("beat") && input.contains("death"))|| input.contains("died") ) {
				return "Loved ones passing away surely puts a lot of pain especially if it is in such a manner"
				+"\nJustice has to be served no matter what , don't give up on the shadow for light is here"
				+"\nTell me how can I support you\n\n";
			}
			else if (input.contains("missing")|| input.contains("kidnapped") || input.contains("kidnap") || input.contains("abducted")) {
				return "Terrifying time indeed . I wonder where that person disappeared . Whoever abducted that person needs to be find soon"+
				"\nTell me how can I help you in finding the person?\n\n";
			}
			else if (input.contains("sad")|| input.contains("crying")|| input.contains("cry") || input.contains("feeling lost")|| input.contains("depressed")||input.contains("teary")) {
				return "I know the time is really hard but don't cry  you are brave , you will get passed it trust me."
				+"\nLife has so much more meaning , trouble has came , it shall fade and light shall come."
				+"\nHere I am , tell me how can I make you feel better?\n\n";
			}

			else if (input.contains("motivate")||input.contains("hope")||input.contains("feeling suicidal") || input.contains("suicidal")|| input.contains("motivation")) {
				return "With every struggles , comes ease . With Every cloud comes its silver shining."
				+"\nGod does not burden a soul for more than it can take , Quran 2:286"
				+"\nLook above , the clouds are fading and the new horizon is coming up"
				+"\nSoon everything shall pass away and a new life will come\n\n";
			}
	        
			else if ((input.contains("solution")|| input.contains("help")|| input.contains("support") || input.contains("save me"))&&(input.contains("rape")|| input.contains("molest")|| input.contains("forced"))) {
				return "The best solution right now is to quickly take legal action."
				+"\nVisit CWFD or National Helpline Center for gender violence and also file a report to the police . Do not be afraid , truth wins"
				+"\nContact of CWFD is 55123806"
				+"\nContact of NHC is 01728-159779"
				+"\nUnder penal code of 386 , the person trying against you shall be arrested and be trialed heavily , so don't be scared\n\n";
			}
			else if ((input.contains("solution")|| input.contains("help")|| input.contains("support") || input.contains("save me"))&&(input.contains("kidnap")|| input.contains("abducted")|| input.contains("missing"))) {
				return "The best solution right now is to quickly take legal action."
				+"\nVisit the nearest Thana from your location and report to the police . Do not be afraid , we shall find the person"
				+"\nMake sure to keep your mobile on , in case an kidnapper gives a call"
				+"\nContact of OPC is 55134526"
				+"\nContact of Police OMF Headquarter is 01713-159745"
				+"\nUnder penal code of 302 , the person trying against you shall be arrested, so don't be scared\n\n";
			}
	        
			else if ((input.contains("solution")|| input.contains("help")|| input.contains("support") || input.contains("save me"))&&(input.contains("murder")|| input.contains("kill")|| input.contains("mutilate"))) {
				return "The best solution right now is to quickly take legal action."
				+"\nDo not panic and give an immediate call to the medical centre followed by local police"
				+"\nMake sure not to touch the murder weapon"
				+"\nContact 999 if you are in immediate threat"
				+"\nContact of Dhaka Medical College Legal unit is 89115675"
				+"\nContact of Shahrawardy Medical College Legal Unit is 23345617"
				+"\nContact of Police supervisor of Dhaka Division is 01778283855"
				+"\nContact of OCM protection service and CID is 55134556"
				+"\nUnder penal code of 319 , the person who commited the act shall be punished severely including sentence to death\n\n";
			}
			else if ((input.contains("solution")|| input.contains("help")|| input.contains("support") || input.contains("save me"))&&(input.contains("abuse")|| input.contains("torture")|| input.contains("beat"))) {
				return "The best solution right now is to quickly take legal action."
				+"\nDo not panic and give an immediate call to W.CAN Bangladesh , NHC for women and file a complaint"
				+"\nDo not inform anyone until they arrive"
				+"\nContact of W.CAN Bangladesh is 86112345"
				+"\nContact of NHC for Women Violence is 01728-159779"
				+"\nContact of Police supervisor of Dhaka Division is 01778283855"
				+"\nUnder penal code of 386 , the person who commited the act will be imprisoned for a certain time period\n\n";
			}
			else if(input.contains("Quit") ) {
				return "TailorWind Flew to the sky! Take Care. I in the sky. Talk to me whenever you need me.\n\n";
			}
	        else {
	            return "I'm sorry, I didn't understand your request. How else may I assist you?\n\n";
	        }

	        return null;
	    }
	        
	       
		
		

	        // Check for specific user inputs and generate appropriate responses
	       


		
		 
	//class ends all 	
}
	
	
	

