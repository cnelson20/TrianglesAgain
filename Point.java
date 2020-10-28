public class Point {
  private double X,Y;

  public Point(double X, double Y) {
    this.X=X;
    this.Y=Y;
  }
  public Point(Point p) {
    X = p.X;
    Y = p.Y;
  }
  public double getX() {
    return X;
  }
  public double getY() {
    return Y;
  }

  public Point copy() {
    return new Point(X,Y);
  }

  public String toString() {
    return "X:" + X + "\tY:" + Y;
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
  }

  public double distanceTo(Point otherPoint) {
    return Math.sqrt(Math.pow(X - otherPoint.getX(),2) + Math.pow(Y - otherPoint.getY(),2));
  }
  public boolean equals(Point otherPoint) {
    return (X == otherPoint.getX() && Y == otherPoint.getY());
  }
}
