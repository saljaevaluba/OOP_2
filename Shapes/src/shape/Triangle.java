package shape;

public class Triangle extends Shape {
    private Point pointFirst;
    private Point pointSecond;
    private Point pointThird;

    Triangle(){
        pointFirst = new Point();
        pointSecond = new Point();
        pointSecond.setX(1);
        pointThird = new Point();
        pointSecond.setY(1);
    }

    Triangle(Point pointFirst, Point pointSecond, Point pointThird){
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
    private boolean validate() {
        //я знаю, что exception неправильный
        if(pointFirst.getX() == pointSecond.getX() || pointFirst.getY() == pointSecond.getY()) {throw new NullPointerException("Ошибка создания фигуры: точки не могут лежать на одной прямой!");}
        return true;
    }

    public void setArea() {
        super.setArea(getPerimeter()/2 * (getPerimeter() - ));
    }

    public void setPerimeter() {
        super.setPerimeter(2 * Math.abs(pointFirst.getX() - pointSecond.getX()) + 2 * Math.abs(pointFirst.getY() - pointSecond.getY()));
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
        System.out.println("Цветкруга: " + super.getColor());
    }

}
