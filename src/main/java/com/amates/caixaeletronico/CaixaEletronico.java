package com.amates.caixaeletronico;

import java.util.ArrayList;
import java.util.Scanner;

public class CaixaEletronico {


    static double saldo = 1000;
    static String passCode;
    static boolean menuSelectionContinue = true;

    public static void main(String[] args) {

        ArrayList<Double> changesLog = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        firstAccess(scanner);

        while (menuSelectionContinue) {

            mainMenu(scanner, changesLog);


        }


    }

    public static void firstAccess(Scanner scanner) {
        System.out.printf("===== PRIMEIRO ACESSO À CONTA =====%n");
        System.out.printf("Como é seu primeiro acesso, é necessário definir uma senha.%n");

        while (true) {
            System.out.printf("Digite a senha: %n");
            String pass1 = scanner.next();

            System.out.printf("Repita a senha: %n");
            String pass2 = scanner.next();

            if (pass1.equals(pass2)) {
                passCode = pass1;
                System.out.printf("%n%nSENHA DEFINIDA COM SUCESSO!%n");
                break;
            } else {
                System.out.printf("%n%nAS SENHAS NÃO SÃO IGUAIS!%n");
            }
        }
    }

    public static void mainMenu(Scanner scanner, ArrayList<Double> changesLog) {
        System.out.printf("%n===== CAIXA ELETRÔNICO =====%n");
        System.out.printf("1 - Ver saldo%n");
        System.out.printf("2 - Depositar%n");
        System.out.printf("3 - Sacar%n");
        System.out.printf("4 - Extrato%n");
        System.out.printf("5 - Sair%n");
        System.out.printf("Escolha uma opção: ");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                viewBalance();
                break;
            case 2:
                creditBalance();
                break;
            case 3:
                debitBalance();
                break;
            case 4:
                viewTransactions();
                break;
            case 5:
                menuSelectionContinue = false;
                break;
            default:
                System.out.printf("%n%nOpção inválida!%n%n");
        }
    }

    public static double viewBalance() {


        return 0;
    }


    public static void creditBalance() {


    }


    public static void debitBalance() {


    }

    public static void viewTransactions() {


    }

    public static boolean authenticate() {


        return false;
    }


}
