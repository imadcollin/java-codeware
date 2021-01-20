package codewar.loop2;

public class StringsInt {
    public static void main(String[] args) {
        String s = "";
        int n = 100;
        s = s.valueOf(n);
        if (n == Integer.parseInt(s))
            System.out.println("Good Job");
        else
            System.out.println("Wrong");
    }
}
