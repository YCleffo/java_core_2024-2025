package lb1;
import java.util.Scanner;

public class Example11  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш год рождения: ");
        int birthYear = scanner.nextInt();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println(name + ", вам " + age + " лет.");
        scanner.close();
    }
}