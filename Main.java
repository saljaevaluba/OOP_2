import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //a)
        OnePoint onePoint = new OnePoint();
        onePoint.getAnswer();
        //b)
        MidleOfString midleOfString = new MidleOfString();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        midleOfString.getAnswer(str);
        //c)
        str = in.nextLine();
        MonotonousString monotonousString = new MonotonousString();
        monotonousString.getAnswer(str);
        //d)
        str = in.nextLine();
        OnlyLetters onlyLetters = new OnlyLetters();
        onlyLetters.getAswer(str);

        in.close();
    }
}
