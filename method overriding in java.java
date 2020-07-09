class phone
{
public void display()
{
System.out.println("Phone is ringing");
}
}
class display1 extends phone
{
public void display()
{
System.out.println("phone is vibrating");
}
public static void main(String[] args)
{
phone obj=new phone();
obj.display();
display1 obj1=new display1();
obj1.display();
}
}