package midterm.oodp.ood.shape;

public abstract class Shape {
	protected String typeName;
	protected double base;
	protected double height;
	
	
	public abstract double calulateArea();


	public String getTypeName() {
		return typeName;
	}


	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}
	
	

}
