package lb1;
import java.util.Scanner;

public class Example14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int previous = number - 1;
        int next = number + 1;
        int fourth = (previous + number + next) * (previous + number + next);
        System.out.println("Последовательность: " + previous + ", " + number + ", " + next + ", " + fourth);
        scanner.close();
    }
}