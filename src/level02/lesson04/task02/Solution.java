package level02.lesson04.task02;

/*
Условие задачи:
В переменной number записано число.
В переменную lastDigit нужно записать последнюю цифру этого числа.
Для вычисления используй переменную number и оператор «остаток от деления».
Для объявления и инициализации lastDigit используй одну команду.

Подсказка: делить нужно на 10.

Требования:
•	Не изменяй значение переменной number.
•	Для вычисления lastDigit должны использоваться number и оператор «остаток от деления».
•	Программа должна выводить на экран значение переменной lastDigit.
 */

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10;

        System.out.println(lastDigit);
    }
}