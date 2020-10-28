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

  public static double roundto10000(double x) {
    return Math.round(x * 10000) / 10000.0;
  }

  public String classify() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    if (a == b) {
      if (a == c) {
        return "equilateral";
      } else {
        return "isosceles";
      }
    } else {
      if (a == c || b == c) {
        return "isosceles";
      } else {
        return "scalene";
      }
    }
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }

  public Point getPoint(int x) {
    if (x == 0) {return v1;}
    else if (x == 1) {return v2;}
    else {return v3;}
  }
  public void setVertex(int x, Point p) {
    if (x == 0) {v1 = p;}
    else if (x == 1) {v2 = p;}
    else {v3 = p;}
  }
  public String toString() {
    String output = "v1(" + v1.getX() + "," + v1.getY() + ")\t";
    output += "v2(" + v2.getX() + "," + v2.getY() + ")\t";
    return output + "v3(" + v3.getX() + "," + v3.getY() + ")";
  }
}
