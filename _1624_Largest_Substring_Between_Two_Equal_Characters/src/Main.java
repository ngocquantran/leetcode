public class Main {
    public static void main(String[] args) {

    }
    public int maxLengthBetweenEqualCharacters(String s) {
//        int firstIndex=0, lastIndex=0;
        int maxLength=-1;
        for(int i=0;i<s.length();i++){
            if (s.lastIndexOf(s.charAt(i))-s.indexOf(s.charAt(i))-1>maxLength){
                maxLength=s.lastIndexOf(s.charAt(i))-s.indexOf(s.charAt(i))-1;
            }
        }
        return maxLength;

    }
}
