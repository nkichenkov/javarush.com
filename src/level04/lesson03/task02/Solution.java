package level04.lesson03.task02;

import java.util.Scanner;

/*
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.

Требования:
•	Программа должна считывать имя c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить 10 раз текст, указанный в задании. Каждый вывод - с новой строки.
•	В программе необходимо использовать цикл while.
 */

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner console = new Scanner(System.in);
        String result = console.nextLine() + text;
        int i = 0;
        while (i < 10) {
            System.out.println(result);
            i++;
        }//напишите тут ваш код

    }
}