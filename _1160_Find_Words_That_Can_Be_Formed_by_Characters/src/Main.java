public class Main {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println((int)'a');

    }
    public static int countCharacters(String[] words, String chars) {
        int result=0;
        for (String w:words){
            String copyChars=chars;
            int count=0;
            for (int i=0;i< w.length();i++){
                System.out.println("word: "+w+" - copy: "+copyChars);
                if (copyChars.indexOf(w.charAt(i))>=0){
                    count++;
                    System.out.println(count);
                    copyChars=copyChars.replaceFirst(""+w.charAt(i)+""," ");

                }else break;
            }
            if (count == w.length()){
                result+=count;
            }
            System.out.println("result= "+result);
        }
        return result;

    }

    public static int countCharacters2(String[] words, String chars) {
        int result=0;
        int[] arr1=new int[130];
        for (int i=0;i<chars.length();i++){
            arr1[chars.charAt(i)]++;
        }
        for (String w:words){
            int count=0;
            int[] arr2=new int[130];
            for (int i=0;i<w.length();i++){
                arr2[w.charAt(i)]++;
            }
            for (int i=0;i<w.length();i++){
                if (arr2[w.charAt(i)]<=arr1[w.charAt(i)]){
                    count++;
                }else break;
            }
            if (count==w.length()){
                result+=count;
            }

        }
        return result;

    }
}
