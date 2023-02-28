package March_1st;
// 	Ques 3
/* 	Create an abstract class called "Shape" with an abstract 
 * 	method called "calculateArea". Create two subclasses called 
 * 	"Circle" and "Rectangle" that inherit from Shape and implement 
 * 	the "calculateArea" method. Create objects of both the Circle and 
 * 	Rectangle classes and call their respective "calculateArea" methods. 
 */
abstract class Shape1 { // abstract class 
	abstract void calculateArea(); // abstraction method 
}
class Circle1 extends Shape1 {	// sub class Circle1 inherits from Shape1
	@Override
	void calculateArea() {
		int radius=5;
		double Area=3.14*5*5;
		System.out.println("Area of circle for radius "+radius+" is: "+Area);
	}	
}
class Rectangle extends Shape1 { // sub class Rectangle inherits from Shape1
	@Override
	void calculateArea() {
		int l=10;
		int b=5;
		System.out.println("Area of rectangle for length "+l+" & breadth "+b+" is: "+(l*b));
	}
}
public class Shape_Abstract { // main class 
	public static void main(String[] args) {
		Shape1 d=new Circle1(); // object for Circle1
		d.calculateArea();
		Shape1 d1=new Rectangle(); // object for Rectangle
		d1.calculateArea();	
}
}
