package lb1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите фаимлию: ");
        String surename = in.nextLine();
        System.out.println("Введите отчество: ");
        String phaser = in.nextLine();
        System.out.println("Здравствуйте: " + name +", "+ surename +", "+ phaser);
        in.close();
    }
}