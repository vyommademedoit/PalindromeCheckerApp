import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    
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
                String word = "madam";
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if(word.equals(reversed))
            System.out.println("UC5: Palindrome");
        else
            System.out.println("UC5: Not Palindrome");

    }


    
    public static void uc6(){
        String word = "level";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : word.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;

        while(!stack.isEmpty()) {

            if(!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("UC6: " + word + " is Palindrome");
        else
            System.out.println("UC6: " + word + " is NOT Palindrome");

    }

    /* UC7 – Deque Based Palindrome Checker */
class uc7 {

    public static void run() {

        String word = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray())
            deque.addLast(c);

        boolean palindrome = true;

        while(deque.size() > 1){

            if(deque.removeFirst() != deque.removeLast()){
                palindrome = false;
                break;
            }
        }

        System.out.println("UC7 Result: " + palindrome);
    }
}


/* UC8 – Linked List Palindrome */
class uc8 {

    static class Node{
        char data;
        Node next;

        Node(char d){
            data = d;
        }
    }

    public static void run(){

        String word = "level";

        Node head = null;
        Node tail = null;

        for(char c : word.toCharArray()){

            Node newNode = new Node(c);

            if(head == null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        String original = "";
        Node temp = head;

        while(temp != null){
            original += temp.data;
            temp = temp.next;
        }

        String reverse = new StringBuilder(original).reverse().toString();

        System.out.println("UC8 Result: " + original.equals(reverse));
    }
}


/* UC9 – Recursive Palindrome */
class uc9 {

    static boolean check(String str,int start,int end){

        if(start >= end)
            return true;

        if(str.charAt(start) != str.charAt(end))
            return false;

        return check(str,start+1,end-1);
    }

    public static void run(){

        String word = "radar";

        System.out.println("UC9 Result: " + check(word,0,word.length()-1));
    }
}


/* UC10 – Case Insensitive & Ignore Spaces */
class uc10 {

    public static void run(){

        String input = "A man a plan a canal Panama";

        String normalized =
                input.replaceAll("\\s+","").toLowerCase();

        String reversed =
                new StringBuilder(normalized).reverse().toString();

        System.out.println("UC10 Result: " +
                normalized.equals(reversed));
    }
}


/* UC11 – OOP Palindrome Service */

class PalindromeService {

    public boolean checkPalindrome(String word){

        String reversed =
                new StringBuilder(word).reverse().toString();

        return word.equals(reversed);
    }
}

class uc11 {

    public static void run(){

        PalindromeService service = new PalindromeService();

        System.out.println("UC11 Result: " +
                service.checkPalindrome("madam"));
    }
}


/* UC12 – Strategy Pattern */

interface PalindromeStrategy{
    boolean check(String word);
}

class StackStrategy implements PalindromeStrategy{

    public boolean check(String word){

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray())
            stack.push(c);

        String reversed = "";

        while(!stack.isEmpty())
            reversed += stack.pop();

        return word.equals(reversed);
    }
}

class StrategyContext{

    PalindromeStrategy strategy;

    StrategyContext(PalindromeStrategy s){
        strategy = s;
    }

    boolean execute(String word){
        return strategy.check(word);
    }
}

class uc12 {

    public static void run(){

        StrategyContext context =
                new StrategyContext(new StackStrategy());

        System.out.println("UC12 Result: " +
                context.execute("level"));
    }
}


/* UC13 – Performance Comparison */

class uc13 {

    static boolean check(String word){

        String reversed =
                new StringBuilder(word).reverse().toString();

        return word.equals(reversed);
    }

    public static void run(){

        String word = "racecar";

        long start = System.nanoTime();

        boolean result = check(word);

        long end = System.nanoTime();

        System.out.println("UC13 Result: " + result);
        System.out.println("Execution Time: " +
                (end-start) + " ns");
    }


}
