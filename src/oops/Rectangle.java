package oops;
/**
 * Write a Java program to create a class called Shape with a method called getArea(). 
 * Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 */
class Shape{
	public void getArea() {
		System.out.println("this is where u insert the lenght and breath");
	}
}
public class Rectangle extends Shape {
	@Override
	public void getArea() {
		System.out.println("lenght and breath");
	}
}
