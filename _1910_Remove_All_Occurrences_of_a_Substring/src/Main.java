public class Main {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s,part).toString());


    }
    public static String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if (sb.length()>=part.length() && sb.lastIndexOf(part)==sb.length()-part.length()){
                sb.delete(sb.lastIndexOf(part),sb.length());
            }
        }
        return sb.toString();

    }
}
