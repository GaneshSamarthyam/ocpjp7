// Circles.java
package graphicshape;

class Circles {
	void getArea() {
		Circle  circle = new Circle();
		circle.area();	// call to public method area() within package
		circle.fillColor();	// call to a method with default access modifier within package
	}
}
