package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a > b && b > c) {System.out.println(a+" "+b+" "+c);}
        else if (b > a && a > c) {System.out.println(b+" "+a+" "+c);}
        else if (c > a && a > b) {System.out.println(c+" "+a+" "+b);}
        else if (a > c && b < c) {System.out.println(a+" "+c+" "+b);}
        else if (c > a && b > c) {System.out.println(b+" "+c+" "+a);}
        else if (c > b && b > a) {System.out.println(c+" "+b+" "+a);}
    }
}

