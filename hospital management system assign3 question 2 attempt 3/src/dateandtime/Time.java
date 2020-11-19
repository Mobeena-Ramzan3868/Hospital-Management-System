package dateandtime;
import javax.swing.JOptionPane;
public class Time 
{
	private int hours,mins;
	private String ampm;
	public Time()
	{
		hours=0;
		mins=0;
		ampm="";
	}
	public Time(int hours,int mins,String ampm)
	{
		this.hours=hours;
		this.mins=mins;
		this.ampm=ampm;
	}
	public void input()
	{
		String h=JOptionPane.showInputDialog("enter hours: ");
		hours=Integer.parseInt(h);
		String m=JOptionPane.showInputDialog("enter minutes: ");
		mins=Integer.parseInt(m);
		ampm=JOptionPane.showInputDialog("enter whether its am or pm: ");
	}
	public String toString()
	{
		return "hours: "+hours+" minute: "+mins+" am/pm: "+ampm+" ";
	}
	public int gethours()
	{
		return hours;
	}
	public int getmins()
	{
		return mins;
	}
	public String getampm()
	{
		return ampm;
	}
	public void sethours(int h)
	{
		hours=h;
	}
	public void setmins(int m)
	{
		mins=m;
	}
	public void setampm(String m)
	{
		ampm=m;
	}
}