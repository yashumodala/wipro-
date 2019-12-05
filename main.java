import java.util.*;
class box
{
public double width,height,depth;
public void putdim(double a,double b,double c)
{
width=a;
height=b;
depth=c;
}
public double volume()
{
double v= width*height*depth;

return v;}
}
class main
{
public static void main(String a[])
{

box b=new box();
b.putdim(10,20,30);
System.out.println("volume is  "+b.volume());
}


}