package ua.univer.lesson05;
import java.util.regex.*;
public class ProgramRegex {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String text = "abNow is the ti5me";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}
