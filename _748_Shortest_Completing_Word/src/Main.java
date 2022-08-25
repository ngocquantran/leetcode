public class Main {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        char a='s';
        System.out.println(shortestCompletingWord(licensePlate,words));

    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate=licensePlate.toLowerCase().replaceAll("[0-9\\s]","");
        System.out.println(licensePlate);
        int minLength=15;
        String result="";
        for (String w:words){
            int count=0;
            String copy=w;
            for (int i=0;i<licensePlate.length();i++){
                char a=licensePlate.charAt(i);
                if (copy.indexOf(a)>=0){
                    System.out.println(copy);
                    System.out.println("copy.indexOf("+a+"): "+copy.indexOf(a));
                    count++;
                    copy=copy.substring(0,copy.indexOf(a))+copy.substring(copy.indexOf(a)+1);

                    System.out.println("copy: "+copy);
                }
            }
            System.out.println("word: "+w+" - count: "+count);
            if (count>=licensePlate.length() && w.length()<minLength){
                result=w;
                minLength=w.length();
            }

        }
        return result;

    }
}
