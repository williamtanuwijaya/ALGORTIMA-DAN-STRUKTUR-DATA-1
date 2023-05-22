package infix_prefix_postfix;

import java.util.Stack;

public class postfix_prefix {
    public boolean isOperator(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }

    public String PostfixToPrefix(String notasi) {
        Stack<String> s = new Stack<String>();
        for (int i = 0; i < notasi.length(); i++) {
            char c = notasi.charAt(i);
            if (isOperator(c)) {
                String s1 = s.pop();
                String s2 = s.pop();
                String temp = c + s2 + s1;
                s.push(temp);
            } else {
                s.push(c + "");
            }
        }
        String hasil = s.pop();
        return hasil;
    }

    public static void main(String[] args) {
        postfix_prefix s = new postfix_prefix();
        String notasi = "ABCD^E-*+";
        System.out.println(s.PostfixToPrefix(notasi));
    }
}
