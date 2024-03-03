package org.nikitinia.util;

import org.nikitinia.exception.BusinessException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/*
 * Что -> Утилита для обработки входного значения с клавиатуры;
 * Для чего -> Получить данные с клавиатуры;
 * Реализация -> В виде класса с методом, который получает на вход значение, пытается его привести к конкретному типу.
 В случае, если введенное значение не соответствует требуемому типу, повторяем, пока не введем корректное значение;
 * В чем выгода -> Удобство реализации и манипулирования конкретными классами исполнителями;
 * */
public class InputValue {

    public Double getDoubleValue() {
        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        String value;
        Double valueDouble = null;
        int i = 0;
        while (repeat && i <= 2) {
            i++;
            System.out.println("Введите double значение (3 попытки): ");
            try {
                repeat = false;
                value = in.nextLine();
                valueDouble = Double.valueOf(value);
            } catch (NumberFormatException | NoSuchElementException exception) {
                repeat = true;
            }
        }

        if (null == valueDouble) {
            throw new BusinessException("Input value is not a double");
        }

        return valueDouble;
    }

}