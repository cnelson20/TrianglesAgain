public class Tester {
  public static void main (String[] args) {
    Triangle t1 = new Triangle(0,0,0,3,4,0);
    System.out.println(t1);
    System.out.println("Perimeter: " + t1.getPerimeter());
    System.out.println("Area: " + t1.getArea());
    System.out.println(t1.classify());
    Triangle t2 = new Triangle(0,0,0,1,1,0);
    System.out.println("\nt2:" + t2.classify());
    System.out.println(t2);
    System.out.println("Perimeter: " + t2.getPerimeter());
    System.out.println("Area: " + t2.getArea());
    System.out.println("\npoint tester");
    Point p = new Point(5,8);
    System.out.println(p);
    System.out.println("Distance from 0: " + p.distanceTo(new Point(0,0)));

  }
}
