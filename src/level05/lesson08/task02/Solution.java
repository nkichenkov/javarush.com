package level05.lesson08.task02;

/*
Потренируйся выполнять фрагмент кода во время работы программы:

Поставь break point напротив вызова метода println и запусти программу в режиме отладки.
После остановки нажми Alt+F8 (Option+F8 для macOS) и выполни следующий код:
loop.replaceAll("\\W", "").split("fahrenheit")[1]
Результат выполнения кода присвой полю result (измени исходный код).
В итоге в классе Solution должно быть только одно изменение: поле result должно быть инициализировано при объявлении.

Требования:
•	Метод main не изменяй.
•	Полю result должно быть присвоено правильное значение.
 */

public class Solution {

    public static int result = 45967;

    public static void main(String[] args) {
        String loop = "    for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
    }
}