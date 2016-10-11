package com.tobral;

/**
 * Created by SG0214842 on 10/10/2016.
 */


public class ChristmasTree {


    public static void main(String[] args) {

        int wysokosc = 5;
        for (int i = 0; i < wysokosc; i++) {


            for (int k = 0; k < wysokosc - i; k++) {
                System.out.printf(" ");
            }

            for (int j = 0; j <= i*2; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    }

}


