public class Main {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())){
            return true;
        }
        String rest=word.substring(1);
        String copy=word.toUpperCase();
        if (word.charAt(0)==copy.charAt(0) && rest.equals(rest.toLowerCase())){
            return true;
        }
        return false;
    }
}
