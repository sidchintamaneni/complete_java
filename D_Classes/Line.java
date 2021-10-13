
public class Line{

	private Point p1;
	private Point p2;

	public Line(Point p1,Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point midPoint(){
		Point mid;
		int x = ((this.p1.get_x()) + (this.p2.get_x()))/2;
		int y = ((this.p1.get_y()) + (this.p2.get_y()))/2;
		mid = new Point(x,y);
		return mid;
	}
	
	public static void main(String[] args){
		Line l1 = new Line(new Point(0,0), new Point(2,2));
		System.out.println(l1.midPoint().get_x()+" "+l1.midPoint().get_y());
	}


}
