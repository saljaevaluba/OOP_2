import java.io.IOException;

/**
 * <b> Сложение двух чисел </b>
 * Класс Number реализует приложение, которое
 * складывает два заданных целых числа и выводит
 * результат на экран.
 * <p>
 * <b>Примечание:</b> Здесь может быть ваше причечание.
 *
 * @author shalyaevalyubov
 * @version 1.0
 * @since 2023-10-08
 */

public class Number {
    /**
     * Метод использутся для сложения двух целых чисел. Это
     * простейшая форма метода класса, просто чтобы
     * показать использование различных тегов javadoc.
     * @param numberFirst первый параметр метода sum
     * @param numberSecond второй параметр метода sum
     * @return int - тип возвращаемогозначения суммы numberFirst и numberSecond.
     */
    int sum(int numberFirst, int numberSecond){
        return numberFirst + numberSecond;
    }

    /**
     * Это основной метод, использующий метод sum.
     * @param args Не используется
     * @throws IOException При ошибке ввода.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        Number number = new Number();
        int sum = number.sum(10, 20);
        System.out.println("Суммой 10 и 20 является:" + sum);
    }

}
