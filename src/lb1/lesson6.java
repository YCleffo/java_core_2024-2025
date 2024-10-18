package project1;

import java.util.Scanner;

public class lesson6 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Введите число:");
	    int number = scanner.nextInt();

	    if (number >= 5 && number <= 10) {
	        System.out.println("Число в диапазоне.");
	    } else {
	        System.out.println("Число не в диапазоне.");
	    }
	}
}
