public class MonotonousString {
    private int getCountLetter(String str) {
        boolean[] letters = new boolean[26];
        int countLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            int id = str.charAt(i) - 'a';
            if (!letters[id]) countLetters++;
            letters[id] = true;
        }
        return countLetters;
    }
    public void getAnswer(String str)
    {
        str += " ";
        String ans = "";
        int minCount = -1;
        String word = "";
        for(int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == ' ') {
                int curCount = getCountLetter(word);
                if (minCount == -1 || minCount > curCount) {
                    minCount = curCount;
                    ans = word;
                }
                word = "";
            } else word += str.charAt(i);
        }
        System.out.println(ans);
    }
}
