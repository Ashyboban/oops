import java.util.Scanner;
public class shape
{
void area(int l)
{
int area_val=3.14*r*r;
System.out.println("area of circle is:"+area_val);
}
}
void area(int l,int b)
{
int area_val=l*b;
System.out.println("area of rectangle is:"+area_val);
}
void area(int l,int b,int h)
{
int area_val=l*b*h;
System.out.println("area of cuboid is:"+area_val);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner();
System.out.println("enter the length");
int l=sc.nextInt();
System.out.println("enter the breadth");
int b=sc.nextInt();
System.out.println("enter the height");
int h=sc.nextInt();
shape obj=new shape();
obj.area(l);
obj.area(l,b);
obj.area(l,b,h);
}
}
