package level04.lesson03.task03;

import java.util.Scanner;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не
введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.

Требования:
•	Программа должна считывать данные c клавиатуры.
•	Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
•	В программе необходимо использовать цикл while.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (console.hasNextInt()) {
                int i = console.nextInt();
                sum = sum + i;
            } else if (console.hasNextLine()) {
                String line = console.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);//напишите тут ваш код

    }
}