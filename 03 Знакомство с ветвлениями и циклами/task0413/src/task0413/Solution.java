package task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        switch (n) {
            case "1":
                System.out.print("понедельник");
                break;
            case "2":
                System.out.print("вторник");
                break;
            case "3":
                System.out.print("среда");
                break;
            case "4":
                System.out.print("четверг");
                break;
            case "5":
                System.out.print("пятница");
                break;
            case "6":
                System.out.print("суббота");
                break;
            case "7":
                System.out.print("воскресенье");
                break;
            default:
                System.out.println("такого дня недели не существует");
        }
    }
}
