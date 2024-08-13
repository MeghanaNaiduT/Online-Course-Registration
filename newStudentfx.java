import java.util.*;
import java.io.*;
public class newStudentfx extends javax.swing.JFrame 
{

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    // End of variables declaration      

	public static final String FILE_NAME = "data.txt";
	
	static String name;
    static String pass;
    static long rno;
    static String dob;
	static String email;
    static long phno;
    String current_course;
	int ar;
	
	public newStudentfx(String s) 
	{}
	
	
    public newStudentfx() 
	{
        //this.rno=222300+m;
		//this.ar=m;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRATION");

        jLabel2.setText("Enter your Name: ");

        jLabel3.setText("Create Password:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel4.setText("Should contain lowercase, uppercase, digits and special characters.");

        jLabel5.setText("Enter your DOB:");

        jLabel6.setText("Enter your email:");

        jLabel7.setText("Enter your phone number:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
		
		

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(46, 46, 46)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
		setLocationRelativeTo(null);
		setVisible(true);
    }// </editor-fold>                        

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
	{     dispose(); 
		
		
		
		this.pass=jTextField2.getText();
		this.name=jTextField1.getText();
		this.dob=jTextField3.getText();
		this.email=jTextField4.getText();
		this.phno=Long.parseLong(jTextField5.getText()); 
		
		registration(this.name, this.pass, this.dob,this.phno, this.email);
		regfx1 r=new regfx1();
		//String regno=String.valueOf(this.rno);
		//reg
		/*
		String pa=this.pass[this.ar];
		System.out.println("pa="+pa);
		System.out.println(ar+"ar value.");
		adminfx ad=new adminfx(regno,pa,this.ar);
		System.out.println("Flow at admin constructor.");
		
       if(verification_block(jTextField2.getText()) && verification_block(jTextField5.getText()))
		{
			
		}
		else
		{
			invalidfx in=new invalidfx(this.ar);
		}*/
		
    }                                        
	
	 public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
			dispose(); 
        //Loginfx l=new Loginfx();
		Mainfx1 mn=new Mainfx1();
    } 
	
    public void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) 
	{
		
        // TODO add your handling code here:
    }                                           

    public void jTextField2ActionPerformed(java.awt.event.ActionEvent evt)
	{                                            
        //this.pass=jTextField2.getText();
		//System.out.println("Password in button actin="+this.pass[this.ar]);
    }                                           

    public void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) 
	{
		
        // TODO add your handling code here:
    }                                           

    public void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) 
	{
		
        // TODO add your handling code here:
    }                                           

    public void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) 
	{
		  //jTextField5.getText();
        // TODO add your handling code here:
    }                                           


	public boolean verification_block(String pword)
	{
		int l=0,u=0,d=0,s=0,c=0;
		int count=0;
		
		
			char ch[]=pword.toCharArray();
		
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isLowerCase(ch[i]))
				{l++;}
				
				else if(Character.isUpperCase(ch[i]))
				{u++;}
				
				else if(Character.isDigit(ch[i]))
				{d++;}
			
				else
				{s++;}
				
				if(i>=7)
				{c++;}
			}
			
			if(l>0 && u>0 && d>0 && s>0 && c>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		
	}
	
	public static void registration(String name, String password, String dob, long phno, String email) 
	{
		System.out.println("Registration called.");
		newStudentfx ns1=new newStudentfx("");
        int i = 0;
        int reg = 222300;
        Scanner sc =new Scanner(System.in);
		/*
		String name;
		String pass ;
        String dob;
        String email;
        long phno;
        //System.out.println("Enter your DOB:");
		dob=dob1;
		//System.out.println("Enter your email:");
		email=email;*/
		/*
		while(true)
		{
			System.out.println("Enter your phone number.");
			phno=sc.nextLong();
			int x=verification_block("",phno);
			if(x==1)
			{break;}
			else
			{System.out.println("Invalid Phone Number.");}
		}*/
       
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            boolean startReading = false;
            boolean startReading2 = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("{no=")) {
                    startReading = true;
                    i++;
                }
				/*
                if (line.contains("regno= ")) {
                    startReading2 = true;
                    reg++;
                }*/
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        //System.out.println("regno: " + reg);
		//ns1.rno=reg;

        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println();
            printWriter.println("{no=" + i);
			long rrr=reg+i;
			ns1.rno=rrr;
			//ns.ar=i;
            printWriter.println("regno=" + rrr);
            printWriter.println("name=" + name);
            printWriter.println("DOB=" + dob);
            printWriter.println("phone no=" + phno);
            printWriter.println("email=" + email);
            printWriter.println("password=" + password);
            printWriter.println("}");

            printWriter.close();
            fileWriter.close();

            System.out.println("New data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
	
	public static int verification_block(String pword,long ph)
	{
		int l=0,u=0,d=0,s=0,c=0;
		int count=0;
		
		if(ph==0)
		{
			char ch[]=pword.toCharArray();
		
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isLowerCase(ch[i]))
				{l++;}
				
				else if(Character.isUpperCase(ch[i]))
				{u++;}
				
				else if(Character.isDigit(ch[i]))
				{d++;}
			
				else
				{s++;}
			
				if(i>=7)
				{c++;}
			}
			
			if(l>0 && u>0 && d>0 && s>0 && c>0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		
		}
		
		if(pword.equals(""))
		{
			while(ph!=0)
			{
				ph = ph/10;
				count++;
			}
			if(count==10)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
			
		return 5;
		
	}
	public static void main(String args[])
	{
		newStudentfx ns=new newStudentfx();
	}
		
}
	
                                          

    
             

