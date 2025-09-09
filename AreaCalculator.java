public class AreaCalculator{
 public static void main(String[] args){
 
 //Area of circle:3.14*r^2
 double radius=7.0;
 double circleArea=Math.PI*radius*radius;
 System.out.println("Area of Circle=" +circleArea);
 
 //Area of Rectangle:length*breadth
 double length=10.0;
 double breadth=5.0;
 double rectangleArea=length*breadth;
 System.out.println("Area of Rectangle=" +rectangleArea);
 
 //Area of Square:side^2
 double side=6.0;
 double squareArea=side*side;
 System.out.println("Area of Square=" +squareArea);
 
 //Area of Triangle:0.5*base*height
 double base=8.0;
 double height=4.0;
 double triangleArea=0.5*base*height;
 System.out.println("Area of Triangle=" +triangleArea);
 }
} 