package midterm.oodp.ood.shape;

public class Triangle extends Shape{
	
	// TODO: create a constructor as state in the class diagram to set the value of
    // base, height, and type name
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.typeName = "Triangle";
    }

    // TODO: override method to calculate area of triangle
    @Override
    public double calulateArea() {
        return base*height/2;
    }
}
