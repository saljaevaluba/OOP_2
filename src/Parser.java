import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class Parser {
    public void parse(/*String path*/) throws Exception {
        try (FileWriter writer = new FileWriter("Output.txt", false)) {
            try (FileReader myFile = new FileReader("C:\\Users\\shalyaevalyubov\\Desktop\\problems\\OOP_2\\src\\resource\\tasks.txt")) {
                int read;
                StringBuilder s = new StringBuilder();
                while ((read = myFile.read()) != -1) {
                    if ((char) read == '\n') {
                        if (s.toString().matches("^(Решите уравнение:)[\\s\\S]*")) {
                            char unknown = ' ';
                            char operation = ' ';
                            double sign = 1;
                            ArrayList<Double> numbers = new ArrayList<>();
                            int flag = 0;
                            for (int i = 0; i < s.length(); i++) {
                                if (String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                    double number = 0;
                                    while (i < s.length() && String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                        number *= 10;
                                        number += (s.charAt(i) - '0');
                                        i++;
                                    }
                                    numbers.add(number * sign);
                                    sign = 1;
                                } else if (String.valueOf(s.charAt(i)).matches("[a-z]|[A-Z]")) {
                                    if (numbers.isEmpty()) {
                                        flag = 1;
                                    } else if (numbers.size() == 1) {
                                        flag = 2;
                                    } else {
                                        flag = 3;
                                    }
                                    unknown = s.charAt(i);
                                } else if (String.valueOf(s.charAt(i)).matches("[+\\-/*]")) {
                                    if (s.charAt(i) == '-') {
                                        sign = -1;
                                        if (operation == ' ') operation = '+';
                                    } else operation = s.charAt(i);
                                }
                            }

                            Calculate calculate = new Calculate();
                            if (flag == 1) {
                                if (operation == '-') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(numbers.get(0), numbers.get(1))));
                                } else if (operation == '+') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(numbers.get(1), -numbers.get(0))));
                                } else if (operation == '*') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(1), calculate.division(numbers.get(0)))));
                                } else if (operation == '/') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(1), numbers.get(0))));
                                }
                            } else if (flag == 2) {
                                if (operation == '-') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(numbers.get(0), calculate.subtract(numbers.get(1)))));
                                } else if (operation == '+') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(calculate.subtract(numbers.get(1)), numbers.get(0))));
                                } else if (operation == '*') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(0), calculate.division(numbers.get(1)))));
                                } else if (operation == '/') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(0), calculate.division(numbers.get(1)))));
                                }
                            } else {
                                if (operation == '-') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(numbers.get(0), calculate.subtract(numbers.get(1)))));
                                } else if (operation == '+') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.add(numbers.get(1), numbers.get(0))));
                                } else if (operation == '*') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(1), numbers.get(0))));
                                } else if (operation == '/') {
                                    System.out.println(unknown + " = " + String.format("%.3f", sign * calculate.multiply(numbers.get(0), calculate.division(numbers.get(1)))));
                                }
                            }
                            s = new StringBuilder();
                        } else if (s.toString().matches("^(Найдите значение выражения:)[\\s\\S]*")) {
                            Calculate calculate = new Calculate();
                            Stack<Character> expression = new Stack<>();
                            Stack<Double> numbers = new Stack<>();
                            double sign = 1;
                            for (int i = 0; i < s.length(); i++) {
                                if (String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                    double number = 0;
                                    while (i < s.length() && String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                        number *= 10;
                                        number += (s.charAt(i) - '0');
                                        i++;
                                    }
                                    number *= sign;
                                    if (numbers.empty()) numbers.push(number);
                                    else {
                                        if (Objects.equals(expression.peek(), '*')) {
                                            expression.pop();
                                            numbers.push(calculate.multiply(number, numbers.pop()));
                                        } else if (Objects.equals(expression.peek(), '/')) {
                                            expression.pop();
                                            numbers.push(calculate.multiply(numbers.pop(), calculate.division(number)));
                                        } else {
                                            numbers.push(number);
                                        }
                                    }
                                    sign = 1;
                                } else if (String.valueOf(s.charAt(i)).matches("[a-z]|[A-Z]")) {
                                    throw new Exception("Ошибка валидации входных параметров");
                                } else if (String.valueOf(s.charAt(i)).matches("[+\\-/*]")) {
                                    if (s.charAt(i) == '-') {
                                        sign = -1;
                                        expression.push('+');
                                    } else {
                                        expression.push(s.charAt(i));
                                    }
                                }
                            }
                            while (!expression.empty()) {
                                if (expression.peek() == '+') {
                                    expression.pop();
                                    numbers.push(calculate.add(numbers.pop(), numbers.pop()));
                                }
                            }
                            System.out.println("Значение выражения: " + String.format("%.3f", numbers.pop()));
                            s = new StringBuilder();
                        } else if (s.toString().matches("^(Найдите решение квадратного уравнения:)[\\s\\S]*")) {
                            ArrayList<Double> numbers = new ArrayList<>();
                            double sign = 1;
                            int degree = 0;
                            for (int i = 0; i < s.length(); i++) {
                                if (String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                    double number = 0;
                                    while (i < s.length() && String.valueOf(s.charAt(i)).matches("[0-9]")) {
                                        number *= 10;
                                        number += (s.charAt(i) - '0');
                                        i++;
                                    }
                                    number *= sign;
                                    numbers.add(number);
                                    sign = 1;
                                } else if (String.valueOf(s.charAt(i)).matches("[a-z]|[A-Z]")) {
                                    degree++;
                                    if (degree != numbers.size()) numbers.add(sign);
                                    if (degree == 1) {
                                        while (s.charAt(i) != '2') {
                                            i++;
                                        }
                                    }
                                } else if (String.valueOf(s.charAt(i)).matches("[+\\-/*]")) {
                                    if (s.charAt(i) == '-') {
                                        sign = -1;
                                    }
                                }
                            }
                            DiscriminantCalculator discriminantCalculator = new DiscriminantCalculator();
                            Calculate calculate = new Calculate();
                            double discriminant = discriminantCalculator.calculateDiscriminant(numbers.get(0), numbers.get(1), numbers.get(2));
                            if (discriminant < 0)
                                System.out.println("Корней нет значение дискриминанта меньше нуля: " + discriminant);
                            else
                                System.out.println("x1 = " + String.format("%.3f", calculate.multiply(-numbers.get(1) - Math.sqrt(discriminant), calculate.division(2 * numbers.get(0))))
                                        + ", x2 = " + String.format("%.3f", calculate.multiply(-numbers.get(1) + Math.sqrt(discriminant), calculate.division(2 * numbers.get(0)))));
                            s = new StringBuilder();
                        } else {
                            //s = new StringBuilder();
                            throw new Exception("Ошибка валидации входных параметров");
                        }
                    } else s.append((char) read);
                }
            } catch (IOException ex) {
                throw new Exception("Файл C:\\Users\\shalyaevalyubov\\Desktop\\problems\\OOP_2\\src\\resource\\tasks.txt не найден");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}