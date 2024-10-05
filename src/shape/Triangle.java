package shape;

public class Triangle extends Shape {
    private Point pointFirst;
    private Point pointSecond;
    private Point pointThird;

    public Triangle(){
        pointFirst = new Point();
        pointSecond = new Point();
        pointSecond.setX(1);
        pointThird = new Point();
        pointSecond.setY(1);
    }

    public Triangle(Point pointFirst, Point pointSecond, Point pointThird) throws Exception {
        validate(pointFirst, pointSecond, pointThird);
        this.pointFirst = pointFirst;
        this.pointSecond = pointSecond;
        this.pointThird = pointThird;
    }

    public Point getPointFirst() {return pointFirst;}

    public Point getPointSecond() {return pointSecond;}

    public Point getPointThird() {return pointThird;}

    public void setPointFirst(Point pointFirst) {this.pointFirst = pointFirst;}

    public void setPointSecond(Point pointSecond) {this.pointSecond = pointSecond;}

    public void setPointThird(Point pointThird) {this.pointThird = pointThird;}

    //точки не лежат на одной прямой
    private void validate(Point pointFirst, Point pointSecond, Point pointThird) throws Exception {
        Point vec1 = new Point(pointFirst.getX() - pointSecond.getX(), pointFirst.getY() - pointSecond.getY());
        Point vec2 = new Point(pointFirst.getX() - pointThird.getX(), pointFirst.getY() - pointThird.getY());
        if(vec1.getX() * vec2.getY() - vec1.getY() * vec2.getX() == 0) {throw new Exception("Ошибка создания фигуры: точки не могут лежать на одной прямой!");}
    }

    private double getSectionLength(Point pointFirst, Point pointSecond)
    {
        return Math.sqrt(Math.pow(pointFirst.getX()-pointSecond.getX(), 2) + Math.pow(pointFirst.getY()-pointSecond.getY(), 2));
    }

    public void setArea() {
        super.setArea(getPerimeter() / 2 * (getPerimeter() / 2 - getSectionLength(pointFirst, pointSecond)) * (getPerimeter() / 2 - getSectionLength(pointFirst, pointThird)) * (getPerimeter() / 2 - getSectionLength(pointSecond, pointThird)));
    }

    public double getArea(){
        setArea();
        return super.getArea();
    }

    public void setPerimeter() {
        super.setPerimeter(getSectionLength(pointFirst, pointSecond) + getSectionLength(pointFirst, pointThird) + getSectionLength(pointSecond, pointThird));
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
        pointThird.setX(pointThird.getX() + moveX);
        pointThird.setY(pointThird.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура треугольник");
        System.out.println("Первая точка: (x = " + pointFirst.getX() + ", y = " + pointFirst.getY() + ")");
        System.out.println("Вторая точка: (x = " + pointSecond.getX() + ", y = " + pointSecond.getY() + ")");
        System.out.println("Третья точка: (x = " + pointThird.getX() + ", y = " + pointThird.getY() + ")");
        System.out.println("Площадь треугольника: " + getArea());
        System.out.println("Периметр треугольника: " + getPerimeter());
        System.out.println("Цвет треугольника: " + super.getColor());
        System.out.println();
    }

}
