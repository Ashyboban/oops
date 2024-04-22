public class Complex
{
int r,i;
void read(int r1,int r2)
{
r=r1;
i=r2;

}
void display()
{
System.out.println(r+"+"+i+"i");
}
static void add(int r1,int r2,int i1,int i2)
{
int r=r1+r2;
int i=i1+i2;
System.out.println(r+"+"+i+"i");
}
public static void main(String[] args)
{
System.out.print("Name:Ashy Boban \nRollno:21\nDate:14/02/2024 \n");
System.out.println("3. Add complex numbers");
Complex obj1=new Complex();
Complex obj2=new Complex();
obj1.read(4,5);
obj2.read(3,5);
obj1.display();
obj2.display();
add(obj1.r,obj2.r,obj1.i,obj2.i);
}
}
