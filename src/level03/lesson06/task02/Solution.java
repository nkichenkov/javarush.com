package level03.lesson06.task02;

import java.util.Scanner;

/*
Условие задачи:
Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно),
то выводить ничего не нужно, иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!) с помощью
только одного оператора if без else.

Подсказка: используй логический оператор "||" (или).

Требования:
•	Программа должна считывать одно число c клавиатуры.
•	Если возраст меньше 20 или больше 60, то нужно вывести фразу "можно не работать".
•	Если возраст в диапазоне от 20 до 60 (включительно), то выводить ничего не нужно.
•	В программе должен использоваться один оператор if без else и логический оператор ||.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        boolean isYoung = (age < 20);
        boolean isOld = (age > 60);
        if (isYoung || isOld)
            System.out.println("можно не работать");
    }
}