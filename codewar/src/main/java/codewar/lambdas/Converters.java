package codewar.lambdas;

import java.util.function.Function;
import java.util.function.Supplier;

public class Converters {
    public static void main(String[] args) {

        String s= sourceCharLambda.apply("text");
        System.out.println(s);

        String s1=callLambdaFnc("text2");
        System.out.println(s1);

        Supplier<String> stringBack=textBack("hello");
        System.out.println(stringBack.get());

    }
    /****************************************************/
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            String str = "some text";
            String[] arr = str.split("");

            for (String s : arr
            ) {
                System.out.println(s);
            }
        }
    };

    /****************************************************/
    Runnable runnableLambda = () -> {
        String str = "some text";
        String[] arr = str.split("");

        for (String s : arr
        ) {
            System.out.println(s);
        }
    };

    /****************************************************/
    public static String secondChar (String text){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 1) {
                stringBuilder.append(text.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    /****************************************************/
    static Function<String, String> sourceCharLambda = text -> {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 1) {
                stringBuilder.append(text.charAt(i));
            }
        }

        return stringBuilder.toString();
    };

    /****************************************************/
    static String callLambdaFnc(String str){
        return  sourceCharLambda.apply(str);
    }

    /****************************************************/
    static Supplier<String> textBack(String text){
        return ()-> text ;
    }
}

