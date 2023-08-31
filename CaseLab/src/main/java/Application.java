import java.util.Scanner;

public class Application {
    // Метод для задачи 2
    static int task2(int a, int b) {
        return a;
    }

    // Метод для задачи 3
    static boolean task3(String str) {
        str = str.toLowerCase();
        String strReverce = new StringBuilder(str).reverse().toString();
        return str.equals(strReverce);
    }

    public static void main(String[] args) {
        // Задача 1
//      create table staff
//      (
//          id_ integer primary key,
//          surname varchar(255),
//          experience integer
//      );
//
//      insert into staff values
//      (1, 'Иванов', 10),
//      (2, 'Петров', 12),
//      (3, 'Сидоров', 14)

//      select max(experience)
//      from staff
//      where experience < (select max(experience) from staff)

        // Задача 2
        Scanner keyboard = new Scanner(System.in);
        System.out.print("a = ");
        int a = keyboard.nextInt();
        System.out.print("b = ");
        int b = keyboard.nextInt();
        a = task2(b, b = a);
        System.out.print("a = " + a + " " + "b = " + b);

        // Задача 3
        System.out.print("Введите слово: ");
        String str = keyboard.nextLine();
        System.out.print(task3(str));
    }
}
