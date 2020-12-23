package dataStru;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2D {
    public static void main (String []args){
     /*   int arr[][]={
                {1 ,1, 1, 0, 0, 0},
                {0 ,1, 0, 0, 0 ,0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
*/
        int  arr[][]= {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1 ,1, 1, 0, 0, 0},
                { 0, 9, 2, -4, -4, 0},
                { 0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}};

        int a=0, b=0;
        int sum = 0;
        int large= 0 ;
        for(int x= 0 ; x<4;x++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {

                    a += arr[x][i + j];
                    b += arr[x+2][i + j];

                }
                sum = a + b + arr[x+1][i + 1];
                a = 0;
                b = 0;
                if (sum > large) large = sum;
            }
        }
        System.out.println(large);

    }



}
