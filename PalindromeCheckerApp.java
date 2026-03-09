public class PalindromeCheckerApp {

    public static void main(String[] args) {

        uc1();
        // uc2();
        // uc3();
        // uc4();
        // uc5();
        // uc6();
    }

    public static void uc1(){
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version 1.0");
    }

    public static void uc2(){
         String word = "madam";
    String reversed = "";

    for(int i = word.length()-1;i>=0;i--){
        reversed += word.charAt(i);
    }

    if(word.equals(reversed))
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
    }

    public static void uc3(){}

    public static void uc4(){}

    public static void uc5(){}

    public static void uc6(){}
}
