package org.silverio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main() {
        ArrayList<Pessoa> psoa = new ArrayList<>(
                Arrays.asList(
                        new Pessoa("Ana", "Solteiro(a)"),
                        new Pessoa("Rodrigo", "Solteiro(a)"),
                        new Pessoa("Vitor", "Casado(a)"),
                        new Pessoa("Amanda", "Casado(a)")
                )
        );
        Map<String, List<Pessoa>> pessoas = psoa
                .stream()
                .collect(Collectors.groupingBy(Pessoa::getEstadoCivil));

        pessoas.forEach((str, list) -> {
                    System.out.println(str + " : ");
                    list.forEach(p -> System.out.println(p.nome));
                }
        );
    }
}
