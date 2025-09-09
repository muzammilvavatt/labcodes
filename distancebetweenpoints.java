                                                                                                                                                                                                                                                                                                                                                                               import java.util.Scanner;
public class distancebetweenpoints{
public static void main( String[]args)
{
Scanner sc=new
Scanner(System.in);
//input coordinates of first point
System.out.print("Enter x1:");
double x1=sc.nextDouble();
System.out.print("Entry y1:");
double y1=sc.nextDouble();

//input coordinates of second point
System.out.print("Enter x2:");
double x2=sc.nextDouble();
System.out.print("Enter y2:");
double y2=sc.nextDouble();

//calculate distance
double distance=
Math.sqrt(Math.pow((x2-x1),2)+
Math.pow((y2-y1),2));

//display result
System.out.println("distance between points="+distance);
sc.close();
}
}


