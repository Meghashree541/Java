package java5;
import java.util.Scanner;
  class Staff{
	  String Name=" ";
	  String Yoj=" ";
	  String Address=" ";
	  String Salary=" ";
	  
	  void read(String Name,String Yoj,String Address,String Salary) {
		  this.Name=Name;
		  this.Yoj=Yoj;
		  this.Address=Address;
		  this.Salary=Salary;
	  }
	  
	  void print() {
		  System.out.printf("%10s %10s %10s %10s\n",Name,Yoj,Address,Salary);
	  }
	  
  }
  
  public class Employee{
	  public static void main(String[] args) {
		  Staff a[]=new Staff[5];
		  int n;
		  int i;
		  String Name=" ";
		  String Yoj=" ";
		  String Address=" ";
		  String Salary=" ";
		  Scanner z=new Scanner(System.in);
		  System.out.print("Enter number of Employees:" );
		  n=z.nextInt();
		  for (i=0;i<n;i++)
			  a[i]=new Staff();
		  System.out.println("Enter "+n+" details:");
		  for(i=0;i<n;i++)
		  {
			  System.out.println("Enter Staff:"+(i+1));
			  System.out.print("Name:");
			  Name=z.nextLine();
			  System.out.print("Year of joining:");
			  Yoj=z.nextLine();
			  System.out.print("Address:");
			  Address=z.nextLine();
			  System.out.print("Salary:");
			  Salary=z.nextLine();
			  a[i].read(Name, Yoj, Address, Salary);
		  }
		  System.out.println("Employee details:");
		  System.out.printf("%10s %10s %10s %10s\n", "Name","Yoj","Address","Salary");
		  		for(i=0;i<n;i++)
		  			a[i].print();
		  		z.close();
	  }
  }