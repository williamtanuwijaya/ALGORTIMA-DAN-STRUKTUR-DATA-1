package infix_prefix_postfix;

import java.util.Stack;

public class prefix_postfix {
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

    public String PrefixtoPostfix(String notasi) {
        Stack<String> s = new Stack<String>();
        for (int i = notasi.length() - 1; i >= 0 ;i--) {
            char c = notasi.charAt(i);
            if (isOperator(c)) {
                String s1 = s.pop();
                String s2 = s.pop();
                String temp = s1 + s2 + c;
                s.push(temp);
            } else {
                s.push(c + "");
            }
        }
        String hasil = s.pop();
        return hasil;
    }


    public static void main(String[] args) {
        prefix_postfix s = new prefix_postfix();
        String notasi = "+A*B-^CDE";
        System.out.println(s.PrefixtoPostfix(notasi));
    }
}