package level04.lesson03.task04;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина),
заполненный буквой 'Q'.

Пример вывода:
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ
QQQQQQQQQQ

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник высотой 5 и шириной 10, заполненный буквами 'Q'.
•	В программе необходимо использовать вложенные циклы while (цикл в цикле).
•	Вывод на экран должен происходить в цикле while.
 */

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int n = 0;
            while (n < 10) {
                System.out.print("Q");
                n++;
            }
            System.out.println();
            i++;
        }//напишите тут ваш код

    }
}