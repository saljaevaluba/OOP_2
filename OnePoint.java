public class OnePoint {
    public void getAnswer()
    {
        for(int i = 0; i <= 300; i += 4)
        {
            if(i%6 != 0 && (i%10+ i/10%10 + i/100) < 10)System.out.print(i + " ");
        }
        System.out.println("");
    }
}

