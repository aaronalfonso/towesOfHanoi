package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Tower of Hanoi Game.");
        System.out.println("This program will solve the puzzle for you.");
        System.out.println("Please input number of disks to solve for:");
        int disks = input.nextInt();

        TowersOfHanoi.solve(disks, 1, 3, 2);
    }
}
