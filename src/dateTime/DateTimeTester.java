package dateTime;

import java.util.Scanner;

public class DateTimeTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Create Date");
            System.out.println("2. Create Time");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createDate(sc);
                    break;

                case 2:
                    createTime(sc);
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }

    }

    private static void createDate(Scanner sc) {
        System.out.println("Enter Day");
        int day = sc.nextInt();

        System.out.println("Enter Month");
        int month = sc.nextInt();

        System.out.println("Enter Year");
        int year = sc.nextInt();

        Date date = new Date(day, month, year);
        System.out.println("Date Created : " + date);
    }

    private static void createTime(Scanner sc) {
        System.out.println("Enter Hour");
        int hour = sc.nextInt();

        System.out.println("Enter Minutes");
        int minutes = sc.nextInt();

        System.out.println("Enter Seconds");
        int seconds = sc.nextInt();

        Time time = new Time(hour, minutes, seconds);
        System.out.println("Created Time : " + time);
    }
}
