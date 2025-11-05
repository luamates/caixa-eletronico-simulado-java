package com.amates.caixaeletronico;

import java.util.ArrayList;
import java.util.Scanner;

public class CaixaEletronico {


    double saldo = 1000;
    String passCode;

    public static void main(String[] args) {

        ArrayList<Double> changesLog = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        while (true) {

            mainMenu(scanner, changesLog);





        }


    }

    public static void firstAccess(){


    }

    public static void mainMenu(Scanner scanner, ArrayList<Double> changesLog) {
        System.out.printf("===== CAIXA ELETRÔNICO =====%n");
        System.out.printf("1 - Ver saldo%n");
        System.out.printf("2 - Depositar%n");
        System.out.printf("3 - Sacar%n");
        System.out.printf("4 - Extrato%n");
        System.out.printf("5 - Sair%n");
        System.out.printf("Escolha uma opção: ");

        int userChoice = scanner.nextInt();

        switch(userChoice){

            case 1:







        }


    }

public static double viewBalance(){


        return 0;
}


public static void creditBalance(){


}


public static void debitBalance(){


}

public static void viewTransactions(){



}

public static boolean authenticate(){


        return false;
}














}
