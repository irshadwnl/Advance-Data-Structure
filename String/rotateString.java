package String;

public class rotateString {

  public static void main(String[] args) {
    String s1 = "abcdefg";
    String s2 = "bcdefga";
    if (s1.length() != s2.length()) {
      System.out.print("False");
    }
    boolean check = false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.equals(s2)) {
        check = true;
        break;
      }
      char ch = s1.charAt(s1.length() - 1);
      s1 = ch + s1.substring(0, s1.length() - 1);
      System.out.println(s1);
    }
    if (check) {
      System.out.print("True");
    } else {
      System.out.print("False");
    }
  }
}
