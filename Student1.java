class Student
{
private int id;
private  String name;
private  int age;
private Department department;
public Student(int id,String name,int age,Department department)
{
this.id=id;
this.name=name;
this.age=age;
this.department=department;
}
public void setId(int studentId)
{
id=studentId;
}
public int getId()
{
return id;
}
public void setName(int studentName)
{
name=studentName;
}
public String getName()
{
return name;
}
public void setAge(int studentAge)
{
age=studentAge;
}
public int getAge()
{
return age;
}
public void setDepartment(Department department)
{
this.department=department;
}
public Department getDepartment()
{
return department;
}
}