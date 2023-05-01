import java.util.Scanner;

public class Palindrome_Or_Not {
    static String pal_rev(String s) {
        int size = s.length();
        if (size == 1) return " is Palindrome";
        String str = "";
        for (int i = size - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            str += ch;
        }
        if (str.equals(s)) return " is Palindrome";
        else return " is not Palindrome";
    }
    static String pal(String s) {
        int size = s.length();
        for (int i = 0; i <= size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - i - 1))
                return " is not Palindrome";
        }
        return " is Palindrome";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        /* USING REVERSE METHOD */
        System.out.println("'" + str + "'" + pal_rev(str));
        /* USING COMPARISON METHOD */
//        System.out.println("'" + str + "'" + pal(str));
    }
}
