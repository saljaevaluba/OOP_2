public class OnlyLetters {
    private boolean onlyLetters(String str)
    {
        for(int i = 0; i < str.length(); i ++)
        {
            if(!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))) return false;
        }
        return true;
    }
    public void getAswer(String str)
    {
        str += " ";
        int ans = 0;
        String word = "";
        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == ' ') {
                if(onlyLetters(word)) ans ++;
                word = "";
            } else word += str.charAt(i);
        }
        System.out.println(ans);
    }
}
