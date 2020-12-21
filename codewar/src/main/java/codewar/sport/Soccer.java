package codewar.sport;

public class Soccer extends Sport{
    @Override
    public String getName() {
        return "Soccer Class";
    }
    @Override
    void getNumberOfTwoMembers(){
        System.out.println("Each team has 11 players in " + getName());

    }
}
