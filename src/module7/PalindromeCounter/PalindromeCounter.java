package module7.PalindromeCounter;

public  class PalindromeCounter {

    public int count(String phrase) {
        int count = 0;
        for (String word : phrase.split(" ")) {
            if (isPalindrome(word.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}