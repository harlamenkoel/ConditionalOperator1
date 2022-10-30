import java.util.Scanner;

public class ConditionalOperator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Поздравляем вы совершенноле́тний");
        } else {
            System.out.println("Вы еще малы, нужно подождать");
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.print("Введите ваш возраст: ");
        int age2 = scanner.nextInt();

        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 23) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить в университет");
        } else if (age2 >= 24) {
            System.out.println("Если возраст человека равен " + age2 + " , то ему нужно ходить на работу");
        } else {
            System.out.println("Вы слишком малы");
        }

        System.out.println();
        System.out.println("Задание 3");
        System.out.print("Введите количество пассажиров в вагоне: ");
        int amountPassengers = scanner.nextInt();
        if (amountPassengers <= 59) {
            System.out.println("В вагоне есть сидячие места");
        } else if (amountPassengers <= 101) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне мест больше нет");
        }

        System.out.println();
        System.out.println("Задание 4");
        System.out.print("Введите возраст, чтобы определить условия катания на атракционе: ");
        int age3 = scanner.nextInt();

        if (age3 <= 5) {
            System.out.println("Вы слишком малы и не можете кататься на атракционе");
        } else if (age3 <= 14) {
            System.out.println("Вы может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Вы старше 14 лет, можете кататься без сопровождения взрослого");
        }

        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Введите 3 числа программа определит наибольшее из них");

        System.out.print("Введите первое число: ");
        int one = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int two = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int free = scanner.nextInt();

        if (one > two) {
            System.out.println("Число " + one + " больше");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " больше");
        } else {
            System.out.println("Число " + free + " больше");
        }
    }
}