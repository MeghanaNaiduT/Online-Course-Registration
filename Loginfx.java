
//package adminpack;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Loginfx extends javax.swing.JFrame 
{
		public javax.swing.JTextField jTextField1;
        public javax.swing.JTextField jTextField2;
        public javax.swing.JLabel jLabel1;
        public javax.swing.JLabel jLabel2;
        public javax.swing.JButton jButton1;
        public javax.swing.JLabel jButton2;
		public javax.swing.JLabel jLabel3;
		private static final String FILE_NAME = "data.txt";
		public Loginfx()
		{
		jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        /*jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });*/

        jLabel1.setText("Enter Registration Number:");

        jLabel2.setText("Enter Password:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, javax.swing.GroupLayout.DEFAULT_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
		setLocationRelativeTo(null);
		setVisible(true);
    }
	
	// </editor-fold
	
	public void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
	{      
		dispose();      
		String regno=jTextField1.getText();
        String pwd=jTextField2.getText();
		int result=login(pwd,regno);
		int z=Integer.parseInt(regno)-(222300);
		if(result==1)
		{
			homepagefx h=new homepagefx(z);
		}
		else
		{
			Mainfx1 obj=new Mainfx1();
		}
		
		//adminfx ad=new adminfx();
		
		/*
		System.out.println(p+"position");
		if(pwd.equals(ad.password1[p]))//if access granted go to homepage
		{
			homepagefx h=new homepagefx(p);
			//System.out.println("Access Granted.");
			//h.homepage();
		}
		else// go back to main page
		{
			Mainfx1 obj=new Mainfx1();
			
			//System.out.println("Invalid details.\nAccess Denied");
			
		}*/
		
    } 
	
	/*
	public int pos1(String r)
	{
		
		int pos=-1;
		adminfx ad=new adminfx();
		for (int i=1;i<=1;i++)
		{
			if(ad.regn[i].equals(r))
			{
				pos=i;
				break;
			}
		}
		return pos;
	}*/
	
	   public int login(String p, String r) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your registration number:");
        String registrationNo = r;
        //System.out.println("Enter your password:");
        String password =p;
        boolean loggedIn = false;

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("regno=" + registrationNo)) {
                    while (!(line = bufferedReader.readLine()).equals("}")) {
                        if (line.contains("password=" + password)) {
                            loggedIn = true;
                            break;
                        }
                    }
                    break;
                }
            }

            bufferedReader.close();
            fileReader.close();

            if (loggedIn) {
               return 1;
            } else {
                return 0;
            }
        } catch (IOException e) 
		{
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
		return -1;
    }
	
}