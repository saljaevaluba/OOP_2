import java.io.IOException;

/**
 * <b>Опрерации над векторами</b>
 * Класс Vector реализует приложения, которые
 * находят векторное и скалярное произведения двух векторов,
 * длину вектора, сумму и разность
 * двух векторов, произведения вектора на скаляр
 * и выводит результат на экран.
 * <p>
 *
 * @author shalyaevalyubov
 * @version 1.0
 * @since 2024-10-09
 */
public class Vector {



    private double x1 = 0;
    private double y1 = 0;

    /**
     * Конструктор, позволяющий задать
     * переменную класса Vector
     * через координаты вектора.
     *
     * @param x1 абсцисса вектора
     * @param y1 ордината вектора
     */
    public Vector(double x1, double y1)
    {
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     * Конструктор, позволяющий задать
     * переменную класса Vector
     * через координаты его начала и конца.
     *
     * @param x1 абсцисса начала вектора
     * @param y1 ордината начала вектора
     * @param x2 абсцисса конца вектора
     * @param y2 ордината конца вектора
     */
    public Vector(double x1, double y1, double x2, double y2)
    {
        this.x1 = x2 - x1;
        this.y1 = y2 - y1;
    }

    /**
     * Конструктор без параметров,
     * создающий нулевой вектор.
     */
    public Vector(){}

    /**
     * Метод, возращающий абсциссу вектора.
     * @return double - тип возвращаемого
     * значения абсциссы вектора.
     */
    public double getX1() {
        return x1;
    }

    /**
     * Метод, возращающий ординату вектора.
     * @return double - тип возвращаемого
     * значения ординаты вектора.
     */
    public double getY1() {
        return y1;
    }

    /**
     * Метод, позволяющий изменить абсциссу вектора.
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * Метод, позволяющий изменить ординату вектора.
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * Метод используется для нахождения
     * векторного произведения двух векторов.
     * Первый вектор - вектор, к которому применяют
     * метод, второй передаётся как параметр
     * метода.
     * @param vectorSecond второй вектор
     * @return double - тип возвращаемого
     * значения векторного произведения двух векторов.
     */
    public double vectorProduct(Vector vectorSecond) {
        return x1 * vectorSecond.getY1() - y1 * vectorSecond.getX1();
    }

    /**
     * Метод используется для нахождения
     * скалярного произведения двух векторов.
     * Первый вектор - вектор, к которому применяют
     * метод, второй передаётся как параметр
     * метода.
     * @param vectorSecond второй вектор
     * @return double - тип возвращаемого
     * значения скалярного произведения двух векторов.
     */
    public double dotProduct(Vector vectorSecond){
        return x1 * vectorSecond.getX1() + y1 * vectorSecond.getY1();
    }

    /**
     * Метод используется для нахождения
     * длины вектора, к которому применяется метод.
     * @return double - тип возвращаемого
     * значения длины вектора.
     */
    public double vectorLength() {
        return Math.sqrt(x1 * x1 + y1 * y1);
        //return Math.sqrt((new Vector(x1, y1)).dotProduct());
    }

    /**
     * Метод используется для умножения
     * вектора, к которму применяется
     * метод, на скаляр.
     */
    public void multiplicationByScalar(double number){
        x1 *= number;
        y1 *= number;
    }

    /**
     * Метод используется для нахождения
     * суммы двух векторов.
     * Первый вектор - вектор, к которому применяют
     * метод, второй передаётся как параметр
     * метода.
     * @param vectorSecond второй вектор
     * @return Vector - тип возвращаемого значения суммы двух векторов.
     */
    public Vector vectorSum(Vector vectorSecond) {
        return new Vector(x1 + vectorSecond.getX1(), y1 + vectorSecond.getY1());
    }

    /**
     * Метод используется для нахождения
     * разности двух векторов.
     * Первый вектор - вектор, к которому применяют
     * метод, второй передаётся как параметр
     * метода.
     * @param vectorSecond второй вектор
     * @return Vector - тип возвращаемого значения разности двух векторов.
     */
    public Vector vectorDifference(Vector vectorSecond) {
        return new Vector(x1 - vectorSecond.getX1(), y1 - vectorSecond.getY1());
    }

    /**
     * Метод используется для вывода
     * координат вектора на экран.
     */
    public void print()
    {
        System.out.println("(" + x1 + ", " + y1 + ")");
    }

    /**
     * Это основной метод использующий методы класса Vector.
     * @param args Не используется.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        Vector vectorFirst = new Vector(0, 0, 3, 3);
        Vector vectorSecond = new Vector();
        Vector vectorThird = new Vector(2, 3);

        System.out.println( "Векторным прозведением vectorFirst и vectorSecond является : " + vectorFirst.vectorProduct(vectorSecond));

        System.out.println("Скалярным прозведением vectorFirst и vectorSecond является : " +vectorFirst.dotProduct(vectorSecond));

        System.out.println( "Длиной vectorFirst является : " + vectorFirst.vectorLength());

        vectorFirst.multiplicationByScalar(3);
        System.out.print("Результатом умножения vectorFirst на число 3, является вектор с координатами :  ");
        vectorFirst.print();

        System.out.print("Результатом сложения vectorFirst и vectorSecond является вектор с координатами: ");
        vectorFirst.vectorSum(vectorSecond).print();

        System.out.print("Результатом разности vectorFirst и vectorSecond является вектор с координатами: ");
        vectorFirst.vectorDifference(vectorSecond).print();

    }

}
