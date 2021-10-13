
public class Circle extends Shape{
	public double radius;
	
	public Circle(){
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	@Override
	public double getArea(){
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getPerimeter(){
		return Math.PI * 2 * this.radius;
	}
	
	@Override
	public String toString(){
		return this.color+" "+this.radius+" "+this.filled;
	}

	public static void main(String args[]){
		Shape s1 = new Circle();
		System.out.print(s1.getArea()+" "+s1.getPerimeter());
	}
}
		
