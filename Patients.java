import java.util.*;
class Patient 
{
String name;
double height,weigth;
public double BMI()
{
return (weigth/(height*height))*703;
}

}
class Patients
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
Patient p1=new Patient();
System.out.println("enter name");
p1.name=sc.nextLine();
System.out.println("enter weigth in pounds");
p1.weigth=sc.nextDouble();
System.out.println("enter height in inches");
p1.height=sc.nextDouble();

System.out.print("bmi is "+p1.BMI());


}
}