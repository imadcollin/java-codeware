package codewar.tokens;

import java.util.Arrays;

public class StringTokens {
    public static void main(String []args){

    String s= "he is a very.very!good boy, isn´´ he";
    String[] str=s.split("[ ,.´]+");
        for (String x: str
             ) {
            System.out.println(x);
        }

    }
}
