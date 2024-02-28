package module7.WordCombine;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {
        if (sourceWord.length() < targetWord.length()) {
            return false;
        }

        int[] charCount = new int[26];
        for (char c : sourceWord.toLowerCase().toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : targetWord.toLowerCase().toCharArray()) {
            if (charCount[c - 'a']-- <= 0) {
                return false;
            }
        }

        return true;
    }
}