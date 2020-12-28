package codewar.section4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

class Statement {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //
        int p1=calculateHighScorePosition(1555);
        int p2= calculateHighScorePosition(900);
        int p3=calculateHighScorePosition(400);
        int p4=calculateHighScorePosition(50);
        displayHighScorePosition("player 1 ", p1);
        displayHighScorePosition("player 2 ", p2);
        displayHighScorePosition("player 3 ", p3);
        displayHighScorePosition("player 4 ", p4);

        System.out.println("**************Dog**************");

        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println( shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("**************LeanYear**************");

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        areEqualByThreeDecimalPlaces(3.1756, 3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);


    }
    public static void displayHighScorePosition(String name, int pos){
        System.out.println(name+" managed to get into position"+" position they got and a further message "+pos );
    }

    public static int calculateHighScorePosition(int score){
        if ( score >= 1000) return 1;
        if (score>=500 && score<1000) return  2 ;
        if (score>100&& score<500) return  3 ;
        else return 4 ;
    }

    /*
        public static void displayHighScorePosition(String playerName, int highScorePosition) {
            System.out.println(playerName + " managed to get into position "
                    + highScorePosition + " on the high score table");
        }

        public static int calculateHighScorePosition(int playerScore) {

            if(playerScore >= 1000) {
                return 1;
            } else if(playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if(playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }
        */


    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay <=23 ) {

            if(barking && hourOfDay <8 ) return true;
            else if( hourOfDay > 22) return true ;
            else return false  ;
        }
        return false;

    }

    public static boolean isLeapYear(int year){
        if (year >=1 && year <=9999 ) {
            if (year % 4 ==0) {
                if (year% 100==0)
                {
                    if(year% 400 ==0) return true ;
                    return false;
                }
                return true;
            }
            if(year %400==0) return true;
        }
        return false;
    }

    public static void areEqualByThreeDecimalPlaces(double a, double b){
        boolean isEqual= false;
        DecimalFormat df = new DecimalFormat("#.000");
        df.setRoundingMode(RoundingMode.DOWN);

        if (df.format(a).equals( df.format(b))){
            isEqual= true ;
        }
        System.out.println(isEqual);
    }

    public static boolean hasTeen(int a, int b, int c){
        if((a >=13 && a<=19) || (b>=13 &&b <=19) ||(c >=13 && c <=19)) return true;
        return false;
    }
    public static boolean isTeen(int a){
        if(a>=13 && a <= 19) return true;
        return false;
    }
    public static boolean hasEqualSum(int a, int b, int c){
        if ((a+b) ==c) return true;
        return false;
    }

}

