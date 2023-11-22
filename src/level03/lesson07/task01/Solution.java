package level03.lesson07.task01;

import java.util.Scanner;

/*
Условие задачи:
У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
Если числа одинаковые, то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Вместо оператора if-else в программе нужно использовать тернарный оператор.
•	Функционал программы не должен измениться.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB);
    }
}