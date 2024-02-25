package org.nikitinia.util;

import java.util.Scanner;

public class InputValue {

    public Double getDoubleValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите double значение: ");
        return in.nextDouble();
    }

    public String getStringValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите string значение: ");
        return in.nextLine();
    }

}