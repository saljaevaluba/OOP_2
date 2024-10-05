package shape;

public class Rectangle extends Shape{

    private Point pointFirst;
    private Point pointSecond;

    public Rectangle(){
        pointFirst = new Point();
        pointSecond = new Point();
        pointSecond.setX(1);
    }
    public Rectangle(Point pointFirst, Point pointSecond) throws Exception {
        validate(pointFirst, pointSecond);
        this.pointFirst = pointFirst;
        this.pointSecond = pointSecond;
    }
    public Point getPointFirst() {return pointFirst;}

    public Point getPointSecond() {return pointSecond;}

    public void setPointFirst(Point point) {this.pointFirst = point;}

    public void setPointSecond(Point point) {this.pointSecond = point;}

    private void validate(Point pointFirst, Point pointSecond) throws Exception {
        if(pointFirst.getX() == pointSecond.getX() && pointFirst.getY() == pointSecond.getY()) {throw new Exception("Ошибка создания фигуры: точки не могут совпадать!");}
    }

    private double getSectionLength(Point pointFirst, Point pointSecond)
    {
        return Math.sqrt(Math.pow(pointFirst.getX()-pointSecond.getX(), 2) + Math.pow(pointFirst.getY()-pointSecond.getY(), 2));
    }

    public void setArea() {
        super.setArea(0.5 * Math.pow(getSectionLength(pointFirst, pointSecond), 2));
    }

    public double getArea(){
        setArea();
        return super.getArea();
    }

    public void setPerimeter() {
        super.setPerimeter(2 * Math.sqrt(2) * getSectionLength(pointFirst, pointSecond));
    }

    public double getPerimeter(){
        setPerimeter();
        return super.getPerimeter();
    }

    @Override
    public void move(double moveX, double moveY){

        pointFirst.setX(pointFirst.getX() + moveX);
        pointFirst.setY(pointFirst.getY() + moveY);
        pointSecond.setX(pointSecond.getX() + moveX);
        pointSecond.setY(pointSecond.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура прямоугольник");
        System.out.println("Первая точка: (x = " + pointFirst.getX() + ", y = " + pointFirst.getY() + ")");
        System.out.println("Вторая точка: (x = " + pointSecond.getX() + ", y = " + pointSecond.getY() + ")");
        System.out.println("Площадь прямоугольника: " + getArea());
        System.out.println("Периметр прямоугольника: " + getPerimeter());
        System.out.println("Цвет прямоугольника: " + super.getColor());
        System.out.println();
    }

}
