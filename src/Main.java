/*1. Функция для нахождения максимума
Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.
public class Main {
    public static void main(String[] args) {
        try {
            int result = max(150, 150); // Пример вызова функции
            System.out.println("Максимальное число: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int max(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception("Ошибка: Числа равны");
        }
        else if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}*/

/*2. Калькулятор деления
Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.
public class Main {
    public static void main(String[] args) {
        try {
            double result = division(130, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double division(double a, double b){
        if (b == 0)
        {
            throw new ArithmeticException("Ошибка: Делить на ноль нельзя");
        }
        return a / b;
    }
}*/

/*3. Конвертер строк в числа
Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.
public class Main {
    public static void main(String[] args) {
        try {
            int input = number("fef262");
            System.out.println("Конвертированное число: " + input);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
    public static int number(String input) throws NumberFormatException {
        int number = Integer.parseInt(input);
        return number;
    }
}*/

/*4. Проверка возраста
Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.
public class Main {
    public static void main(String[] args) {
        try {
            checkAge(177);
            checkAge(25);
            checkAge(-25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150.");
        }
        System.out.println("Возраст корректен: " + age);
    }
}*/

/*5. Нахождение корня
Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
public class Main {
    public static void main(String[] args) {
        try {
            double result = sqr(25);
            System.out.println("Корень из числа: " + result);

            result = sqr(-9);
            System.out.println("Корень из числа: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sqr(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Ошибка: Корня из отрицательного числа нет");
        }
        return Math.sqrt(number);
    }
}*/

/*6. Факториал
Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            int result = factorial(5);
            System.out.println("Факториал: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Ошибка: Факториал отрицательного числа невозможен");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}*/

/*7. Проверка массива на нули
Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            checkZeros(new int[] {1, 2, 3, 0});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkZeros(int[] arr) throws Exception {
        for (int num : arr) {
            if (num == 0) {
                throw new Exception("Ошибка: Массив содержит нули");
            }
        }
    }
}*/

/*8. Калькулятор возведения в степень
Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            double result = power(2, -3);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double power(double a, int b) throws Exception {
        if (b < 0) {
            throw new Exception("Ошибка: Степень отрицательная");
        }
        return Math.pow(a, b);
    }
}*/

/*9. Обрезка строки
Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            String result = trimString("Пример строки", 20);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String trimString(String str, int len) throws Exception {
        if (len > str.length()) {
            throw new Exception("Ошибка: Число символов больше длины строки");
        }
        return str.substring(0, len);
    }
}*/

/*10. Поиск элемента в массиве
Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
public class Main {
    public static void main(String[] args) {
        try {
            int index = findElement(new int[] {1, 2, 3, 4, 5}, 6);
            System.out.println("Элемент найден на индексе: " + index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findElement(int[] arr, int value) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        throw new Exception("Ошибка: Элемент не найден");
    }
}*/

/*11. Конвертация в двоичную систему
Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            String binary = toBinary(-5);
            System.out.println(binary);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String toBinary(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Ошибка: Число отрицательное");
        }
        return Integer.toBinaryString(num);
    }
}*/

/*12. Проверка делимости
Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.
public class Main {
    public static void main(String[] args) {
        try {
            checkDivisibility(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkDivisibility(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Делить на ноль нельзя");
        }
        System.out.println(a % b == 0 ? "Делится" : "Не делится");
    }
}*/

/*13. Чтение элемента списка
Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        try {
            int result = getElement(list, 6);
            System.out.println("Элемент: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getElement(List<Integer> list, int index) {
        if (index >= list.size() || index < 0) {
            throw new IndexOutOfBoundsException("Ошибка: Индекс за пределами списка");
        }
        return list.get(index);
    }
}*/

/*14. Парольная проверка
Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.
public class Main {
    public static void main(String[] args) {
        try {
            checkPassword("short");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkPassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Ошибка: Слабый пароль");
        }
        System.out.println("Пароль корректный");
    }
}*/

/*15. Проверка даты
Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        try {
            checkDate("32.12.2020");
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkDate(String date) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(date, formatter);
    }
}*/

/*16. Конкатенация строк
Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
public class Main {
    public static void main(String[] args) {
        try {
            String result = concatStrings("Hello", null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String concatStrings(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("Ошибка: Одна из строк равна null");
        }
        return a + b;
    }
}*/

/*17. Остаток от деления
Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            int result = remainder(10, 0);
            System.out.println("Остаток: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int remainder(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Ошибка: Деление на ноль");
        }
        return a % b;
    }
}*/

/*18. Квадратный корень
Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            double result = sqrt(25);
            System.out.println("Корень: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sqrt(double num) throws Exception {
        if (num < 0) {
            throw new Exception("Ошибка: Корня из отрицательного числа нет");
        }
        return Math.sqrt(num);
    }
}*/

/*19. Конвертер температуры
Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            double fahrenheit = toFahrenheit(-300);
            System.out.println("Температура в Фаренгейтах: " + fahrenheit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double toFahrenheit(double celsius) throws Exception {
        if (celsius < -273.15) {
            throw new Exception("Ошибка: Температура ниже абсолютного нуля");
        }
        return celsius * 9 / 5 + 32;
    }
}*/

/*20. Проверка строки на пустоту
Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.
public class Main {
    public static void main(String[] args) {
        try {
            checkString(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            throw new Exception("Ошибка: Строка пуста или равна null");
        }
    }
}*/





