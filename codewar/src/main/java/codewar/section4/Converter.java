package codewar.section4;

public class Converter {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);


    }

    public static double area(double radius){
        if(radius <0) return (double)-1;

        double area = (double )(radius*radius*Math.PI);
        return area;
    }
    public static double area(double x, double y){
        if(x <0 || y<0) return (double) -1;
        return x*y;
    }

    public static void printYearsAndDays(long min){
        if (min < 0) System.out.println("Invalid Value");
        else {
            int hour = (int) (min / 60);//3
            int day = 0;
            int year = 0;

            if (hour >= 24) {
                day = hour / 24;
            }

            if (day > 365) {
                year = day / 365;
            }
            System.out.println("\"" + min + " min = " + year + " y and " + day + " d \"");
        }
    }

}
