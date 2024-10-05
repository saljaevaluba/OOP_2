package shape;

import color.Color;

public abstract class Shape {

    private Color color = Color.TRANSPARENT;
    private double area = 0;
    private double perimeter = 0;

    public Color getColor() {return color;}

    public void setColor(Color color) {this.color = color;}

    public double getArea() {return area;}

    public void setArea(double area) {this.area = area;}

    public void setPerimeter(double perimeter) {this.perimeter = perimeter;}

    public double getPerimeter() {return perimeter;}

    public void move(double moveX, double moveY) {}

    public void draw() {}
}
