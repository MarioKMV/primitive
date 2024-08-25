package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();
        String[] tokens = expression.split("");
        int n1 = Integer.parseInt(tokens[0]);
        int n2 = Integer.parseInt(tokens[1]);
        int n3 = Integer.parseInt(tokens[2]);

        if (n1==n2)
            System.out.println(3);
        else if (n2 == n3)
            System.out.println(1);
        else if (n3 == n1)
            System.out.println(2);    //напишите тут ваш код

    }
}
