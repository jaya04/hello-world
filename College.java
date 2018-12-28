import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
import javax.swing.JOptionPane;

class CollegeDetail
{
static
{
System.out.println("Welcome!");
Date date=new Date();
System.out.println(date);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
out.println("Enter the registration number");
int regNo=sc.nextInt();
out.println("The registration number is"+regNo);
}
}
