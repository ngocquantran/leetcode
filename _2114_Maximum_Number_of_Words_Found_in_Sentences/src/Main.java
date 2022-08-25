public class Main {
    public static void main(String[] args) {

    }

    public static int mostWordsFound(String[] sentences) {
        int result=sentences[0].split(" ").length;
        for(int i=0;i<sentences.length;i++){
            if (sentences[i].split(" ").length>result){
                result=sentences[i].split(" ").length;
            }
        }
        return result;

    }
}
