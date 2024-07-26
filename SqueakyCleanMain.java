package Learnmaxxing.Assignment7;

public class SqueakyCleanMain {
    public static void main(String[] args) {
        SqueakyClean squeakyClean = new SqueakyClean();
        System.out.println(squeakyClean.clean("Hello World!"));
        System.out.println(squeakyClean.clean("my   Id"));
        System.out.println(squeakyClean.clean("a-bc"));
        System.out.println(squeakyClean.clean("H3ll0 W0rld"));
        System.out.println(squeakyClean.clean("a$#.b"));
    }
}
class SqueakyClean{
    static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static StringBuilder clean(String string){
        StringBuilder cleanstr = new StringBuilder();
        for (int i = 0;i < string.length(); i++) {
            Character cha = string.charAt(i);
            if (alpha.contains(cha.toString())) {
                cleanstr.append(cha);
            } else if (cha.equals(' ')) {
                cleanstr.append('_');
            } else if (cha.equals('-')) {
                i += 1;
                cleanstr.append(Character.isUpperCase(string.charAt(i)));
            } else if (cha.equals('0')) {
                cleanstr.append('o');
            } else if (cha.equals('1')) {
                cleanstr.append('i');
            } else if (cha.equals('3')) {
                cleanstr.append('e');
            } else if (cha.equals('4')) {
                cleanstr.append('a');
            } else if (cha.equals('7')) {
                cleanstr.append('t');
            }
        }
        return cleanstr;
    }
}
