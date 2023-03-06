package Rectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains (Point p) {
       boolean isXInside = p.getX() >= bottomLeft.getX() && p.getX() <= topRight.getX();
       boolean isYInside = p.getY() >= bottomLeft.getY() && p.getY() <= topRight.getY();

       return isXInside && isYInside;
    }

}
