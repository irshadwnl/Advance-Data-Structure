// Create RE that accepts alphanumeric character only

package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice {

  public static void checkStringAgainstRE(String re, String s) {
    // Pattern p = Pattern.compile(re);
    // Matcher m = p.matcher(s);
    // System.out.println(m.matches());

    System.out.println(Pattern.matches(re, s));
  }

  public static void main(String[] args) {
    while (true) {
      System.out.println("Enter your regex:");
      Scanner sc = new Scanner(System.in);
      String re = sc.nextLine();
      System.out.println("Enter your String:");
      String s = sc.nextLine();
      checkStringAgainstRE(re, s);
      System.out.println("Want to Exit [Y/N]");
      String str = sc.nextLine();
      if (str.equalsIgnoreCase("Y")) {
        System.out.println("Thanks");
        break;
      }
    }
  }
}


// Create Regex that accept 10 digit number only
