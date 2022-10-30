import java.util.Scanner;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Домашняя работа 1.Задание 1");
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Поздравляем вы совершенноле́тний");
        } else {
            System.out.println("Вы еще малы, нужно подождать");
        }
    }
}