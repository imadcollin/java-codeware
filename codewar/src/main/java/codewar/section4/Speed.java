package codewar.section4;

public class Speed {
    // write your code here
    public static void main(String[] args) {

        System.out.println(toMilesPerHour(-5.5));
        System.out.println(toMilesPerHour(5.6));
        System.out.println(toMilesPerHour(75.116));


        printConvention(1.5);
        printConvention(10.205);
        printConvention(-5.0);

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static long toMilesPerHour(double kilometers){
        double con= 1.609;
        if(kilometers<0) return -1 ;
        if(kilometers>0)
            return (long)Math.round(kilometers/con);
        return (long) 0.0;

    }
    public static void printConvention(double kilometers){
        if (kilometers <0) System.out.println("Invalid Value");

        else System.out.println(kilometers + "km/h = "+ toMilesPerHour(kilometers) + "mi/h");

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) System.out.println("Invalid Value");
        else {
            int base = 1024;
            int conv = kiloBytes / base;
            System.out.println(kiloBytes + " KB = " + conv + " MB and " + (kiloBytes % base) + " KB");
        }
    }
}

