import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.AbstractResourceBundleProvider;

public class Validate {
    static Scanner scanner=new Scanner(System.in);

    public static void inputPositiveNumber(){
        String digit="\\d+";
        String result="";
        boolean isContinue=true;
        while (isContinue){
            System.out.println("Nhập giá trị:");
            result= scanner.nextLine();
            if (!result.matches(digit)){
                System.out.println("Không phải số nguyên dương");
            }else {
                isContinue=false;
            }
        }
        System.out.println("Số vừa nhập: "+result);
    }

    public static void inputNumber(){
        String digit="^-?\\d+";
        String result="";
        boolean isContinue=true;
        while (isContinue){
            System.out.println("Nhập giá trị:");
            result= scanner.nextLine();
            if (!result.matches(digit)){
                System.out.println("Không phải số nguyên");
            }else {
                isContinue=false;
            }
        }
        System.out.println("Số vừa nhập: "+result);
    }

    public static int inputNumber2(){
        String digit="^-?\\d+";
        String result="";
        boolean isContinue=true;
        while (isContinue){
            System.out.println("Nhập giá trị:");
            result= scanner.nextLine();
            if (!result.matches(digit)){
                System.out.println("Không phải số nguyên");
            }else {
                isContinue=false;
            }
        }
        System.out.println("Số vừa nhập: "+result);
        return Integer.parseInt(result);
    }

    public static void isSpecialCharacter(){
//        String regex="\\w+";
        String regex="[^\\W]+";
        String result="";
        boolean isContinue=true;
        while (isContinue){
            System.out.println("Nhập nội dung:");
            result= scanner.nextLine();
            if (result.matches(regex)){
                System.out.println("Nội dung không được chứa ký tự đặc biệt");
            }else {
                isContinue=false;
            }
        }
        System.out.println("Nội dung vừa nhập vừa nhập: "+result);
    }

    public static void separateString(){
        Scanner sc;
        String s="I love you so much. I want to marry you";
        sc=new Scanner(s);
        while (sc.hasNext()){
            String token=sc.next();
            System.out.println(token);
        }
    }

    public static String isName(){
        String name="";
        String namePattern="[a-zA-Z\\s]+";
        Pattern pattern=Pattern.compile(namePattern);
        boolean isContinue=true;
        while (isContinue){
            System.out.println("Nhập tên:");
            name= scanner.nextLine();
            if (pattern.matcher(name).matches()){
                isContinue=false;
            }
        }
        return name;
    }

    public static void isStartWith(String input,String key){
        Pattern pattern=Pattern.compile(key);
        if (pattern.matcher(input).lookingAt()){
            System.out.println("Thỏa mãn điều kiện");
        }else {
            System.out.println("Không thỏa mãn điều kiện");
        }
    }

    public static void countAppearance(){
//
//        Pattern pattern;
//        Matcher matcher;
        String text = "I love you so much! However, I cannot marry you because you are not a human!";
        String searchString = "not";
//        pattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);
//        matcher = pattern.matcher(text);
//        int count = 0;
//        while (matcher.find()) {
//            count++;
//            System.out.println(matcher.group());
//        }
//        System.out.println("The word was found: " + count + " times");
        Pattern pattern=Pattern.compile(searchString,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(text);
        int count=0;
        while (matcher.find()){
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Số lần xuất hiện: "+count);

    }

    public static void findDate(String key){
//        String regex="\\w+ \\d{1,2}-\\d{1,2}-\\d{4}";
        String regex="(\\w+ \\d{1,2})-(\\d{1,2})-(\\d{4})";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher(key);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println("Có "+matcher.groupCount()+" nhóm trong pattern");
        }
        System.out.println("Hết");

    }

    public static void foundWord(String input, String word){
//        String regex="^"+word+"[\\s\\w]*[.]?";
        String input2=convertToUnicode(input);
        String word2=convertToUnicode(word);
        String regex="\\b[\\s\\w]*"+word2+"\\b[\\s\\w]*\\b[.]";
        Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println(input2);

        Matcher matcher= pattern.matcher(input2);
        if (matcher.find()){
            System.out.println(matcher.group());
        }

    }

    public static String convertToUnicode(String input){
        String str=input.toLowerCase();
        str = str.replaceAll("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ", "a");
        str = str.replaceAll("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ", "e");
        str = str.replaceAll("ì|í|ị|ỉ|ĩ", "i");
        str = str.replaceAll("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ", "o");
        str = str.replaceAll("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ", "u");
        str = str.replaceAll("ỳ|ý|ỵ|ỷ|ỹ", "y");
        str = str.replaceAll("đ", "d");
        str = str.replaceAll("\u0300|\u0301|\u0303|\u0309|\u0323", "");
        str = str.replaceAll("\u02C6|\u0306|\u031B", "");
        str = str.replaceAll(",", "");
        str = str.replaceAll("\\?|!", ".");
        str = str.replaceAll("[\\s]?[^\\w.][\\s]?", " ");

        return str;
    }




}
