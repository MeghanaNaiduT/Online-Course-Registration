
//package adminpack;

class adminfx
{
    static String regn[]=new String[20];
	static String password1[]=new String[20];
	String Bacno;
    int Botp;
    String Bpassword;
    int otp;
	
	public adminfx()
	{}
	
	public adminfx(String r, String p,int x)//constructor
	{
		this.regn[x]=r;
		this.password1[x]=p;
		//System.out.println("x value="+x);
		//System.out.println("Registration at location 1="+this.regn[x]);
		//System.out.println("Password at location 1="+this.password1[x]);
		
	}
	/*
	public static void main(String args[])
	{
		adminfx ad=new adminfx("222301","Me@2",1);
	}	*/	
}

