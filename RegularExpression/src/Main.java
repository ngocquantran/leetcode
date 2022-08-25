public class Main {
    public static void main(String[] args) {
//        ********  https://sera.typepad.com/blog/java/page/2/************
//        Validate.inputPositiveNumber();
//        int number=Validate.inputNumber2();
//        System.out.println(number+2);
//        Validate.isSpecialCharacter();
////        Validate.isAddress();
//        Validate.separateString();

//        Validate.isStartWith("Tên tôi là Quân","Tên");
//        Validate.isStartWith("Tên tôi là Quân","Tôi");

//        Validate.countAppearance();
//        Validate.findDate("Monday 12-9-2013");
        String str1="Trong tất cả các mùa, mùa: mà \"em\" thích nhất là mùa xuân! Vì khi mùa xuân tới, cũng là Tết, em được nghỉ học dài hơn, được bố mẹ mua cho quần áo đẹp, được đi chơi nhiều nơi hơn. Khi tới mùa xuân, cây cối đâm chồi nảy lộc sau giấc ngủ đông dài, mấy cây đào cũng nở những nụ hoa màu hồng thật đẹp. Thời tiết mùa xuân ấm áp, dễ chịu chứ không lạnh giá như mùa đông. Bố bảo, vào mùa xuân em cũng thêm một tuổi mới, vậy nên em thích mùa xuân còn vì đến mùa xuân em cảm thấy mình lớn hơn, trưởng thành hơn. Vào mùa xuân, trường em cũng tổ chức nhiều hoạt đông vui chơi hơn như đi dã ngoại, cắm trại, rồi các trò chơi dân gian trong giờ giải lao. Em rất thích mùa xuân.";
        Validate.foundWord(str1,"mùa" );
        String str2="Tôi là lập trình viên. Tôi thích xem phim. Tôi hay chơi game";
        Validate.foundWord(str2,"tôi" );


    }
}
