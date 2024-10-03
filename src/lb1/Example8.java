package lb1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String day = in.nextLine();
        System.out.println("Введите месяц: ");
        String month = in.nextLine();
        System.out.print("Введите номер дня в месяце: ");
        String dayOfMonth = in.nextLine();
        System.out.println("Сегодня: " + day + " " + dayOfMonth + " " + month);
        in.close();
    }
}