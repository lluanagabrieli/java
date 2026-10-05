package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main (String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /** ALGORITMO
         * Receber todos os dados via input
         * Validar cada campo em um catch
         * */

        String nome = "";
        int idade = 0;
        double altura = 0;

        System.out.println("Digite o seu nome");

        while(true) {
            nome = scanner.next();

            if(nome.isBlank()) {
                System.out.println("Nome inválido. Digite novamente");
            }
            else {
                break;
            }
        }

        System.out.println("Digite a sua idade");
        while(true) {
            try {
                idade = scanner.nextInt();

                if(idade <= 0) {
                    System.out.println("Idade inválida. Digite novamente");
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Idade incorreta. Digite novamente");
                scanner.next();
            }
        }

        System.out.println("Digite a sua altura");
        while(true) {
            try {
                altura = scanner.nextDouble();

                if(altura <= 0) {
                    System.out.println("Altura incorreta. Digite novamente");
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Altura incorreta. Digite novamente");
                scanner.next();
            }
        }


        System.out.println("Olá, me chamo " + nome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        scanner.close();
    }
}
