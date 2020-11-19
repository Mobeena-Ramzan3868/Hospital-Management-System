package hospital;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DemoHospital 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of doctor: ");
		int y=input.nextInt();
		Doctor d[]=new Doctor[y];
		for(int j=0;j<y;j++)
		{
			d[j]=new Doctor();
			d[j].input();
		}
		System.out.println("enter the number of patients: ");
		int x=input.nextInt();
		Patient p[]=new Patient[x];
		int flag;
		int doc;
		for(int i=0;i<x;i++)
		{
			System.out.println("1: enter Indoor Patient");
			System.out.println("2: enter Outdoor Patient");
			System.out.println("enter yout choice");
			int choice=input.nextInt();
			if(choice==1)
			{
				p[i]=new IndoorPatient();
				flag=0;
				doc=0;
				p[i].input();
				while(flag==0)
				{
					String docname=JOptionPane.showInputDialog("enter doctor name for this patient: ");
					for(int l=0;l<y;l++)
					{
						if(d[l].getname().equalsIgnoreCase(docname))
						{
							flag=1;
							doc=l;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println("Error: this doctor is not in this hospital choose another doctor");
					}
				}
				if(flag==1)
				{
					p[i].input2(d[doc]);
				}
			}
			else if(choice==2)
			{
				p[i]=new OutdoorPatient();
				flag=0;
				doc=0;
				p[i].input();
				while(flag==0)
				{
					String docname=JOptionPane.showInputDialog("enter doctor name for this patient: ");
					for(int l=0;l<y;l++)
					{
						if(docname.equalsIgnoreCase(d[l].getname()))
						{
							flag=1;
							doc=l;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println("Error: this doctor is not in this hospital choose another doctor");
					}
				}
				if(flag==1)
				{
					p[i].input2(d[doc]);
				}
			}
			else
			{
				System.out.println("enter valid choice");
			}
		}
		char choice='y';
		int ch;
		do
		{
			System.out.println("1: See the list of all Doctors");
			System.out.println("2: Search a doctor by name or department");
			System.out.println("3: See the list of all indoor patients");
			System.out.println("4: See the list of all appointments on a certain day");
			System.out.println("5: See the list of appointments of a certain doctor");
			System.out.println("6: Change the date or time of appointment of a certain patient");
			System.out.println("enter your choice");
			ch=input.nextInt();
			if(ch==1)
			{
				for(int l=0;l<y;l++)
				{
					JOptionPane.showMessageDialog(null,"Doctor: "+d[l].toString(),"DOCTOR DETAILS",JOptionPane.WARNING_MESSAGE);
				}
			}
			else if(ch==2)
			{
				System.out.println("1: to search by doctor name");
				System.out.println("2: to search by doctor department name");
				System.out.println("enter your choice: ");
				int ich=input.nextInt();
				if(ich==1)
				{
					flag=0;
					String dnam=JOptionPane.showInputDialog("enter the name of the doctor to search: ");
					for(int l=0;l<y;l++)
					{
						if(dnam.equalsIgnoreCase(d[l].getname()))
						{
							JOptionPane.showMessageDialog(null,"Doctor name found: "+d[l].toString(),"SEARCHING",JOptionPane.WARNING_MESSAGE);
							flag=1;
						}
					}
					if(flag==0)
					{
						System.out.println("Doctor name not found");
					}
				}
				else if(ich==2)
				{
					flag=0;
					String ddepart=JOptionPane.showInputDialog("enter the department name of the doctor to search: ");
					for(int l=0;l<y;l++)
					{
						if(ddepart.equalsIgnoreCase(d[l].getdepart()))
						{
							JOptionPane.showMessageDialog(null,"Department name found: "+d[l].toString(),"SEARCHING",JOptionPane.WARNING_MESSAGE);
							flag=1;
						}
					}
					if(flag==0)
					{
						System.out.println("Department name not found");
					}
				}
				else
				{
					System.out.println("Error: enter valid choice to search");
				}
			}
			else if(ch==3)
			{
				flag=0;
				for(int l=0;l<x;l++)
				{
					if(p[l] instanceof IndoorPatient)
					{
						JOptionPane.showMessageDialog(null,"Indoor Patient: "+p[l].toString(),"INDOOR PATIENT",JOptionPane.WARNING_MESSAGE);
						flag=1;
					}
				}
				if(flag==0)
				{
					System.out.println("there is no indoor patient in hospital");
				}
			}
			else if(ch==4)
			{
				flag=0;
				String appday=JOptionPane.showInputDialog("enter the day to list appointments: ");
				int appd=Integer.parseInt(appday);
				for(int l=0;l<x;l++)
				{
					if(p[l] instanceof OutdoorPatient)
					{
						if(appd==p[l].getday())
						{
							JOptionPane.showMessageDialog(null,"appointment: "+p[l].toString(),"APPOINTMENT",JOptionPane.WARNING_MESSAGE);
							flag=1;
						}
					}
				}
				if(flag==0)
				{
					System.out.println("there is no appointment on this day");
				}
			}
			else if(ch==5)
			{
				flag=0;
				String docn=JOptionPane.showInputDialog("enter the doctor name to list all appointments: ");
				for(int l=0;l<x;l++)
				{
					if(p[l] instanceof OutdoorPatient)
					{
						if(docn.equalsIgnoreCase(p[l].getdocname()))
						{
							JOptionPane.showMessageDialog(null,"appointment: "+p[l].toString(),"APPOINTMENT",JOptionPane.WARNING_MESSAGE);
							flag=1;
						}
					}
				}
				if(flag==0)
				{
					System.out.println("NO doctor appointment found");
				}
			}
			else if(ch==6)
			{
				System.out.println("1: to search appointment by date");
				System.out.println("2: to search appointment by time");
				System.out.println("enter your choice: ");
				int appch=input.nextInt();
				if(appch==1)
				{
					flag=0;
					String patn=JOptionPane.showInputDialog("enter the name of patient to change date of appointment: ");
					for(int l=0;l<x;l++)
					{
						if(p[l] instanceof OutdoorPatient)
						{
							if(patn.equalsIgnoreCase(p[l].getname()))
							{
								p[l].changedate();
								flag=1;
								JOptionPane.showMessageDialog(null,"patient: "+p[l].toString(),"with updated date",JOptionPane.WARNING_MESSAGE);
							}
						}
					}
					if(flag==0)
					{
						System.out.println("there is no outdoor patient with this name");
					}
				}
				else if(appch==2)
				{
					flag=0;
					String patn=JOptionPane.showInputDialog("enter the name of patient to change time of appointment: ");
					for(int l=0;l<x;l++)
					{
						if(p[l] instanceof OutdoorPatient)
						{
							if(patn.equalsIgnoreCase(p[l].getname()))
							{
								p[l].changetime();
								flag=1;
								JOptionPane.showMessageDialog(null,"patient: "+p[l].toString(),"with updated time",JOptionPane.WARNING_MESSAGE);
							}
						}
					}
					if(flag==0)
					{
						System.out.println("there is no outdoor patient with this name");
					}
				}
				else
				{
					System.out.println("ERROR: enter valid choice");
				}
			}
			else
			{
				System.out.println("Error: enter valid choice");
			}
			System.out.println("enter whether to continue or not (y/n)");
			choice=input.next().charAt(0);
		}while(choice=='y');
	}
}
