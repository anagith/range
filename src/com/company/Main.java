package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch ((number + 45) / 45) {
            case 1:
                System.out.println("number is in range 0-45");
                break;
            case 2:
                System.out.println("number is in range 45-90");
                break;
            case 3:
                System.out.println("number is in range 90-135");
                break;
            default:
                System.out.println("number is out of range");
        }
    }
}
