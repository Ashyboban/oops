import java.util.Scanner;
public class Matrix
{
public static void main(String[] arg)
{
int n,m,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Name:Ashy Boban\n rollno:21\nDate:13/02/2024");
System.out.println("Read 2 matrices from the console and perform matrix addition.");
System.out.println("enter the rows");
n=in.nextInt();
System.out.println("enter the column");
m=in.nextInt();
int mat1[][]=new int[n][m];
int mat2[][]=new int[n][m];						
int res[][]=new int[n][m];
System.out.println("enter the matrix1");						
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
mat1[i][j]=in.nextInt();
}
}
System.out.println("enter the matrix2");						
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
mat2[i][j]=in.nextInt();

}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
res[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.println("sum:\n");						
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(res[i][j]+" ");		

}
System.out.println();										
}
}
}
