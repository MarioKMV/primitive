package task0411;

/* 
Время года
Напиши метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна


Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод main должен вызывать метод checkSeason.
4. Метод checkSeason должен быть static void, и иметь только один параметр int.
5. Метод checkSeason должен выводить текст на экран согласно заданию.*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
            if (month == 12 || month == 1 || month == 2)
            System.out.println("зима");

            if (month == 3 || month == 4 || month == 5)
                System.out.println("весна");

            if (month == 6 || month == 7 || month == 8)
                System.out.println("лето");

            if (month == 9 || month == 10 || month == 11)
                System.out.println("осень");
            //напишите тут ваш код


    }
}