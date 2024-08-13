//package homepack;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
class homepagefx  extends javax.swing.JFrame
{
	static int cc;// retrieve course from database course=1
	static int z;
	public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JLabel jLabel1;
	
	 private final String FILE_NAME = "data.txt";
	homepagefx(String s)
	{}
	
	
	 void addStudentDetails(int position, int course)
    {
    String filename = "data.txt";

    try {
        // Read existing data from the file
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder data = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            data.append(line).append("\n");
        }
        reader.close();
		if(course==1)
		{
        // Append new data to the existing data
        data.append("{no2=").append(position).append("\n");
        data.append("course=UG11_Python\n");
        data.append("exam1marks=0\n");
        data.append("exam2marks=0\n");
        data.append("exam3marks=0\n");
        data.append("totalmarks=0\n");
        data.append("}\n");
		}
        // Write the entire contents back to the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write(data.toString());
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

 
     
	/*
	public int coursenumberadded(int p)
	{ int fcc=0;
	int no=p;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no2=" + no)) {
                    k++;
                } if (line.startsWith("course")) {
					System.out.println("inside course number caller.");
                   fcc = Integer.parseInt(line.split("=")[1].trim());
				   break;
                }
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return fcc;
	}
	*/
	
	/*homepagefx(int cc,int loc)
	{
		this.cc=cc;
		try{
			
		addStudentDetails(loc,cc);
		}
		catch (IOException e)
        {
            e.printStackTrace();
        }
		
	}*/
	
	public homepagefx(int p)
	
	{	
		this.z=p;
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("HOMEPAGE");

        jButton1.setText("PROFILE");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ALL COURSES");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CURRENT COURSES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PAYMENT");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("LOGOUT");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4))))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
		dispose();
        //profile
		//profilefx pr=new profilefx(this.z);
		try{
		profilefx pr=new profilefx(this.z);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Inside profile catch block.");
			e.printStackTrace();
		}
    }
	
	public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {     
		dispose();
        //all course
		AllCoursesfx c=new AllCoursesfx(this.z);
    }
	
	public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {    
		dispose();
        course_contentsfx ccs=new course_contentsfx(this.z);//current course
    }                                        

    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {    
		dispose();
       Paymentfx2 pm=new Paymentfx2(this.z);//payment
    }                                        

    public void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {  
		dispose();
        Loginfx lg=new Loginfx();//logout
    } 
		
		public  String coursenumberadded(int no) {
        Scanner in = new Scanner(System.in);
        String value = "";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            boolean startReading = false;

            System.out.println("course accessed:");
            
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("{no2="+no)) {
                    startReading = true;
                }

                if (startReading) {
                    if (line.contains("course=")) 
					
			value=(line.split("=")[1].trim());
						
                       

                }

                if (line.contains("}")) {
                    startReading = false;
                }
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return value;
    }

	/*public void addStudentDetails(int no, int course)throws IOException
     {
		 int x=no;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));

            writer.newLine();
            writer.write("{no1=" + (x));
            writer.newLine();
            writer.write("course=" + course);
            writer.newLine();
            writer.write("}");

            writer.close();

            System.out.println("New data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }*/
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	public void actionPerformed(java.awt.event.ActionEvent e)
	{
		if (e.getSource() == jButton1)
		{
			profilefx p=new profilefx(p);
			//call profile class
		}
		
		if (e.getSource() == jButton2)
		{
			AllCoursesfx c=new AllCoursesfx();
			//call all courses class
		}
		
		if (e.getSource() == jButton3)
		{
			//call current course
		}
		
		if (e.getSource() == jButton4)
		{
			//payment
		}
		
		
		if (e.getSource() == jButton5)
		{
			//logout
		}
	}
}
	
*/		
		
		
		
		
		
		
		



    