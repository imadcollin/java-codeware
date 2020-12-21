package codewar.engine;

public class Bicycle {
    String define_me(){
        return "a vehicle with pedals";
    }
}
class  Motocycle extends Bicycle{

    String define_me() {
        return  "a cycle with an engine";
    }

    Motocycle(){
        String temo = super.define_me();
        System.out.println("Override the method "+temo );
    }
}

class  Main{
    public static void main (String []args){
        Motocycle motocycle=new Motocycle();
    }
}
