package test;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of cages");

        int numberOfCages = sc.nextInt();

        System.out.println("Insert the name of the zoo");

        String nameOfZoo = sc.next();


    }
}