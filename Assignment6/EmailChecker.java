package Learnmaxxing.Assignment5;

public class EmailChecker {
    public static boolean checker(String email) {
        int atindex = email.indexOf('@');
        if (atindex < 1 || atindex == email.length() - 1) {
            return false;
        }
        String domainname = email.substring(atindex + 1);
        int dotindex = domainname.lastIndexOf('.');
        if (dotindex < 1 || dotindex == domainname.length() - 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checker("Hello@World.com"));
        System.out.println(checker("Hello World"));
        System.out.println(checker("Hello@World"));
        System.out.println(checker("HelloWorld.com"));
    }
}