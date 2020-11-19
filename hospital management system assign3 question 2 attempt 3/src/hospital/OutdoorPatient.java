package hospital;
import javax.swing.JOptionPane;

import dateandtime.Date;
import dateandtime.Time;
public class OutdoorPatient extends Patient
{
	Date dappoint;
	Time tappoint;
	Doctor d;
	private int fee;
	OutdoorPatient()
	{
		super();
		dappoint=new Date();
		tappoint=new Time();
		d=new Doctor();
		fee=0;
	}
	OutdoorPatient(String name,String cnic,String address,int phone,String gender,int age,Date dapp,Time tapp,int fee)
	{
		super(name,cnic,address,phone,gender,age);
		dappoint=new Date();
		dappoint=dapp;
		tappoint=new Time();
		tappoint=tapp;
		d=new Doctor();
		this.fee=fee;
	}
	void input()
	{
		super.input();
	}
	void input2(Doctor doc)
	{
		d=doc;
		dappoint.input();
		tappoint.input();
		/*String f=JOptionPane.showInputDialog("enter outdoor patient's fee: ");
		fee=Integer.parseInt(f);*/
	}
	public String toString()
	{
		return super.toString()+"date of appointment: "+dappoint.toString()+" time of appointment: "+tappoint.toString()+" doctor: "+d.toString()+" fee: "+fee;
	}
	void changedate()
	{
		String appd=JOptionPane.showInputDialog("enter new date to change (format=25/07/2000): ");
		int a=appd.indexOf("/");
		int da=Integer.parseInt(appd.substring(0,a));
		System.out.println(da);
		dappoint.setday(da);
		int b=appd.indexOf("/",a+1);
		int mo=Integer.parseInt(appd.substring(a+1,b));
		System.out.println(mo);
		dappoint.setmonth(mo);
		int ye=Integer.parseInt(appd.substring(b+1,appd.length()));
		System.out.println(ye);
		dappoint.setyear(ye);
	}
	void changetime()
	{
		String apph=JOptionPane.showInputDialog("enter new time's hours: ");
		tappoint.sethours(Integer.parseInt(apph));
		String appm=JOptionPane.showInputDialog("enter new time's minutes: ");
		tappoint.setmins(Integer.parseInt(appm));
		String appa=JOptionPane.showInputDialog("enter new time's am/pm: ");
		tappoint.setampm(appa);
	}
	int getday()
	{
		return dappoint.getday();
	}
	String getdocname()
	{
		return d.getname();
	}
	int getfee()
	{
		return fee;
	}
	void setfee(int f)
	{
		fee=f;
	}
}