package Day2_;

public class Employee
{
  
   void displaySalary()
   {
	   System.out.println("The Employee salary is : 20000");
   }
}
class PermanentEmp extends Employee
{
	
	void incrementSalary()
	{
		super.displaySalary();
		System.out.println("The Permanent Employee incremented salary is : 25000 ");
	}
}
class TemporaryEmp extends Employee
{
	void incrementSalary()
	{
		super.displaySalary();
		System.out.println("The Temporary Employee incremented salary is : 22000");
	}
}
