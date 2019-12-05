import java.lang.*;
class Calculator
{
static double Powerint(int a,int b)
{
int x=a;
int y=b;
return Math.pow(x,y);
}
static double Powerdouble(double a,int b)
{
double x=a;
int y=b;
return Math.pow(x,y);
}
}
class Power
{
public static void main(String a[])
{
double x=Calculator.Powerint(2,4);
double y=Calculator.Powerdouble( 2.4,3);
System.out.println("x= "+x+"  y= "+y);
}}