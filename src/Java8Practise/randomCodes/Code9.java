package src.Java8Practise.randomCodes;

public class Code9 {

    public static void main(String[] args) {

        String s1 = new String("ashu");
        String s2 = new String("ashu");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        // System.out.println(checkTwisted("ashu", "huas"));
    }

    private static Boolean checkTwisted(String string, String string2) {
        return (string + string).contains(string2) ? true : false;
    }
}
