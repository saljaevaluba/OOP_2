package shape;

public class Circle extends Shape{

    private Point point;
    private double radius;

    public Circle(){
        point = new Point();
        radius = 1;
    }
    public Circle(Point point, double radius) throws Exception {
        this.validate(radius);
        this.radius = radius;
        this.point = point;
    }
    public Point getPoint() {return point;}

    public void setPoint(Point point) {this.point = point;}

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    private void validate(double radius) throws Exception{
        if(radius <= 0) throw new java.lang.Exception("Ошибка создания фигуры: радиус не может быть меньше или равным нуля!");
    }

    public void setArea() {
        super.setArea(Math.PI * radius * radius);
    }

    public double getArea(){
        setArea();
        return super.getArea();
    }

    public void setPerimeter() {
        super.setPerimeter(Math.PI * 2 * radius);
    }

    public double getPerimeter(){
        setPerimeter();
        return super.getPerimeter();
    }
    @Override
    public void move(double moveX, double moveY)
    {
        point.setX(point.getX() + moveX);
        point.setY(point.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура круг");
        System.out.println("Центр круга: (x = " + point.getX() + ", y = " + point.getY() + ")");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + getArea());
        System.out.println("Периметр круга: " + getPerimeter());
        System.out.println("Цвет круга: " + super.getColor());
        System.out.println();
        System.out.println();
    }
}
