package level03.lesson09.task01;

import java.util.Scanner;

/*
Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
•	Если строки разные, то программа должна вывести сообщение "строки разные".
 */

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        if (a.equals(b))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}