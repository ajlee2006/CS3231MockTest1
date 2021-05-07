public class Line {
    private double gradient, y_intercept;

    Line(Point p1, Point p2) {
        gradient = (p1.getY()-p2.getY())/(p1.getX()-p2.getX());
        // b = y - mx
        y_intercept = p1.getY() - gradient*p1.getX();
    }

    Line(double gradient, double y_intercept) {
        this.gradient = gradient;
        this.y_intercept = y_intercept;
    }

    public double getGradient() {
        return gradient;
    }

    public void setGradient(double gradient) {
        this.gradient = gradient;
    }

    public double getYintercept() {
        return y_intercept;
    }

    public void setYintercept(double y_intercept) {
        this.y_intercept = y_intercept;
    }

    public double getXintercept() {
        return -y_intercept/gradient;
    }

    public Point findIntersection(Line L1) {
        double x = (L1.getYintercept()-y_intercept)/(gradient-L1.getGradient());
        return new Point(x,gradient*x+y_intercept);
    }

    public boolean isParallel(Line L1) {
        return L1.getGradient() == gradient;
    }

    public boolean isPerpendicular(Line L1) {
        return L1.getGradient() == -1/gradient;
    }

    public boolean isOnLine(Point p) {
        return p.getY() == gradient*p.getX() + y_intercept;
    }

    @Override
    public String toString() {
        if (y_intercept < 0)
            return "y = " + gradient + "x - " + -y_intercept;
        return "y = " + gradient + "x + " + y_intercept;
    }
}
