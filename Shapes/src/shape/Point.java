package shape;
import color.Color;
class Point extends Shape{
    private double x = 0, y = 0;

    Point(){}

    Point(double x, double y, Color color)
    {
        this.x = x;
        this.y = y;
        this.setColor(color);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    public void draw()
    {
        draw();
    }
    public
}
