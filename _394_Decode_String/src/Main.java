public class Main {
    public static void main(String[] args) {
        String s = "3[a10[bc]]";
//        String str="3\\[a\\]";
//        StringBuilder sb=new StringBuilder();
//        sb.append('a');
//        sb.append('a');
//        sb.append('a');
//        s=s.replaceFirst(""+str,sb.toString());
//        System.out.println(s);
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        StringBuilder text = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        boolean isStart = false;
        boolean isContinue = true;
        while (isContinue) {
            int number = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - '0' <= 9) {
                    if (text.length() > 0 || isStart == true) {
                        text.setLength(0);
                        numbers.setLength(0);
                    }
                    numbers.append(s.charAt(i));
                    isStart = false;
                } else if (s.charAt(i) == '[') {
                    isStart = true;
                } else if (s.charAt(i) == ']') {
                    String str = numbers.toString() + "\\[" + text.toString() + "\\]";
                    StringBuilder sb = new StringBuilder();
                    number = Integer.parseInt(numbers.toString());
                    while (number > 0) {
                        sb.append(text);
                        number--;
                    }
                    s = s.replaceFirst(str, sb.toString());
                    text.setLength(0);
                    numbers.setLength(0);
                    isStart = false;
                    break;
                } else {
                    text.append(s.charAt(i));
                }
            }
            if (number == -1) {
                isContinue = false;
            }
        }
        return s;


    }
}
