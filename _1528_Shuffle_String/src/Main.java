public class Main {
    public static void main(String[] args) {

    }
    public String restoreString(String s, int[] indices) {
        char[] chars=s.toCharArray();
        for(int i=0;i< indices.length;i++){
            chars[indices[i]]=s.charAt(i);
        }
        StringBuilder result=new StringBuilder();
        for (int i=0;i< chars.length;i++){
            result.append(chars[i]);
        }
        return result.toString();

    }
}
