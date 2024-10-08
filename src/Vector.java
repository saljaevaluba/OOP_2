public class Vector {

    private double x1 = 0;
    private double y1 = 0;

    public Vector(double x1, double y1)
    {
        this.x1 = x1;
        this.y1 = y1;
    }

    public Vector(double x1, double y1, double x2, double y2)
    {
        this.x1 = x2 - x1;
        this.y1 = y2 - y1;
    }

    public Vector(){}

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double vectorProduct(Vector vectorSecond) {
        return x1 * vectorSecond.getY1() - y1 * vectorSecond.getX1();
    }

    public double dotProduct(Vector vectorSecond){
        return x1 * vectorSecond.getX1() + y1 * vectorSecond.getY1();
    }

    public double vectorLength() {
        //return Math.sqrt(vector.getX1() * vector.getX1()+ vector.getY1() * vector.getY1());
        return Math.sqrt(new Vector(x1, y1).vectorLength());
    }

    public void multiplicationByScalar(double number){
        x1 *= number;
        y1 *= number;
    }

    public Vector vectorSum( Vector vectorSecond) {
        return new Vector(x1 + vectorSecond.getX1(), y1 + vectorSecond.getY1());
    }

    public Vector vectorDifference(Vector vectorSecond) {
        return new Vector(x1 - vectorSecond.getX1(), y1 - vectorSecond.getY1());
    }

    public static void main(String[] args){
        Vector vectorFirst = new Vector(0, 0, 3, 3);
        Vector vectorSecond = new Vector();
        //Vector vectorThird = new Vector(2, 3);

        System.out.println(vectorFirst.vectorProduct(vectorSecond));
        System.out.println(vectorFirst.dotProduct(vectorSecond));
        System.out.println(vectorFirst.vectorLength());
    }

}
