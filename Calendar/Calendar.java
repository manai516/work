import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        while (true) {
            System.out.println("Введите год и количество дней в формате yyyy число:");
            int year = scanner.nextInt();
            int days = scanner.nextInt();

            if ((isLeapYear(year) && days == 366) || (!isLeapYear(year) && days == 365)) {
                correctAnswers++;
            } else {

                System.out.println("Некорректное количество дней для года " + year + ".");
                System.out.println("Правильное количество дней: " + (isLeapYear(year) ? 366 : 365));
                break;
            }
        }

        System.out.println("Игра окончена. У вас " + correctAnswers + " правильных ответов.");
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}