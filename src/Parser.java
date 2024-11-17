import java.io.*;
import java.util.regex.Pattern;

public class Parser {
    public void parse(/*String path*/) throws IOException, Exception {
        try(FileReader myFile = new FileReader("C:\\Users\\shalyaevalyubov\\Desktop\\problems\\OOP_2\\src\\resource\\tasks.txt")){
            int read;
            String s = "";
            while((read = myFile.read()) != -1){
                if((char)read == '\n')
                {
                    if(s.matches("^((Решите уравнение:){1}).")){

                    }
                    else if(s.matches("^((Найдите значение выражения:){1}).")){

                    }
                    else if(s.matches("^((Найдите решение квадратного уравнения:){1}).")){

                    }
                    else{
                        throw new Exception("Ошибка валидации входных параметров");
                    }
                }
                else s += (char)read;

            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}