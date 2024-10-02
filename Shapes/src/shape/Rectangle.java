package shape;

public class Rectangle extends Shape{

    private Point pointFirst;
    private Point pointSecond;

    Rectangle(){
        pointFirst = new Point();
        pointSecond = new Point();
        pointSecond.setX(1);
    }
    Rectangle(Point pointFirst, Point pointSecond){
        if(validate()) {
            this.pointFirst = pointFirst;
            this.pointSecond = pointSecond;
        }
    }
    public Point getPointFirst() {return pointFirst;}

    public Point getPointSecond() {return pointSecond;}

    public void setPointFirst(Point point) {this.pointFirst = point;}

    public void setPointSecond(Point point) {this.pointSecond = point;}

    private boolean validate() {
        //я знаю, что exception неправильный
        if(pointFirst.getX() == pointSecond.getX() || pointFirst.getY() == pointSecond.getY()) {throw new NullPointerException("Ошибка создания фигуры: точки не могут лежать на одной прямой!");}
        return true;
    }

    public void setArea() {
        super.setArea(Math.abs(pointFirst.getX() - pointSecond.getX()) * Math.abs(pointFirst.getY() - pointSecond.getY()));
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
