class Employee
{
private int id;
private String name;
private int salary;
public void setId(int EmployeeId)
{
id=EmployeeId;
}
public int getId()
{
return id;
}

public void setName(String EmployeeName)
{
name=EmployeeName;
}
public String getName()
{
return name;
}
public void setSalary(int EmployeeSalary)
{
salary=EmployeeSalary;
}
public int getSalary()
{
return salary;
}
public void printData()
{
System.out.println(id + name + salary);
}
public static void main(String args[])
{
Employee employee=new Employee();
employee.setId(1);
employee.setName("shravya");
employee.setSalary(50000);
employee.printData();
}
}