package Regex;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class example1 {
    public static void main(String[] args) {
        // String regex="a";
        // String regex="Irshad";
        Pattern p=Pattern.compile("^b*");
        Matcher m=p.matcher("bbbbb");
        System.out.println(m.matches());
        m.lookingAt();
        m.find();
    }
}
