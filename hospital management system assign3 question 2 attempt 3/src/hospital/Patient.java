package hospital;
import javax.swing.JOptionPane;
public abstract class Patient 
{
	private String name,cnic,address;
	private int phone;
	private String gender;
	private int age;
	Patient()
	{
		name="";
		cnic="";
		address="";
		phone=0;
		gender="";
		age=0;
	}
	Patient(String name,String cnic,String address,int phone,String gender,int age)
	{
		this.name=name;
		this.cnic=cnic;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
		this.age=age;
	}
	void input()
	{
		name=JOptionPane.showInputDialog("enter patient's name: ");
		/*cnic=JOptionPane.showInputDialog("enter patient's cnic: ");
		address=JOptionPane.showInputDialog("enter patient's address: ");
		String p=JOptionPane.showInputDialog("enter patient's phone number: ");
		phone=Integer.parseInt(p);
		gender=JOptionPane.showInputDialog("enter patient's gender: ");
		String a=JOptionPane.showInputDialog("enter patient's age: ");
		age=Integer.parseInt(a);*/
	}
	abstract void input2(Doctor doc);
	abstract int getday();
	abstract String getdocname();
	abstract void changedate();
	abstract void changetime();
	public String toString()
	{
		return "Patient name: "+name+" CNIC: "+cnic+" address: "+address+" phone: "+phone+" gender: "+gender+" age: "+age+"\n";
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
	String getaddress()
	{
		return address;
	}
	void setaddress(String a)
	{
		address=a;
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
	int getage()
	{
		return age;
	}
	void setage(int a)
	{
		age=a;
	}
}