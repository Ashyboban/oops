import java.util.Scanner;

public class String
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the string");
String str1=sc.nextLine();
System.out.println("length of string:" + str1.length());
System.out.println("char at postion 1:" + str1.charAt(1));
System.out.println("string contains:" + str1.contains("hello"));
System.out.println("string endswith:" + str1.endsWith("ld"));
System.out.println("string replace:" + str1.replaceAll("hello","hi"));
System.out.println("string lowercase:" + str1.toLowerCase());
System.out.println("string uppercase:" + str1.toUpperCase());
}
}
