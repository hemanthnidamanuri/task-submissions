/**
 * 
 */
package java_prac;

/**
 * @author hemanth
 *
 */

class Shape {

	double area;

	double diameter;

	double perimeter;

	String color;

	String shape;

}

class Circle extends Shape {

	double radius = 10.00;

	public void area_circle() {

		area = Math.PI * radius * radius;

		System.out.println("area of a circle:" + area);
	}

	public void diameter_of_circle() {

		diameter = 2 * radius;
	}

	public void circumference_ofCircle() {

		double circumference = 2 * Math.PI * radius;

		System.out.println(circumference);
	}

	public void color_ofcircle() {

		color = "red";

		System.out.println(color);
	}

	public void shape_ofcircle() {
		
		shape = "round";
		
		System.out.println(shape);
	}
}

class Square extends Shape {
	int a = 2;

	public void area_square() {

		area = a * a;

		System.out.println("area of a square:" + area);
	}

	public void perimeter_ofsquare() {

		perimeter = 4 * a;

		System.out.println(perimeter);
	}

	public void color_ofsquare() {

		color = "blue";

		System.out.println(color);
	}

	public void shape_ofcsquare() {
		
		shape = "box";
		
		System.out.println(shape);
	}
}

class Triangle extends Shape {

	int base = 2, height = 3;

	int sidea = 1, sideb = 2;

	public void area_oftriangle() {

		area = 1 / 2 * base * height;

		System.out.println(area);
	}

	public void perimeter_ofTriangle() {

		perimeter = base + sidea + sideb;

		System.out.println(perimeter);
	}

	public void color_oftriangle() {

		color = "yellow";

		System.out.println(color);
	}

	public void shape_oftriangle() {
		
		shape = "triangleshape";
		
		System.out.println(shape);
	}
}

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cr = new Circle();
		cr.area_circle();cr.circumference_ofCircle();cr.diameter_of_circle();cr.color_ofcircle();
		cr.shape_ofcircle();
		Square sqr = new Square();
		sqr.area_square();sqr.color_ofsquare();sqr.perimeter_ofsquare();sqr.shape_ofcsquare();
		Triangle trng = new Triangle();
		trng.area_oftriangle();trng.color_oftriangle();trng.perimeter_ofTriangle();trng.shape_oftriangle();
	}

}
