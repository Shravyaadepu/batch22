class Circle
{
private int radius;
public void setRadius(int r)
{
radius=r;
}
public int getRadius()
{
return radius;
}
public double area()
{
return 3.14*radius*radius;
}
public static void main(String args[])
{
Circle circle=new Circle();
circle.setRadius(3);
System.out.print("area of "+circle.area());
}
}