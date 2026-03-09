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



    public static void uc3(){
        String word = "level";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if(word.equals(reversed))
            System.out.println("UC3: Palindrome");
        else
            System.out.println("UC3: Not Palindrome");
    }



    public static void uc4(){
                String word = "radar";
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while(start < end) {

            if(arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("UC4: " + word + " is Palindrome");
        else
            System.out.println("UC4: " + word + " is NOT Palindrome");
    
    }



    public static void uc5(){
        
    }

    public static void uc6(){}
}
