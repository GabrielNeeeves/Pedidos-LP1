import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double lista = 0;
        boolean exit = false;
        
        while(!exit) {
            System.out.println("Digite uma ou mais opções: ");
            System.out.println("1. Almoço Self-Service => R$ 25,00");
            System.out.println("2. Prato Feito => R$ 20,00");
            System.out.println("3. Bebida lata => R$ 8,00");
            System.out.println("4. Água => R$ 3,00");
            System.out.println("5. Doces => R$ 2,50");
            System.out.println("9. Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    lista += 25;
                    System.out.println("Self-Servide adicionado.");
                    System.out.println("O valor atual é: R$ "+lista);
                    break;
                case 2:
                    lista += 20;
                    System.out.println("Prato feito adicionado.");
                    System.out.println("O valor atual é: R$ "+lista);
                    break;
                case 3:
                    lista += 8;
                    System.out.println("Bebida lata adicionado.");
                    System.out.println("O valor atual é: R$ "+lista);
                    break;
                case 4:
                    lista += 3;
                    System.out.println("Água adicionado.");
                    System.out.println("O valor atual é: R$ "+lista);
                    break;
                case 5:
                    lista += 2.50;
                    System.out.println("Doces adicionado.");
                    System.out.println("O valor atual é: R$ "+lista);
                    break;
                case 9:
                    exit = true;
                    System.out.println("Saiu");
                    break;
                default:
                    System.out.println("Valor inválido. Tente novamente.");
            }
        }
        System.out.println("Valor total: R$ "+lista);
            
        scanner.close();
        
    }
}
