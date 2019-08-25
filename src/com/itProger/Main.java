package com.itProger;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double x = scanner.nextDouble();
        System.out.print("Введите сумму в рублях, которую необходимо перевести: ");
        double y = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Итого: " + df.format(y/x) + " $");
    }
}
