package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch ((number + 100) / 100) {
            case 1:
                System.out.println("number is in range 0-100");
                break;
            case 2:
                System.out.println("number is in range 100-200");
                break;
            case 3:
                System.out.println("number is in range 200-300");
                break;
            default:
                System.out.println("number is out of range");
                
        }
    }
}
