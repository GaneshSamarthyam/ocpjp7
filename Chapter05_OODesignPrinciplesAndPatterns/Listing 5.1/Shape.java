// Shape.java
// Shape is the base class for all shape objects; shape objects that are associated with 
// a parent shape object is remembered in the parentShape field 
public abstract class Shape {
	abstract double area();
	private Shape parentShape;
	public void setParentShape(Shape shape) {
		parentShape = shape;
	}
	public Shape getParentShape() {
		return parentShape;
	}
}