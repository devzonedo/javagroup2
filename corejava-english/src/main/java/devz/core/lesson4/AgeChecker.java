/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devz.core.lesson4;

import java.util.Scanner;

/**
 *
 * @author devzo
 */
public class AgeChecker {

    public static void main(String[] args) {

        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = in.nextInt();

        if (age < 18) {
            System.out.println("You are younger");
        } else {
            System.out.println("You are elder");
        }

    }

}
