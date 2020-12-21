package codewar.sport;

public class Main {
    public static void main (String []arge){
        Sport sport = new Sport();
        Soccer soccer = new Soccer();

        System.out.println(sport.getName());
        sport.getNumberOfTwoMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTwoMembers();    }
}
