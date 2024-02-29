package org.nikitinia.util;

import org.nikitinia.exception.BusinessException;

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
        Double value = null;
        int i = 0;
        while (repeat && i <= 2) {
            i++;
            System.out.println("Введите double значение (3 попытки): ");
            String inputValue = in.nextLine();
            System.out.println(inputValue);
            try {
                repeat = false;
                value = Double.parseDouble(inputValue);
            } catch (NumberFormatException exception) {
                repeat = true;
            }
        }

        if (null == value) {
            throw new BusinessException("Input value is not a double");
        }

        return value;
    }

}