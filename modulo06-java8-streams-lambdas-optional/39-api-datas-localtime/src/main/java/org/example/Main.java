package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static void main() {
        long diaDeHoje = LocalDate.now().toEpochDay();
        long diaDoNascimento = LocalDate.of(2004, Month.NOVEMBER, 14).toEpochDay();

        System.out.println(diaDeHoje - diaDoNascimento);
    }
}
