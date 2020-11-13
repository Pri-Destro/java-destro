package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Welcome to Scissors Paper rock");
        System.out.println("Press 1 fo Scissors");
        System.out.println("Press 2 fo Paper");
        System.out.println("Press 3 for Rock");
        int RnNumber = rn.nextInt(4);
        int user = input.nextInt();

        String comp = "";
        switch (RnNumber) {
            case 1 -> {
                new String(comp = "Scissor");
            }
            case 2 -> {
                new String(comp = "Paper");
            }
            case 3 -> {
                new String(comp = "Rock");
            }
        }



        if (RnNumber == 1 && user == 2) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("comp won \n you loose");

        }
        else if (RnNumber == 1 && user == 3) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("you won \n comp loose");

        }
        else if (RnNumber == 2 && user == 3) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("comp won \n you loose");

        }
        else if (RnNumber == 2 && user == 1) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("you won \n comp loose");

        }
        else if (RnNumber == 3 && user == 1) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("comp won \n you loose");
        }
        else if (RnNumber == 3 && user == 2) {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("you won \n comp loose");
        }
        else if (user>3) {
            System.out.println("please input a valid number");
        }
        else {
            System.out.printf("you choose %d \n", user);
            System.out.printf("System choose %s \n",comp);
            System.out.println("Its a draw!!!");
        }
    }
}
