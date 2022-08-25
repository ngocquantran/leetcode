public class Main {
    public static void main(String[] args) {
        String s="abcde";
        s=s.substring(2)+s.substring(0,2);
        System.out.println(s);

    }
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length()) return false;
        if (s.length()==1 && goal.length()==1) return s.equals(goal);equals(goal.substring(1,goal.length()-1));
        for (int i=0;i<s.length()-2;i++){
            s=s.substring(1)+s.substring(0,1);
            if (s.equals(goal)) return true;
        }
        return false;

    }
}
