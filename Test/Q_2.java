package ShashiCricket;
import java.math.*;
class Point{
	  private int x, y;
	  public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  
	  public int getX() {
	    return x;
	  }
	  
	  public int getY() {
	    return y;
	  }
	  
	  public void setX(int x) {
	    this.x = x;
	  }
	  
	  public void setY(int y) {
	    this.y = y;
	  }
	  
	  public double distance() {
	    return Math.sqrt(x * x + y * y);
	  }
	  
	  public double distance(Point point) {
	    int x1 = this.x - point.x;
	    int y1 = this.y - point.y;
	    return Math.sqrt(x1 * x1 + y1 * y1);
	  }
	}

	public class Q_2 {
	  public static void main(String[] args) {
	    Point p1 = new Point(2, 3);
	    System.out.println("Distance from origin: " + p1.distance());
	    
	    Point p2 = new Point(5, 6);
	    System.out.println("Distance between point 1 and 2: " + p1.distance(p2));
	  }
	}