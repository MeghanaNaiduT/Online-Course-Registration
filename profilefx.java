/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Meghana Naidu T
 */
 
 import java.util.*;
import java.io.*;


public class profilefx extends javax.swing.JFrame {

    /**
     * Creates new form profile
     */
	 
	 int x;
	 private static final String FILE_NAME = "data.txt";
	 
    public profilefx(int p1) {
		System.out.println(p1+" p value in profilefx.");
		this.x=p1;
		//newStudentfx ob=new newStudentfx("");
		
		homepagefx h=new homepagefx("");
		Exam_Marks exm=new Exam_Marks();

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
		jLabel20=new javax.swing.JLabel();
		
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		try{
			
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PROFILE");

        jLabel2.setText("NAME:");
		//String s1=acessname(this.x);
		String s1=readData(this.x,"n");

        jLabel3.setText(s1);

        jLabel4.setText("REGISTRATION NUMBER:");
		//String l11=acessregno(p1);
		String l11=readData(this.x,"r");
        jLabel5.setText(l11);

        jLabel6.setText("DATE OF BIRTH:");
		//String s2=dobaccess(p1);
		String s2=readData(this.x,"d");
        jLabel7.setText(s2);

        jLabel8.setText("EMAIL ADDRESS:");
		//String s3=acessemail(p1);
		String s3=readData(this.x,"e");
        jLabel9.setText(s3);

        jLabel10.setText("PHONE NUMBER: ");
		//String l22=accessphno(p1);
		String l22=readData(this.x,"p");

        jLabel11.setText(l22);

        

        jLabel12.setText("Course taken:");
		String c="";
		String x1=h.coursenumberadded(p1);
		/*int x=-1;
		if(x1.equals("UG11_Python")
		{
			x=1;
		}
			
		if(x==1)
		{
			c="UG11_Pythonfx";
		}
*/
        jLabel13.setText(x1);

        jLabel14.setText("Total Marks Scored:");
		String t2=totmark(p1);
		//int t=Integer.parseInt(t2);
		//String tt=Integer.toString(t2);
		
        jLabel15.setText(t2);
		
		if(t2.equals("14")||t2.equals("15")||t2.equals("16")||t2.equals("17")||t2.equals("18")||t2.equals("19")||t2.equals("20"))
		{
			jLabel20.setText("Course completed.Choose new course.");
		}
		else
		{
			jLabel20.setText("Course not completed.Get 	>15 marks in exams.");
		}
		
		}
		catch(NullPointerException e)
		{
            e.printStackTrace();
        }
		
		jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
		
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
							.addComponent(jLabel20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(39, 39, 39)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    
                    .addComponent(jLabel20))
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
		setLocationRelativeTo(null);
		setVisible(true);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
		dispose();                                     
       homepagefx h=new homepagefx(this.x);
    }

	
	public static String totmark(int no) {
        Scanner in = new Scanner(System.in);
        String value = "";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            boolean startReading = false;

            System.out.println("Total Marks accessed.");
            
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("{no2="+no)) {
                    startReading = true;
                }

                if (startReading) {
                    if (line.contains("totalmarks=")) 
					
						//value=line;
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
	
	
	
	
	
	
		public static String readData(int no,String need) {
        Scanner in = new Scanner(System.in);
        String value = "";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            boolean startReading = false;

            System.out.println("Enter the value you want (n for name, p for password, r for registration number, d for dob , e for email , p for phno ,):");
            
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("{no="+no)) {
                    startReading = true;
                }

                if (startReading) {
			if (need.equals("n") && line.contains("name")) {
                        value = (line.split("=")[1].trim());
                        break;
                    } else if (need.equals("r") && line.contains("regno")) {
                        value = (line.split("=")[1].trim());
                        break;
                    }
                    else if (need.equals("d") && line.contains("DOB")) {
                        value = (line.split("=")[1].trim());
                        break;
                    }
                    else if (need.equals("e") && line.contains("email")) {
                        value = (line.split("=")[1].trim());
                        break;
                    }else if (need.equals("p") && line.contains("phone no")) {
                        value = (line.split("=")[1].trim());
                        break;
                    }

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

	
/*
		public String acessname(int p)
	{ 	String n="";
		
		int no=p;
		System.out.println(no+" number value in name.");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no"+no)) {
                    
                 if (line.startsWith("name=")) {
					System.out.println("inside name caller.");
                   n = (line.split("=")[1].trim());
				   break;
                }}
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return n;
	}
	
	public String acessemail(int p)
	{ String eml="";
	int no=p;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no=" + no)) {
                    k++;
                } if (line.startsWith("email")) {
					System.out.println("inside email caller.");
                   eml = (line.split("=")[1].trim());
				   break;
                }
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return eml;
	}
	
	public String acessregno(int p)
	{ String rn="";
	int no=p;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no=" + no)) {
                    k++;
                } if (line.startsWith("regno")) {
					System.out.println("inside regno caller.");
                   rn = (line.split("=")[1].trim());
				   break;
                }
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return rn;
	}
	
	public String accessphno(int p)
	{ String phn="";
	int no=p;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no" + p)) {
                    k++;
                } if (line.startsWith("phone no")) {
					System.out.println("inside phno caller.");
                   phn = (line.split("=")[1].trim());
				   break;
                }
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return phn;
	}
		
	public String dobaccess(int p)
	{ String d="";
	int no=p;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no=" + p)) {
                    k++;
                } if (line.startsWith("DOB")) {
					System.out.println("inside dob caller.");
                   d = (line.split("=")[1].trim());
				   break;
                }
                
                }
            }
			catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.homepagefx");
            e.printStackTrace();
        }
		
			return d;
	}



*/
		

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);/*
        }
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }*/
	public static void main(String args[])
		{
			profilefx pl=new profilefx(2);
		}
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel20;
    // End of variables declaration                   
}
