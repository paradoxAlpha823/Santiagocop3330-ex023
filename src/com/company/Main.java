/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key?");
        String s1 = x.nextLine();
        String s1s = s1.toUpperCase(Locale.ROOT);
        if(s1s.equals("Y")){
            System.out.print("Are the battery terminals corroded?");
            String s2 = x.nextLine();
            String s2s = s2.toUpperCase(Locale.ROOT);

            if(s2s.equals("Y")) {
                System.out.print("Clean terminals and try starting again.");
            }else{
                System.out.print("Replace the cables and try again.");
            }
            System.exit(0);
        }else{
            System.out.print("Does the car make a slicking noise?");
            String s2 = x.nextLine();
            String s2s = s2.toUpperCase(Locale.ROOT);

            if(s2s.equals("Y")) {
                System.out.print("Replace the battery.");
                System.exit(0);
            }else{
                System.out.print("Does the car crank up but fail to start?");
                String s3 = x.nextLine();
                String s3s = s3.toUpperCase(Locale.ROOT);

                if(s3s.equals("Y")){
                    System.out.print("Check spark plug connections.");
                    System.exit(0);
                }else{
                    System.out.print("Does the engine start and then die?");
                    String s4 = x.nextLine();
                    String s4s = s4.toUpperCase(Locale.ROOT);
                    if(s4s.equals("Y")){
                        System.out.print("Does your car have fuel injection??");
                        String s5 = x.nextLine();
                        String s5s = s5.toUpperCase(Locale.ROOT);

                        if(s5s.equals("Y")){
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        }else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }

                    }else{
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }


        System.exit(0);
    }
}