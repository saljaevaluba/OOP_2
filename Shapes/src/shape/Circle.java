package shape;

import color.Color;

public class Circle extends Shape{

    private Point point;
    private double radius;

    Circle(){
        point = new Point();
        radius = 1;
    }
    Circle(Point point, double radius){
        if(validate()) {
            this.radius = radius;
            this.point = point;
        }
    }
    public Point getPoint() {return point;}

    public void setPoint(Point point) {this.point = point;}

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    private boolean validate() {
        if(radius <= 0) {throw new NullPointerException("Ошибка создания фигуры: радиус не может быть меньше или равным нуля!");}
        return true;
    }

    public void setArea() {
        super.setArea(Math.PI * radius * radius);
    }

    public void setPerimeter() {
        super.setPerimeter(Math.PI * 2 * radius);
    }

    @Override
    public void draw() {
        System.out.println("Фигура круг");
        System.out.println("Центр круга: (x = " + point.getX() + ", y = " + point.getY() + ")");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + super.getArea());
        System.out.println("Периметр круга: " + super.getPerimeter());
        System.out.println("Цветкруга: " + super.getColor());
    }
}
