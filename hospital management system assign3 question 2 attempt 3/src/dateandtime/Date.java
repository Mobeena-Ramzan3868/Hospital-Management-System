package dateandtime;
import javax.swing.JOptionPane;
public class Date 
{
	private int day,month,year;
	public Date()
	{
		day=0;
		month=0;
		year=0;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void input()
	{
		String d=JOptionPane.showInputDialog("enter day: ");
		day=Integer.parseInt(d);
		String m=JOptionPane.showInputDialog("enter month: ");
		month=Integer.parseInt(m);
		String y=JOptionPane.showInputDialog("enter year: ");
		year=Integer.parseInt(y);
	}
	public String toString()
	{
		return "day: "+day+" month: "+month+" year: "+year+" ";
	}
	public int getday()
	{
		return day;
	}
	public int getmonth()
	{
		return month;
	}
	public int getyear()
	{
		return year;
	}
	public void setday(int d)
	{
		day=d;
	}
	public void setmonth(int m)
	{
		month=m;
	}
	public void setyear(int y)
	{
		year=y;
	}
}