import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static String input;
    public static String output;

    public static void main(String[] args){

        //input = args[0];
        input = args[0];
        output = args[1];


        String[] commands = FileInput.readFile(input,true,true);
        for(int i = 0; i< commands.length; i++){
            if(commands[i].split(" ")[0].equals("Convert")){
                FileInput.writeToFile("Equivalent of " + commands[i].split("\t")[1] + " (base 10) in base 2 is: "+changeBase(Integer.parseInt(commands[i].split("\t")[1])),output,true,true);
            }
            else if (commands[i].split(" ")[0].equals("Count")) {
                FileInput.writeToFile("Counting from 1 up to " + commands[i].split("\t")[1] + " in binary:\t"+BinaryCounter.countBinary(Integer.parseInt(commands[i].split("\t")[1])),output,true,true);
            }
            else if (commands[i].split(" ")[4].equals("palindrome")) {
                boolean ifPalindrome = PalindromeChecker.isPalindrome(commands[i].split("\t")[1]);
                if(ifPalindrome){
                    FileInput.writeToFile("\""+commands[i].split("\t")[1]+"\" is a palindrome.",output,true,true);
                }else {
                    FileInput.writeToFile("\""+commands[i].split("\t")[1]+"\" is not a palindrome.",output,true,true);
                }
            }
            else if(commands[i].split(" ")[3].equals("expression")) {
                boolean ifBalanced = ValidParanthesis.isValidExpression(commands[i].split("\t")[1]);
                if(ifBalanced){
                    FileInput.writeToFile("\""+commands[i].split("\t")[1]+"\" is a valid expression.",output,true,true);
                }else {
                    FileInput.writeToFile("\""+commands[i].split("\t")[1]+"\" is not a valid expression.",output,true,true);
                }
            }
        }
    }



    public static boolean isPalindrome(String text) {
        MyStack<Character> myStack = new MyStack<>(); // using my dynamic and generic stack

        String palindromeText = text.toLowerCase();

        for (int i = 0; i < palindromeText.length(); i++) {
            myStack.addToTail(palindromeText.charAt(i)); //adding to my stack
        }

        if (myStack.getHead() == null || myStack.getHead() == myStack.getTail()) {
            return true;
        }

        MyStack.Member<Character> left = myStack.getHead();
        MyStack.Member<Character> right = myStack.getTail();
        while (left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static String changeBase(int baseTen){
        boolean isnegatif = false;
        if(baseTen == 0){
            return "0";
        }else if(baseTen<0){
            baseTen = -baseTen;
            isnegatif = true;
        }

        MyStack<Integer> myStack = new MyStack<>(); // creating my stack

        while (baseTen > 0){
            int theNumber = baseTen % 2; // getting mod by 2
            myStack.addToTail(theNumber); // adding to my dynamic and generic stack
            baseTen = baseTen / 2; // dividing with two
        }

        StringBuilder reversedString = new StringBuilder(myStack.toString()); // this part is for reversing
        reversedString.reverse();
        if(isnegatif){
            return "-"+reversedString.toString();
        }
        return reversedString.toString();
    }
}