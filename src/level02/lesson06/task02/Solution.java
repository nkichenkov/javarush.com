package level02.lesson06.task02;

/*
Заполни пробелы пустотой... или наоборот.

Используй переменную emptiness, строки с одним пробелом и конкатенацию строк, чтобы записать в переменную fullness строку
 "пустота пустота пустота".

Требования:
•	Не изменяй значение переменной emptiness.
•	Переменную fullness нужно инициализировать в одну строку, используя переменную emptiness, строки с одним пробелом и
 конкатенацию строк.
•	Программа должна выводить на экран значение переменной fullness.
 */

public class Solution {

    public static void main(String[] args) {
        String emptiness = "пустота";

        String fullness = emptiness + " " + emptiness + " " + emptiness; //напишите тут ваш код

        System.out.println(fullness);
    }
}