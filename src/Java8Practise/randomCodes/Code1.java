package src.Java8Practise.randomCodes;

public class Code1 {

    public static void main(String[] args) {

        System.out.println(generateOTP(7));
    }

    public static String generateOTP(int len) {

        String OTP = "";
        for (int i = 0; i < len; i++) {
            int num = (int) (Math.random() * 10);
            OTP += num;
        }
        return OTP;
    }
}
