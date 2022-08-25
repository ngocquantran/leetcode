import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        daysBetweenDates(date1,date2);

    }
    public int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        Set<Character> list=new HashSet<>();
        for (int i=0;i<jewels.length();i++){
            list.add(jewels.charAt(i));
        }
        for (int i=0;i<stones.length();i++){
            if (list.contains(stones.charAt(i))){
                sum++;
            }
        }
        return sum;

    }

    public int finalValueAfterOperations(String[] operations) {
        int result=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                result++;
            }else{
                result--;
            }
        }
        return result;
    }

    public static int daysBetweenDates(String date1, String date2) {

        int year1=Integer.parseInt(date1.substring(0,4));

        int month1=Integer.parseInt(date1.substring(5,7));

        int day1=Integer.parseInt(date1.substring(8));
        int year2=Integer.parseInt(date2.substring(0,4));

        int month2=Integer.parseInt(date2.substring(5,7));

        int day2=Integer.parseInt(date2.substring(8));

        LocalDate dat1=LocalDate.of(year1,month1,day1);
        LocalDate dat2=LocalDate.of(year2,month2,day2);
        System.out.println(dat1.);
        System.out.println(date2);
        return 0;
    }
}
