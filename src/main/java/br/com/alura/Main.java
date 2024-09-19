package br.com.alura;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            List<Integer> numbers = new ArrayList<>();
            int sum = 0;


            System.out.print("Informe a quantidade de números que deseja somar: ");
            int quantidade;
            try {
                quantidade = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Informe apenas valores inteiros! - " + ex.getMessage());
                scanner.nextLine();
                continue;
            }

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Informe o valor que deseja inserir: ");
                try {
                    numbers.add(scanner.nextInt());
                    scanner.nextLine();
                } catch (InputMismatchException ex) {
                    System.out.println("Informe apenas valores inteiros! - " + ex.getMessage());
                    scanner.nextLine();
                    i--;
                }
            }

            for (int number : numbers) {
                sum += number;
            }

            System.out.println("----------------------------------------");
            System.out.println(numbers + " soma desses valores é = " + sum);
            System.out.println("----------------------------------------");

            System.out.println("\nDeseja continuar? (s/n)");
            String resp = scanner.nextLine().trim().toUpperCase();
            if (resp.equals("N")) {
                System.out.println("Saindo....");
                break;
            } else if (!resp.equals("S")) {
                System.out.println("Informe apenas as letras 'S' para continuar e 'N' para sair.");
            }
        }
    }
}
