package shape;

public class Point extends Shape{

    private double x = 0, y = 0;

    public Point() {}

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public double getY() {return y;}

    public void setX(double x) {this.x = x;}

    public void setY(double y) {this.y = y;}

    @Override
    public void draw() {
        System.out.println("Фигура точка");
        System.out.println("Коордтнаты: (x = " + x + ", y = " + y + ")");
        System.out.println("Цвет точки:" + getColor());
        System.out.println();
    }

    @Override
    public void move(double moveX, double moveY) {
        x = x + moveX;
        y = y + moveY;
    }

}
