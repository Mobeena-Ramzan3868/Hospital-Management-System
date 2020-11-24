package hospital;
import javax.swing.JOptionPane;

import dateandtime.Date;
public class IndoorPatient extends Patient
{
	private int ward,roomno,bedno;
	private Doctor d;
	private Date admission;
	private int fee;
	IndoorPatient()
	{
		super();
		ward=0;
		roomno=0;
		bedno=0;
		d=new Doctor();
		admission=new Date();
		fee=0;
	}
	IndoorPatient(String name,String cnic,String address,int phone,String gender,int age,int ward,int roomno,int bedno,Doctor doc,Date da,int fee)
	{
		super(name,cnic,address,phone,gender,age);
		this.ward=ward;
		this.roomno=roomno;
		this.bedno=bedno;
		d=new Doctor();
		d=doc;
		admission=new Date();
		admission=da;
		this.fee=fee;
	}
	void input()
	{
		super.input();
		String w=JOptionPane.showInputDialog("enter indoor patient's ward number: ");
		ward=Integer.parseInt(w);
		String r=JOptionPane.showInputDialog("enter indoor patient's room number: ");
		roomno=Integer.parseInt(r);
		String b=JOptionPane.showInputDialog("enter indoor patient's bed number: ");
		bedno=Integer.parseInt(b);
		admission.input();
	}
	void input2(Doctor doc)
	{
		d=doc;
		String f=JOptionPane.showInputDialog("enter indoor patient's fee: ");
		fee=Integer.parseInt(f);
	}
	public String toString()
	{
		return super.toString()+"ward number: "+ward+" room number: "+roomno+" bed number: "+bedno+" doctor: "+d.toString()+" date of admission: "+admission.toString()+" hospital fee: "+fee+"\n";
	}
	int getday()
	{
		return 1;
	}
	String getdocname()
	{
		return "";
	}
	void changedate()
	{
		
	}
	void changetime()
	{
		
	}
	int getward()
	{
		return ward;
	}
	int getroom()
	{
		return roomno;
	}
	int getbed()
	{
		return bedno;
	}
	int getfee()
	{
		return fee;
	}
	void setward(int w)
	{
		ward=w;
	}
	void setroom(int r)
	{
		roomno=r;
	}
	void setbed(int b)
	{
		bedno=b;
	}
	void setfee(int f)
	{
		fee=f;
	}
}
