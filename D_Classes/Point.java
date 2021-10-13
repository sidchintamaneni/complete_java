
public class Point{

	private int x;
	private int y;

	public Point(){	
		this.x = 0;
		this.y = 0;
	}

	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int get_x(){
		return this.x;
	}
	
	public int get_y(){
		return this.y;
	}

	public void set_x(int x){
		this.x = x;
	}

	public void set_y(int y){
		this.y = y;
	}

	public String toString(){
		return "Point is "+this.x+","+this.y;
	}

	public static void main(String[] args){
		Point p = new Point();
		p.set_x(10);
		p.set_y(10);
		System.out.println(p);
	}
}
