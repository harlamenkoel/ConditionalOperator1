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

        System.out.println();
        System.out.println("Домашняя работа 1.Задание 2");
        System.out.print("Введите ваш возраст: ");
        int age2 = scanner.nextInt();

        if (age2 >= 7 && age2 < 18) {
            System.out.println("Вы ребенок, и ходите в школу");
        } else if (age2 >= 18 && age2 <= 23) {
            System.out.println("Вы закончили школу и можете отправляться в университет");
        } else if (age2 >= 24) {
            System.out.println("Вы окончили университет и вам пора искать первую работу");
        } else {
            System.out.println("Вы слишком малы");
        }

        System.out.println();
        System.out.println("Домашняя работа 1.Задание 3");
        System.out.print("Введите количество пассажиров в вагоне: ");
        int amountPassengers = scanner.nextInt();
        if (amountPassengers <= 59) {
            System.out.println("В вагоне есть сидячие места");
        } else if (amountPassengers <= 101) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне мест больше нет");
        }
    }
}