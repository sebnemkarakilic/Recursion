public class Palindrome {
    public void computePalindrome() {
        System.out.println("moon: " + isPalindrome("moon"));
        System.out.println("noon: " + isPalindrome("noon"));
        System.out.println("a: " + isPalindrome("a"));
        System.out.println("aba: " + isPalindrome("aba"));
        System.out.println("sa: " + isPalindrome("sa"));
    }

    public boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
