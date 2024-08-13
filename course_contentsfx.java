
//package coursepack;

class course_contentsfx 
{
	
	public course_contentsfx(int m)
	{
		System.out.println("Course Contents page called.");
		//profilefx pf=new profilefx("");
		homepagefx h=new homepagefx("");
		int x=0;
		String x1=h.coursenumberadded(m);
		if(x1.equals("UG11_Python"))
		{
			x=1;
		}
		System.out.println(x+"x value in course contents.");
		if(x==0)
		{
			Notreg nr=new Notreg(m);
		}
		//Coursefx c=new Coursefx();
		
		switch(x)
		{
			case 1:
			UG11_Pythonfx py=new UG11_Pythonfx(m);
			
			break;
			//call under construction method
			
			case 2:
			//Construction cs=new Construction(m);
			//c.UG12_JAVA();
			
			//break;
			
			case 3:
			//cs.Construction(m);
			//c.UG13_C();
		
			//break;
			
			case 4:
			//cs.Construction(m);
			//c.UG21_DLD();
			
			//break;
			
			case 5:
			//cs.Construction(m);
			//c.UG22_ANALOG();
			
			//break;
			
			case 6:
			//cs.Construction(m);
			//c.UG23_NETWORK();
			
			//break;
			
			case 7:
			//cs.Construction(m);
			//c.UG31_MATS();
			
			//break;
			
			case 8:
			//cs.Construction(m);
			//c.UG32_HEAT();
			
			//break;
			
			case 9:
			//cs.Construction(m);
			//c.UG33_FLUIDMECHANICS();
			
			//break;
			
			case 10:
			//cs.Construction(m);
			//c.PG11_MARKTING();
			
			//break;
			
			case 11:
			//cs.Construction(m);
			//c.PG12_HR();
		
			//break;
			
			case 12:
			//cs.Construction(m);
			//c.PG13_BUSINESS();
		
			//break;
			
			case 13:
			//cs.Construction(m);
			//c.PG21_FUNOCIS();
		
			//break;
			
			case 14:
			//cs.Construction(m);
			//c.PG22_MARKETING();
	
			//break;
			
			case 15:
			//cs.Construction(m);
			//c.PG23_HRM();

			//break;
			
			case 16:
			//cs.Construction(m);
			//c.PG31_CHEMICAL();
			
			//break;
			
			case 17:
			//cs.Construction(m);
			//c.PG32_THERMAL();
			
			//break;
			
			case 18:
			Construction cs=new Construction(m);
			//c.PG33_POWER();
			
			break;
			
		}
	}
	public static void main(String args[])
	{
		course_contentsfx cfx=new course_contentsfx(1);
	}
		
}