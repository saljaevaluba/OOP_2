import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        OnePoint onePoint = new OnePoint();
        onePoint.getAnswer();

        MidleOfString midleOfString = new MidleOfString();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        midleOfString.getAnswer(str);


    }
}
