package hospital;
import javax.swing.JOptionPane;
public class Doctor 
{
	private String name,cnic;
	private int phone;
	private String gender,depart,specialize;
	Doctor()
	{
		name="";
		cnic="";
		phone=0;
		gender="";
		depart="";
		specialize="";
	}
	Doctor(String name,String cnic,int phone,String gender,String depart,String specialize)
	{
		this.name=name;
		this.cnic=cnic;
		this.phone=phone;
		this.gender=gender;
		this.depart=depart;
		this.specialize=specialize;
	}
	void input()
	{
		name=JOptionPane.showInputDialog("enter doctor's name: ");
		//cnic=JOptionPane.showInputDialog("enter doctor's cnic: ");
		//String p=JOptionPane.showInputDialog("enter doctor's phone number: ");
		//phone=Integer.parseInt(p);
		//gender=JOptionPane.showInputDialog("enter doctor's gender: ");
		depart=JOptionPane.showInputDialog("enter doctor's department name: ");
		//specialize=JOptionPane.showInputDialog("enter doctor's specialization: ");
	}
	public String toString()
	{
		return "Doctor name: "+name+" cnic: "+cnic+" phone number: "+phone+" gender: "+gender+" department: "+depart+" specialization: "+specialize+" ";
	}
	String getname()
	{
		return name;
	}
	void setname(String n)
	{
		name=n;
	}
	String getcnic()
	{
		return cnic;
	}
	void setcnic(String c)
	{
		cnic=c;
	}
	int getphone()
	{
		return phone;
	}
	void setphone(int p)
	{
		phone=p;
	}
	String getgender()
	{
		return gender;
	}
	void setgender(String g)
	{
		gender=g;
	}
	String getdepart()
	{
		return depart;
	}
	void setdepart(String d)
	{
		depart=d;
	}
	String getspecialize()
	{
		return specialize;
	}
	void setspecialize(String s)
	{
		specialize=s;
	}
}