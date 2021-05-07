
public class LineTester {

    public static void main(String[] args) {

        Point p1 = new Point(0,3);
        Point p2 = new Point(1,5);
        Line l1 = new Line(p1,p2 );
        System.out.println("Input: " + p1 + " and " + p2 + ". Output: " + l1);  //prints y = 2.0x + 3.0

        Line l2 = new Line(-0.5, 7);
        System.out.println("Input: " + -0.5 + " and " + 7 + ". Output: " + l2);  //prints y = -0.5x + 7.0

        Line l3 = new Line(2, -4);
        System.out.println("Input: " + 2 + " and " + -4 + ". Output: " + l3);  //prints y = 2.0x - 4.0

        System.out.println();
        System.out.println("x intercept of " + l1 + " is " + l1.getXintercept());	//prints -1.5

        System.out.println();

        Point p3 = l1.findIntersection(l2);
        System.out.println("Point of intersection of " + l1 + " and " + l2 + " is " + p3);	//prints (1.6, 6.2)

        System.out.println();

        System.out.println(l1 + " and " + l2 + " is parallel? " + l1.isParallel(l2)); //prints false


        System.out.println();
        System.out.println(l1 + " and " + l3 + " is parallel? " + l1.isParallel(l3)); //prints true

        System.out.println();
        System.out.println(l1 + " and " + l2 + " is perpendicular? " + l1.isPerpendicular(l2)); //prints true


        System.out.println();
        System.out.println("Point (2,7) on " + l1 + "? " + l1.isOnLine(new Point(2, 7))); //prints true

        System.out.println();
        System.out.println("Point (1, 2) on " + l1 + "? " + l1.isOnLine(new Point(1, 2))); //prints false
    }
}
