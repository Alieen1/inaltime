package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("introduceti inaltimea in cm");
        sc = new Scanner(System.in);
        System.out.print("introduceti greutatea");
        int greutate;
        int inaltime_cm;
        int inaltime_metri;
        int BMI;
        inaltime_metri=inaltime_cm/100;
        BMI=greutate*inaltime_cm^2;
        System.out.print(BMI);


    }
}
