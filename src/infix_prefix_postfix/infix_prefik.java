package infix_prefix_postfix;

import java.util.Stack;
import java.util.logging.Level;

public class infix_prefik {
    public int operator(char operator){
        switch (operator){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
        }
        return -1;
    }
    public String InfixToPrefix(String notasi){
        Stack<Character> s = new Stack<Character>();
        String hasil = new String("");
        char c;
        for (int i = 0; i < notasi.length(); i++) {
            c = notasi.charAt(i);
            if (Character.isLetterOrDigit(c)){
                hasil+=c;
            } else if (c == '(') {
                s.push(c);
            } else if (c == ')'){
                while (!s.isEmpty() && s.peek() != '('){
                    hasil += s.pop();
                }  if (!s.isEmpty() && s.peek() != '('){
                    return "Notasi Salah";
                }
            } else {
                while (!s.isEmpty() && level_operator(c) <= level_operator(s.peek())){
                    if (s.peek() == '('){
                        return "Notasi Salah";
                    }
                    hasil+=s.pop();
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()){
            if (s.peek() == '('){
                return "Notasi Salah";
            }
            hasil += s.pop();
        }
        return hasil;
    }

    public static void main(String[] args) {

    }
}
