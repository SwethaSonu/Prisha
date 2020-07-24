import java.util.*;
class Circle
{
double a,r;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter r :");
r=sc.nextDouble();
}
void process()
{
a=Math.PI*r*r;
}
void output()
{
System.out.println("area of Circle="+a);
}
}
class Cylinder extends Circle
{
double v,h;
void input()
{
Scanner sc=new Scanner(System.in);
super.input();
System.out.println("Enter h :");
h=sc.nextDouble();
}
void process()
{
super.process();
v=a*h;
}
void output()
{
System.out.println("vol of Cylinder="+v);
}
}
class Sphere extends Circle
{
double v;
void process()
{
super.process();
v=4*a*r/3;
}
void output()
{
System.out.println("vol 0f Sphere= "+v);
}
}
class Testing
{
public static void main(String arg[])
{
Cylinder c=new Cylinder();
c.input();
c.process();
c.output();
Sphere s=new Sphere();
s.input();
s.process();
s.output();
}
}
