package practice;

class Point {

  int x, y;

  // Point(int x, int y) {
  //   this.x = x;
  //   this.y = y;
  // }

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
 
}

class Line {

  Point p1;
  Point p2;
  double len;
  public Line(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  double calculateLength() {
    return len=Math.sqrt(
      Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)
    );
  }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.len) ^ (Double.doubleToLongBits(this.len) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Line other = (Line) obj;
        return Double.doubleToLongBits(this.len) == Double.doubleToLongBits(other.len);
    }
    
  
}

public class LineComparison {

  public static void main(String[] args) {
    Point p1 = new Point();
    Point p2 = new Point();
    Line l1 = new Line(p1, p2);

    Point p3 = new Point();
    Point p4 = new Point();
    Line l2 = new Line(p3, p4);
    l1.p1.setX(2);
    l1.p1.setY(3);

    l1.p2.setX(6);
    l1.p2.setY(7);

    l2.p1.setX(10);
    l2.p1.setY(5);

    l2.p2.setX(14);
    l2.p2.setY(20);

    // Line l1 = new Line(new Point(12, 15), new Point(8, 6));

    // Line l2 = new Line(new Point(9, 18), new Point(16, 20));

    l1.calculateLength();
    l2.calculateLength();

    System.out.println(l1.len);
    System.out.println(l2.len);

    if(l1.equals(l2)){
      System.out.println("Both are equal");
    }else{
      System.out.println("Both are Not equal");
    }

    System.out.println(l1.hashCode());
    System.out.println(l2.hashCode());
  }
}
