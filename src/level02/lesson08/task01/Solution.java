package level02.lesson08.task01;

import java.util.Scanner;

/*
Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода:

Строка Номер РАЗ
Вторая строка
Строка 3
Пример вывода:

Строка 3
ВТОРАЯ СТРОКА
строка номер раз
Требования:
•	Программа должна считывать с клавиатуры три строки.
•	Третью считанную строку нужно вывести без изменений.
•	Вторую считанную строку нужно вывести в верхнем регистре.
•	Первую считанную строку нужно вывести в нижнем регистре.
•	Все три строки нужно вывести в правильном порядке: третья, вторая, первая.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine().toLowerCase();
        String namee = console.nextLine().toUpperCase();
        String nameee = console.nextLine();

        System.out.println(nameee);
        System.out.println(namee);
        System.out.println(name);//напишите тут ваш код

    }
}