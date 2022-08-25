public class Mian {
    public static void main(String[] args) {
        char s='a';
        char x='A';
        s=Character.toUpperCase(s);
        System.out.println(s);

        String str="abchdakfb";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf('x'));
        System.out.println(str.lastIndexOf('x'));
        System.out.println(str.indexOf('c'));
        System.out.println(str.lastIndexOf('c'));


    }
    public String capitalizeTitle(String title) {
        String[] arr=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){

            if (arr[i].length()>2){

                arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
            }else {
                arr[i]=arr[i].toLowerCase();
            }
            sb.append(arr[i]+" ");

        }
        return sb.toString().trim();

    }
}
