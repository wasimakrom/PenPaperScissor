package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){            // 0-> Rock
        Scanner sc  = new Scanner(System.in);          // 1 -> paper, 2-> scissor
        System.out.println("Enter  '0' for Rock , '1' for paper , '2' for scissor ");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw !!! Unfortunately  \n Play again :) ");
        }else if(userInput == 0 && computerInput ==2 || userInput == 1 && computerInput==0 || userInput==2 && computerInput == 1){
            System.out.println("You win !!!  \n\tCongrats  ");
        }else{
            System.out.println("Computer Win !!!! \n\t Play Again !!!");
        }
        if(computerInput==0){
            System.out.println("Computer choice : Rock ");
        }else if(computerInput==1){
            System.out.println("Computer choice : Paper ");
        }else if(computerInput==2){
            System.out.println("Computer choice : Scissor ");
        }
    }
}
