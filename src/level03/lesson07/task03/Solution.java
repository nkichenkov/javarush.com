package level03.lesson07.task03;

import java.util.Scanner;

/*
Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
равны ли эти числа с точностью до одной миллионной.

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Если числа равны, то программа должна вывести сообщение "числа равны".
•	Если числа не равны, то программа должна вывести сообщение "числа не равны".
•	Точность сравнения должна достигать одной миллионной (0.000001).
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (Math.abs(b - a) < 0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}