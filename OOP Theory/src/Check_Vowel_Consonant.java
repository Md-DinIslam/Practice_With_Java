import javax.swing.*;
import java.util.Scanner;
public class Check_Vowel_Consonant {
    static String Check(char c){
        if(c == 'A' || c=='a' || c == 'E' ||c == 'e' || c== 'I' ||c == 'i' || c == 'O' || c == 'o' || c== 'U' || c== 'u'){
            return "It is Vowel";
        }
        else if( c >= 65 && c <= 90 || c >= 97 && c <= 122){
            return "It is Consonant";
        }
        return "It is not an Alphabet";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char ch = sc.next().charAt(0);
        System.out.println(Check(ch));
    }
}
