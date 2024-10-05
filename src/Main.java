import color.Color;
import shape.Circle;
import shape.Point;
import shape.Rectangle;
import shape.Triangle;
import shape.Shape;
import service.impl.ShapesServiceImpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


public class Main {
    public static void checkCircle(double x, double y) throws Exception {
        Point point = new Point(x, y);
        Circle circle = new Circle(point, 1);
        circle.draw();

        circle.setColor(Color.RED);
        circle.setPoint(new Point(2, 2));
        circle.move(1, 1);
        circle.draw();
    }

    public static void checkRectangle(double x1, double y1, double x2, double y2) throws Exception {
        Point pointFirst = new Point(x1, y1);
        Point pointSecond = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(pointFirst, pointSecond);
        rectangle.draw();

        rectangle.setColor(Color.RED);
        rectangle.setPointFirst(new Point(2, 2));
        rectangle.move(1, 1);
        rectangle.draw();
    }

    public static void checkTriangle(double x1, double y1, double x2, double y2, double x3, double y3) throws Exception {
        Point pointFirst = new Point(x1, y1);
        Point pointSecond = new Point(x2, y2);
        Point pointThird = new Point(x3, y3);
        Triangle triangle = new Triangle(pointFirst, pointSecond, pointThird);
        triangle.draw();

        triangle.setColor(Color.RED);
        triangle.setPointFirst(new Point(2, 2));
        triangle.move(1, 1);
        triangle.draw();
    }

    public static void main(String[] args) throws Exception {
        checkCircle(2, 1);
        checkRectangle(0, 0, 0, 1);
        checkTriangle(0, 0, 0, 1, 1, 1);

        List<Shape> shapes = new ArrayList<>();

        Triangle triangleOne = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));
        triangleOne.setColor(Color.RED);

        shapes.add(triangleOne);

        Circle circleOne = new Circle(new Point(3, 3), 2);
        circleOne.setColor(Color.WHITE);

        shapes.add(circleOne);

        Circle circleTwo = new Circle(new Point(2, 5), 4);
        circleTwo.setColor(Color.YELLOW);

        shapes.add(circleTwo);

        Rectangle rectangle = new Rectangle(new Point(1, 1 ), new Point(5, 2));

        shapes.add(rectangle);

        Point point = new Point(100, 100);

        shapes.add(point);

        Triangle triangle = new Triangle(new Point(-2, 3), new Point(4, 3), new Point(2, 5));
        triangle.setColor(Color.BLUE);

        shapes.add(triangle);
        ShapesServiceImpl impl = new ShapesServiceImpl();
        System.out.println(impl.getSquares(shapes));
        System.out.println(impl.getMaxPerimetrs(shapes));
        System.out.println(impl.getColors(shapes));
    }
}