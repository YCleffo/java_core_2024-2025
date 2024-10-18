package project1;

import java.util.Scanner;

public class timus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int number1 = scanner.nextInt();
		System.out.println("Введите второе число:");
		int number2 = scanner.nextInt();

		int max = (number1 > number2) ? number1 : number2;
		System.out.println("Максимальное число: " + max);
	}
}
