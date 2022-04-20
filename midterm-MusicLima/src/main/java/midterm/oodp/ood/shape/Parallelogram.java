package midterm.oodp.ood.shape;

public class Parallelogram extends Shape {
	

	//TODO: create a constructor as state in the class diagram to set the value of base, height, and type name
	public Parallelogram (double base,double height ) {
		
		this.base=base;
		this.height=height;	
		this.typeName="Parallelogram";
	}
	
	//TODO: override method to calculate area of Parallelogram
	@Override
	public  double calulateArea() {
		
		return base*height;
	}
}
	

