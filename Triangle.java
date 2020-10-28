public class Triangle {
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle (Point v1,Point v2,Point v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }
  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getPoint(int x) {
    if (x == 1) {return v1;}
    else if (x == 2) {return v2;}
    else {return v3;}
  }
  public void setVertex(int x, Point p) {
    if (x == 1) {v1 = p;}
    else if (x == 2) {v2 = p;}
    else {v3 = p;}
  }
  public String toString() {
    String output = "V1: (" + v1.getX() + "," + v1.getY() + ")\t";
    output += "V2: (" + v2.getX() + "," + v2.getY() + ")\t";
    return output + "V3: (" + v3.getX() + "," + v3.getY() + ")";
  }
}
