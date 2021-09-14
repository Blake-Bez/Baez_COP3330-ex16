/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("What is your age? ");
            double age = scan.nextDouble();

            double legal_age = 16;

            String result = (age > legal_age)? "You are old enough to legally drive." : "You are not old enough to legally drive.";

            System.out.println(result);
        }
    }